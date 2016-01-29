package khurana_Dodgeball;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * @version Nov. 2015
 * 
 * @author Christina Kemp adapted from Sam Scott
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, MouseMotionListener, FocusListener {


	boolean userCollideded = false;
	/**
	 * Width of the frame
	 */
	int width = 500;
	/**
	 * Height of the frame
	 */
	int height = 300;
	/**
	 * The number of balls on the screen.
	 */
	final int numBalls = 50;
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration =50;
	/**
	 * An array of balls.
	 */
	FlashingBall[] ball = new FlashingBall[numBalls];
	/**
	 * Counter for time
	 */
	int timer=0;



	/** main program (entry point) */
	
	/**
	 * 
	 * @param args Start of program
	 */
	public static void main(String[] args) {

		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Dodgeball");
		//Closes the game id the exit button is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Size of the frame is set to 500 by 300
		frame.setSize(new Dimension(500, 300));
		frame.setAutoRequestFocus(false);
		//The frame is set to visibler
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();


	}
/**
 * Sets up the game panel to be used
 */
	public GamePanel(){
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);
		//New balls are created with the speed of 0.1 and the colours chosen rndomly for each one
		for (int i = 0; i < numBalls; i++) {
			ball[i] = new FlashingBall(Math.random() * 256, Math.random() * 256, 0, width, 0, height);
			ball[i].setXSpeed(.1);
			ball[i].setYSpeed(.1);
			ball[i].setColor(new Color((int) (Math.random() * 256), (int) (Math
					.random() * 256), (int) (Math.random() * 256)));
		}
		//Mouse listener declarations and settings
		addMouseMotionListener(this);
		setOpaque(true);

		setVisible(true);
		this.addFocusListener(this);
		this.addMouseMotionListener(this);

		//New thread is made
		Thread gameThread = new Thread(this);
		//The thread is started
		gameThread.start();

	}

	/**
	 * Repaints the frame periodically.
	 */
	public void run() {
		while (true) {

			updateBall(ball);
			repaint();
			//System.out.println("calling");
			try 
			{
				if(true)
				{
					timer++;
					if(timer == 800 )
					{
						System.out.println("YOU WON");
					}
				}
				Thread.sleep(pauseDuration);
			} 
			catch (InterruptedException e) 
			{

			}
		}
	}
	/**
	 * Finds out if the ball is colliding with another ball, whhether it be the ball controlled by the user 
	 * If 2 balls collide, their direction changes
	 * @param ball A ball object used to make all the balls
	 */
	public void updateBall(FlashingBall[] ball)
	{

		double ball1X;
		double ball1Y;

		double ball2X;
		double ball2Y;

		double ballUserX;
		double ballUserY;




		for(int i = 0; i < ball.length-1; i++)
		{


			for(int j =0;j<ball.length-1; j++)
			{
				//X and Y values are recieved for each ball
				ball1X =  ball[i].getX();
				ball1Y = ball[i].getY();

				ball2X = ball[j].getX();
				ball2Y = ball[j].getY();

				ballUserX = ball[numBalls-1].getX();
				ballUserY = ball[numBalls-1].getY();

				//updates the speed and direction of the balls
				ball[j].updateObject();
				
				//Checks of 2 random balls have collided, if they have, then their velocities have been switched
				if(collisionOccur(ball1X,ball1Y,ball2X,ball2Y,ballUserX,ballUserY) == 1)
				{
					ball[i].setYSpeed(ball[i].getYSpeed() * -1);
					ball[i].setXSpeed(ball[i].getXSpeed() * -1);

					ball[j].setYSpeed(ball[j].getYSpeed() * -1);
					ball[j].setXSpeed(ball[j].getXSpeed() * -1);
					

				}
				//Checks of a random ball has collided witht he ball controlled by the user, if so, the the random ball's velocity is reversed
				if(collisionOccur(ball1X,ball1Y,ball2X,ball2Y,ballUserX,ballUserY) == 2)
				{
					ball[i].setYSpeed(ball[i].getYSpeed() * -1);
					ball[i].setXSpeed(ball[i].getXSpeed() * -1);
					

				}
				//Checks of a random ball has collided witht he ball controlled by the user, if so, the the random ball's velocity is reversed
				if(collisionOccur(ball1X,ball1Y,ball2X,ball2Y,ballUserX,ballUserY) == 3)
				{


					ball[j].setYSpeed(ball[j].getYSpeed() * -1);
					ball[j].setXSpeed(ball[j].getXSpeed() * -1);
				
				}

			}
		}


	}

	/**
	 * 
	 * @param ball1X X position of a random ball
	 * @param ball1Y Y position of a random ball
	 * @param ball2Y X position of another random ball
	 * @param ball2X Y position of another random ball
	 * @param ballUserX X position of user controlled ball
	 * @param ballUserY Y position of user controlled ball
	 * @return returns 1 if 2 random balls collide, 2 or 3 depending on which random ball the ball controlled by the user is collided
	 */
	public int collisionOccur(double ball1X, double ball1Y, double ball2Y, double ball2X, double ballUserX, double ballUserY )
	{
		//Uses the length of the line formula to figure out the difference in distance between 2 random balls
		double deltaY = Math.pow((ball1Y-ball2Y), 2);
		double deltaX = Math.pow((ball1X-ball2X), 2);
		double distanceBetweenBalls =Math.sqrt(deltaX + deltaY);

		//Uses the length of the line formula to figure out the difference in distance between the uer controlled balla and another one
		double userDeltaY1 = Math.pow((ball1Y-ballUserY), 2);
		double userDeltaX1 = Math.pow((ball1X-ballUserX), 2);
		double distanceBetweenUserBall1 = Math.sqrt(userDeltaX1 + userDeltaY1);

		//Uses the length of the line formula to figure out the difference in distance between the uer controlled balla and another one
		double userDeltaY2 = Math.pow((ball2Y-ballUserY), 2);
		double userDeltaX2 = Math.pow((ball2X-ballUserX), 2);
		double distanceBetweenUserBall2 = Math.sqrt(userDeltaX2 + userDeltaY2);


		/*
		 * Retruns 1 if collision between 2 random balls
		 * Returns 2 or 3 depending on user collided with which random ball
		 * Returns 0 if no colliion beween the balls occurs
		 */
		if(distanceBetweenBalls <= 10)
		{
			return 1;
		}
		else if(distanceBetweenUserBall1 <= 13)
		{
			return 2;

		}
		else if (distanceBetweenUserBall2 <=13)
		{
			return 3;

		}
		else
		{
			return 0;
		}


	}

	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//draws all the balls on the screen one by one
		for (int i = 0; i < numBalls; i++) {
			ball[i].draw(g);
		}

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//The last ball of the array is given to the user to control
		ball[numBalls-1].setY(e.getY());
		ball[numBalls-1].setX(e.getX());


	}

	@Override
	public void mouseMoved(MouseEvent e) {


	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	
}

package khurana_Sorts;
public class Sort {
	/**
	 * Swaps two elements within an array.
	 * 
	 * @param index1
	 *            The index of the first element to swap.
	 * @param index2
	 *            The index of the second element to swap.
	 * @param unsortedArray
	 *            The array in which the swapping occurs.
	 */
	private static void swap(int index1, int index2, int[] unsortedArray) {
		int temporary = unsortedArray[index1];
		unsortedArray[index1] = unsortedArray[index2];
		unsortedArray[index2] = temporary;
	}

	/**
	 * Sorts the unsorted array using selection sort.
	 * 
	 * This sorting algorithm searches for the smallest element and then swaps
	 * it with the current element until all elements have been sorted.
	 * 
	 * @param unsortedArray
	 *            The unsorted array.
	 * @return The sorted array.
	 */
	public static int[] selectionSort(int[] unsortedArray) {
		int minIndex = 0;

		for (int currentIndex = 0; currentIndex < unsortedArray.length; currentIndex++) {
			minIndex = currentIndex;
			//look for the smallest element
			for (int j = currentIndex; j < unsortedArray.length; j++) {
				if (unsortedArray[j] < unsortedArray[minIndex]) {
					minIndex = j;
				}
			}
			//swap it with the current element
			swap(currentIndex, minIndex, unsortedArray);
		}
		return unsortedArray;
	}

	/**
	 * Sorts the unsorted array using insertion sort.
	 * 
	 * This sorting algorithm iterates through the unsorted array and inserts
	 * each element in its appropriate place within the array.
	 * 
	 * @param unsortedArray
	 *            The unsorted array.
	 * @return The sorted array.
	 */
	public static int[] insertionSort(int[] unsortedArray) {

		int temporary;
		int j = 0;
		for (int i = 1; i < unsortedArray.length; i++) {
			temporary = unsortedArray[i];
			//shift all elements over until a free space is made where it should be.
			for (j = i - 1; j >= 0 && unsortedArray[j] > temporary; j--) {
				unsortedArray[j + 1] = unsortedArray[j];
			}
			//add the temporary element to the free space.
			unsortedArray[j + 1] = temporary;
		}
		return unsortedArray;
	}

	/**
	 * Sorts the unsorted array using bubble sort.
	 * 
	 * This sorting algorithm iterates through the unsorted array two items at a
	 * time, swapping them if they are out of order.
	 * 
	 * @param unsortedArray
	 *            The unsorted array.
	 * @return The sorted array.
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		for (int j = 0; j < unsortedArray.length - 1; j++) {
			for (int i = 0; i < unsortedArray.length - 1; i++) {
				//if these two elements are out of order, swap them.
				if (unsortedArray[i] > unsortedArray[i + 1]) {
					swap(i, i + 1, unsortedArray);
				}
			}
		}
		return unsortedArray;
	}

	/**
	 * Sorts the unsorted array using merge sort.
	 * 
	 * This recursive sorting algorithm works backwards from arrays of size one,
	 * merging them together appropriately until the full sized array is sorted.
	 * 
	 * @param unsortedArray.
	 *            The unsorted array.
	 * @return The sorted array.
	 */
	public static int[] mergeSort(int[] unsortedArray) {
		split(unsortedArray, 0, unsortedArray.length - 1);
		return unsortedArray;
	}

	public static void split(int[] unsortedArray, int low, int high) {

		if (low < high) {
			int mid = low + (high - low) / 2;

			split(unsortedArray, low, mid);
			split(unsortedArray, mid + 1, high);
			merge(unsortedArray, low, mid, high);
		}

	}

	/**
	 * Merges two sections of an array, separated by a central element into one
	 * larger sorted array.
	 * 
	 * @param unsortedArray
	 *            The unsorted array.
	 * @param low
	 *            The lower bound of the array.
	 * @param mid
	 *            The middle index of the array.
	 * @param high
	 *            The upper bound of the array.
	 */
	public static void merge(int[] unsortedArray, int low, int mid, int high) {
		int[] temporary = unsortedArray.clone();

		int leftIndex = low;
		int rightIndex = mid + 1;
		int i = low;

		// This loop will continue until the left index has reached the mid
		// point of the array, or the right index has reached the upper bound of
		// the array
		while (leftIndex <= mid && rightIndex <= high) {

			//If the element on the left division is smaller, add it to the array.
			if (temporary[leftIndex] < temporary[rightIndex]) {
				unsortedArray[i] = temporary[leftIndex];
				leftIndex++;
				//If the element on the right division is smaller, add it to the array.
			} else {
				unsortedArray[i] = temporary[rightIndex];
				rightIndex++;
			}
			i++;
		}

		//This loop will continue until the left index is greater than the midpoint.
		while (leftIndex <= mid) {
			unsortedArray[i] = temporary[leftIndex];
			leftIndex++;
			i++;
		}
	}

	/**
	 * Sorts the unsorted array using quick sort.
	 * 
	 * This recursive sorting algorithm uses a pivot and left and right markers
	 * to find elements that are greater than and less than the pivot, and then
	 * swaps them. The two unsorted sides are recursively sorted using quick
	 * sort until arrays of size one are reached.
	 * 
	 * @param unsortedArray
	 *            The unsorted array.
	 * @return The sorted array.
	 */
	public static int[] quickSort(int[] unsortedArray) {
		quickIteration(unsortedArray, 0, unsortedArray.length - 1);
		return unsortedArray;
	}

	/**
	 * Runs through one iteration of the quick sort algorithm.
	 * 
	 * @param unsortedArray
	 *            The unsorted array.
	 * @param leftIndex
	 *            The left index.
	 * @param rightIndex
	 *            The right index.
	 */
	public static void quickIteration(int[] unsortedArray, int leftIndex, int rightIndex) {

		int pivot = leftIndex + (rightIndex - leftIndex) / 2;
		int leftMarker = leftIndex;
		int rightMarker = rightIndex;
		int pivotElement = unsortedArray[pivot];

		// This loop will continue so long as the left marker does not meet with
		// or cross the right marker.
		while (leftMarker <= rightMarker) {

			// The left marker will progress until it finds an element equal to
			// or larger than the pivot element.
			while (unsortedArray[leftMarker] < pivotElement) {
				leftMarker++;
			}

			// The right marker will progress until it finds an element equal to
			// or smaller than the pivot element.
			while (unsortedArray[rightMarker] > pivotElement) {
				rightMarker--;
			}

			// Swap the elements and move the markers one position in their
			// respective directions if the left marker has not crossed the
			// right marker.
			if (leftMarker <= rightMarker) {
				swap(leftMarker, rightMarker, unsortedArray);
				leftMarker++;
				rightMarker--;
			}
		}

		// Call the method again for the left sub array recursively until the
		// right marker is equal to the left index.
		if (leftIndex < rightMarker) {
			quickIteration(unsortedArray, leftIndex, rightMarker);
		}

		// Call the method again for the right sub array recursively until the
		// left marker is equal to the right index.
		if (leftMarker < rightIndex) {
			quickIteration(unsortedArray, leftMarker, rightIndex);
		}
	}
}
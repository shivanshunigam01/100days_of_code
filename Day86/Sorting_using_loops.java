// Java Program to sort an elements
// by bringing Arrays into play

class loop_sort {

	// Main driver method
	public static void main(String[] args)
	{

		// Custom input array
		int arr[] = { 100,90,80,70,60,50,0,40, 30, 20, 10 };

		// Outer loop
		for (int i = 0; i < arr.length; i++) {

			// Inner nested loop pointing 1 index ahead
			for (int j = i + 1; j < arr.length; j++) {

				// Checking elements
				int temp = 0;
				if (arr[j] < arr[i]) {

					// Swapping
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			// Printing sorted array elements
			System.out.print(arr[i] + " ");
		}
	}
}

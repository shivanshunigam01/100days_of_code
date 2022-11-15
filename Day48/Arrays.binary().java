//Task- write a java program to perform the binary search in array by using Arrays.binarySearch() method....
import java.util.Arrays;


public class binary_search_array {


	public static void main(String[] args)
	{

	// Initialising the Array
		int intArr[] = { 10,20,30,40,50,60,70,80,90,100};

		Arrays.sort(intArr); //used to sort the elements of array

		int searchKey = 90; //It is the element which we want to search

		// Print the key and corresponding index
		System.out.println(
			searchKey + " found at index = "
			+ Arrays.binarySearch(intArr, searchKey));
	}
}


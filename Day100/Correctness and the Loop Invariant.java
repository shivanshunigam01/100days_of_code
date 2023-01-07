//In this HackerRank Correctness and the Loop Invariant problem, 
//In the InsertionSort code below, there is an error. Can you fix it? Print the array only once, when it is fully sorted.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numElements = in.nextInt();
        int[] array = new int[numElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int index = i;
            while (index > 0 && array[index] < array[index - 1]) {
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
        
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

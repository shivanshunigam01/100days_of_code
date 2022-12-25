/*In this Hackerrank Insertion Sort - Part 1 problem we have given a sorted list and an unsorted number in the right cell or list,
we need to insert the integer number inside the list and it needs to be remains sorted. */
import java.io.*;
import java.util.*;

public class Solution {
    public static int[] getStdinArray() {
        int[] list;
        Scanner scanner = new Scanner(System.in);
        
        list = new int[scanner.nextInt()];
        
        for (int i = 0; (scanner.hasNextInt() && (i < list.length)); i++)
            list[i] = scanner.nextInt();
        
        return list;
    }
    
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
        
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] array = getStdinArray();
        int temp;
        
        for (int i = array.length - 1; i > 0; i--) {
            temp = array[i];

            if (array[i - 1] > temp) {
                array[i] = array[i - 1];
                printArray(array);
                
                array[i - 1] = temp;
            }
        }
        
        printArray(array);
    }
}
import java.io.*;
import java.util.*;

public class Solution {
    public static int[] getStdinArray() {
        int[] list;
        Scanner scanner = new Scanner(System.in);
        
        list = new int[scanner.nextInt()];
        
        for (int i = 0; (scanner.hasNextInt() && (i < list.length)); i++)
            list[i] = scanner.nextInt();
        
        return list;
    }
    
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
        
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] array = getStdinArray();
        int temp;
        
        for (int i = array.length - 1; i > 0; i--) {
            temp = array[i];

            if (array[i - 1] > temp) {
                array[i] = array[i - 1];
                printArray(array);
                
                array[i - 1] = temp;
            }
        }
        
        printArray(array);
    }
}

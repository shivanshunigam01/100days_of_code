//In this Hackerrank Insertion Sort - Part 2 problem we have given a sorted list and we need to print the list or array after each insertion of the insertion sort
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i = 0; i < s; i++){
            ar[i] = in.nextInt();
        }
        insertionSort(ar);
    }
        
    public static void insertionSort(int[] ar){
        int a; int b;
        for(a = 0, b = a + 1; b < ar.length; a++, b++){
            int temp = ar[b];
            int i = a;
            while(i >= 0 && temp < ar[i]){
                ar[i + 1] = ar[i];
                i--;
            }
            ar[i + 1] = temp;
            for(int j = 0; j < ar.length; j++){
                System.out.print(ar[j] + " ");
            }
            System.out.print("\n");
        }
        
    }   
    
}

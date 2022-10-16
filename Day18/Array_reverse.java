/*Problem:
An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, A, of size N, each memory location has some unique index, (where 0 ≤ i ≤ N), that can be referenced as A[i](you may also see it written as Ai).
Given an array, A, of N integers, print each element in reverse order as a single line of space-separated integers.
*/
import java.util.*;

public class Solution{
  
  public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int arr[] = new int[n];
   // int arr[]= new int[n];
    for(int arr_i=0;arr_i<n;arr_i++){
      arr[arr_i]=sc.nextInt();
      
    }
    for(int i=n-1;i>=0;i-- ){
      System.out.print(arr[i]+" ");
    }
  } 
}

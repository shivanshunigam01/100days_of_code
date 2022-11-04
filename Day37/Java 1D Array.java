//In this HackerRank java 1D Array problem in the java programming language you need to create an array, capable of holding n integers. Modify the code in the loop so that it saves each sequential value to its corresponding location in the array.
//For example, the first value must be stored in a0, the second value must be stored in a1, and so on.
import java.util.*;
import java.io .*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution{
  public static void main (String[] args){
    Scanner scan=new Scanner(System.in);
    //double payment=scan.nextInt();
    int n=scan.nextInt();
    int[] a=new int [n];
    for(int i=0;i<n;i++){
      a[i]=scan.nextInt();
      
    }
  scan.close();
  for(int i=0;i<a.length;i++){
    System.out.println(a[i]);
  }
  
    
  }
}

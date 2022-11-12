//The code above creates a Scanner object named Scanner and uses it to read a String and an int. 
 //It then closes the Scanner object because there is no more input to read, and prints to stdout using
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

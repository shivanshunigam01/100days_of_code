/*In this HackerRank java List problem in the java programming language you have Given a list, L, of N integers, perform Q queries on the list. 
Once all queries are completed, print the modified list as a single line of space-separated integers.*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int v = sc.nextInt();
            list.add(v);
        }
        int m = sc.nextInt();
        while (m-- > 0) {
            String s = sc.next();
            if (s.equals("Insert")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                list.add(a, b);
            } else {
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        for (Integer i : list) {
            System.out.print(i+" ");
        }
        
    }
}

/*In this HackerRank in a String! the problem, For each query, print YES on a new line if the string contains hackerrank, 
otherwise, print NO.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String k = "hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            int index = 0;
            for (int i = 0; i < s.length(); i++) {
                if (index==8) {
                    break;
                }
                if (s.charAt(i)==k.charAt(index)) {
                    index++;
                }
            }
            if (index==8) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

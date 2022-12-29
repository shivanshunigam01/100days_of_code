/*In this HackerRank Funny String, problem Determine whether a given string is funny. If it is, return Funny, 
otherwise, return Not Funny.*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        Solution p = new Solution();
        for (int i = 0; i < test_cases; i++) {
            String str = sc.next();
            p.isFunny(str);
        }
    }

     void isFunny(String str) {
        int str_len = str.length();

        int i = 1, j = str_len -1;
        boolean flagFound = false;
        while (i < str_len && j > 0) {
            int diff = Math.abs((int) str.charAt(i) - str.charAt(i - 1));
            int rev_diff = Math.abs( (int) str.charAt(j) - str.charAt(j - 1) );
            if(rev_diff != diff) {
                flagFound = true;
                break;
            }

            i++;
            j--;
        }

        if(flagFound) System.out.println("Not Funny");
        else System.out.println("Funny");
    }
}

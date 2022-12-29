//In this HackerRank CamelCase problem, you have Give s,
// determine the number of words in s.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String p = s.toUpperCase();
        int l = s.length();
        int ans = 1;
        for (int i = 0; i < l; i++) {
            if (p.charAt(i) == s.charAt(i)) ans++;
        }
        
        System.out.println(ans);
    }
}

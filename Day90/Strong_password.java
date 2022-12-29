//In this HackerRank Strong Password problem, Give the string she typed,
//can you find the minimum number of characters she must add to make her password strong.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        boolean lowercase = false;
        boolean uppercase = false;
        boolean number = false;
        boolean special = false;
        char[] schars = "!@#$%^&*()-+".toCharArray();
        Set<Character> cs = new HashSet<>();
        for (char c : schars) {
            cs.add(c);
        }
        for (int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if (c >= '0' && c <= '9') number = true;
            if (c >= 'a' && c <= 'z') lowercase = true;
            if (c >= 'A' && c <= 'Z') uppercase = true;
            if (cs.contains(c)) special = true;
        }
        int need = 0;
        need += lowercase ? 0 : 1;
        need += uppercase ? 0 : 1;
        need += number ? 0 : 1;
        need += special ? 0 : 1;
        return n + need < 6 ? 6 - n : need;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}

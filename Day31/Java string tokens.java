/*In this HackerRank java String Tokens problem in the java programming language you have Given a string, S, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc= new Scanner(System.in);
     String S= sc.nextLine();
     String[] tokens= S.split("[^a-zA-Z]");
     int numTokens=0;
     
     for(int i=0;i<tokens.length;++i)
     if(tokens[i].length()>0)
     numTokens++;
     
     System.out.println(numTokens);
     for(int i =0;i<tokens.length;++i)
     if (tokens[i].length()>0)
     System.out.println(tokens[i]);
    
    }
}

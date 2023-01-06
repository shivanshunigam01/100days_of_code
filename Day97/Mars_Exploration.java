//In this HackerRank Mars Exploration problem, 
//you have Given the signal received by Earth as a string, determine how many letters of the SOS message have been changed by the radiatio
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count =0;
        for(int i=0;i<S.length();i =i+3){
            if(S.charAt(i)!='S'){
                count++;
            } 
            if(S.charAt(i+1)!='O'){
                count++;
                
            }
            
            if(S.charAt(i+2)!='S'){
                count ++;
            }
            
        }
        
        System.out.println(count);
        
    }
}

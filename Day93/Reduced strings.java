/*In this HackerRank Super Reduced String problem, you need to Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them. Delete as many characters as possible using this method and return the resulting string.
 If the final string is empty, return Empty String*/

import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String [] args){
		/*FileReader fr = null;
		try {
			fr = new FileReader("/Users/pkahrl/Documents/eclipse-workspace/Comp/src/kahrl/prob1/input.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner in = new Scanner(fr);*/
		Scanner in = new Scanner(System.in);
		reduceString(in.nextLine());
		
		
		
	}
	
	static void reduceString(String s) {
		boolean found = false;
		for (int i = 0; i < s.length() - 1; i++) {
			String a = s.substring(i, i + 1);
			String b = s.substring(i + 1, i + 2);
			if (a.equals(b)) {
				s = s.substring(0, i) + s.substring(i + 2, s.length());

				reduceString(s);
				found = true;
				break;
			}
		}
        if(!found){
        	if(s.isEmpty()){
        		System.out.println("Empty String");
        	} else {
		        System.out.println(s);
        	}
        }

	}

}

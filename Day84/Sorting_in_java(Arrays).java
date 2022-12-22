/*In this HackerRank Big Sorting problem, Consider an array of numeric strings where each string is a positive number with anywhere from 1 to (10)power 6 digits. 
Sort the array's elements in non-decreasing, or ascending order of their integer values and return the sorted array. */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        Map<Integer, ArrayList<String>> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            ArrayList<String> mapValue = map.get(unsorted[i].length());
            if(mapValue == null) {
                mapValue = new ArrayList<>();
                mapValue.add(unsorted[i]);
                map.put(unsorted[i].length(), mapValue);
            } else {
                mapValue.add(unsorted[i]);
            }
        }
        
        for(ArrayList<String> list : map.values()) {
            Collections.sort(list);
        }
        
        for(Integer i : map.keySet()) {
            System.out.println(Arrays.toString(map.get(i).toArray(new String[0])).replaceAll("[\\[\\],]", "").replaceAll(" ", "\n"));
        }
    }
}

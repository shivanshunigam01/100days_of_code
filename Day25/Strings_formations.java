//Task- Write a java program to show the vairous strings formation in java
public class Main
{
	public static void main(String[] args) {
	    String a="Vellore institute of technology";
	    String b="Bhopal";
	    String c=  "   Shivanshu       ";
	    String d= "kite";
		System.out.println(a.toUpperCase());//Changes the string into UpperCase
		System.out.println(b.toLowerCase());//Changes the string into toLowerCase
		
		System.out.println(c.concat(b));//Merges the selected String
		System.out.println(b.length());//Caclulates the string size
		
		System.out.println(c.trim());//Trims the extra spaces which are present in the string
		System.out.println(a.charAt(3));//Prints the entered index no. if the string a
		System.out.println(b.indexOf("p"));//Prints the index of string b when pointers points the character p
		System.out.println(a.equals(b));//Checks both the strings that the are equals to each other or not if yes then print "true" else "False"
		System.out.println(d.replace('k','M'));//Replaces the entered character with the another word 
	}
}

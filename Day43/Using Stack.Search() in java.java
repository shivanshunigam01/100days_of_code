// Java code to demonstrate search() method
import java.util.*;

public class Stack_Demo {
	public static void main(String[] args)
	{

		// Creating an empty Stack
		Stack<String> STACK = new Stack<String>();

		// Stacking strings
		STACK.push("Hi");
		STACK.push("This");
		STACK.push("Is");
		STACK.push("Shivanshu");
		STACK.push("Nigam");

		// Displaying the Stack
		System.out.println("The stack is: " + STACK);

		// Checking for the element "4"
		System.out.println("Does the stack contains 'Hi'? "
									+ STACK.search("Hi"));
		// Checking for the element "Hello" if not got then prints -1
		System.out.println("Does the stack contains 'Hello'? "
									+ STACK.search("Hello"));

		// Checking for the element "Geeks"
		System.out.println("Does the stack contains 'Shivanshu'? "
									+ STACK.search("Shivanshu"));
	}
}

// Java program to add the
// elements in the stack
import java.io.*;
import java.util.*;
  
class StackDemo {
    
      // Main Method
    public static void main(String[] args)
    {
  
        // Default initialization of Stack
        Stack stack1 = new Stack();
  
        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<String>();
  
        // pushing the elements
        stack1.push(0);
        stack1.push("A");
        stack1.push("B");
  
        stack2.push("AA");
        stack2.push("BB");
        stack2.push("CC");
  
          // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
    }
}

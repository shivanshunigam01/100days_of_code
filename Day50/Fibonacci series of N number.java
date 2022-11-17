import java.util.*;
class Fibonacci_series{
	public static void main(String[] args) {
		int  a=0, b=0, c=1;
		Scanner sc=new Scanner(System.in); //It is used for taking input from the user 
		System.out.print("The Fibonacci series of N is :"); //Message for the user to enter the number 
		int n=sc.nextInt();

		for(int i =0; i<=n;i++){ /* This is used to compare the N(input) with the ith number and if the condition
									satisfy then increment the ith number with 1 */
			

			a=b;
			b=c;
			c=a+b; //This operations peforms the Fibonacci_series portion 
		

			System.out.print(a+" "); // Used to print the Fibonacci Series to the user
		}
	}
}

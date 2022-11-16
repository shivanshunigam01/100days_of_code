import java.util.Scanner;
class vowel_consonent{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the Character you want to check:");
		char check=sc.next().charAt(0); //Takes inpput from the user as Character data type


		 if(check=='a'|| check=='e' || check=='i' || check=='o' || check=='u'){ //check the char condition with the Lowercase vowels
      
		 	System.out.println("yes it is a vowel");

		 }
		 else if( check == 'A' || check == 'E' || check == 'I'
            || check == 'O' || check == 'U') { ////check the char condition with the Uppercase vowels
		 	System.out.println("yes it is also vowel");
		 }

		 else if (sc.hasNextInt()) //Checks weather the entered input is a input if yes then prints "It is a Integer"
		 {
		 	System.out.print("it is a integer");
		 }

		 else

		 	System.out.println("oops! it is a consonent"); //else print the entered number is consonent 

	}
}

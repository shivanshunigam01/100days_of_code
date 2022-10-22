//Write a java program as same as the concept of Rock peaper scissor game that you had played before on chidhood inludng all the three itmes which is :
//Rock, paper & last scissor
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to this game");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter \n 1 for rock\n 2 for paper\n 3 for scissor");
       int user=sc.nextInt();
       Random ran=new Random();
       int comp=ran.nextInt(3);
                  System.out.print("Computer Selects");

       if(comp==1)
       {
           System.out.println("Rock");
       }
       else if(comp==2)
       {
           System.out.println("Paper");
       }
       else if(comp==3)
       {
           System.out.println("Scissor");
       }
       
       if(user==comp)
       {
           System.out.println("Game is Draw");
           
       }
       else if(user==1 && comp==3 || user==2 && comp==1 || user==3 && comp==2)
       {
           System.out.println("You Win!");
           
       }
       else
       {
           System.out.println("Computer Win");
       }
       
    }
    
}

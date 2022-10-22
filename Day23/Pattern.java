//TASK- Write a java program to print the following pattern:
/*
A
BC
DEF
GHIJ */
public class Main
{
	public static void main(String[] args) {
	int n=4;
	char ch='A';
	for(int i =1;i<=n;i++){
	    for(int chars=1;chars<=i;chars++){
	        System.out.print(ch);
	        ch++;
	    }System.out.println();
	}
	
	
	}


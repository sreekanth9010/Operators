package operators;

import java.util.Scanner;

public class Arithematic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variables
		 int a,b;
		 //scanner class object to take input from user
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a value :");
		 a=sc.nextInt();
		 System.out.println("Enter b value :");
		 b=sc.nextInt();
		 
		 //closing the scanner object
		 sc.close();
		 System.out.println("Executing the results:");
		 System.out.println(a+b);
		 System.out.println(a-b);
		 System.out.println(a*b);
		 System.out.println(a/b);
		 System.out.println(a%b);
		

	}

}

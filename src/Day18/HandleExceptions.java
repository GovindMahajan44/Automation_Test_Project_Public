package Day18;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Program is started....");
		
		Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		
		try 
		{
		System.out.println(100/num);	
		}
		catch(ArithmeticException e) 
		{
			System.out.println("invalid data...");
		}
		
		System.out.println("Program is completed....");
		System.out.println("Program is exited....");
		
		
	}

}

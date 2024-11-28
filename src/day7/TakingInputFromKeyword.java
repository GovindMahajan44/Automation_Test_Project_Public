package day7;

import java.util.Scanner;

public class TakingInputFromKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

		System.out.println("enter the number");	
	    int num = sc.nextInt();
	    System.out.println(num);

	
	    System.out.println("Enter Decimal Number");
	    double tum =sc.nextDouble();
	    System.out.println("Give value is..."+tum);
		
		
		System.out.println("Enter you city");
		String city=sc.next();
		System.out.println("Your city is.. "+city);
		
		
	}

}

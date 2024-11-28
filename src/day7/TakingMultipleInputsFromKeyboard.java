package day7;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Frist number..");
		int num1= sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int num2= sc.nextInt();
		
		System.out.println(num1+num2);
		
		
	}

}

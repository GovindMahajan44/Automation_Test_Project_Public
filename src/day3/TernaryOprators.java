package day3;

public class TernaryOprators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ternory opretor is  give only largest value
		// var=exp ? result1: result2 ;
		
		//exmple1
		int a=200, b=100;
		int d=(a<b)? a:b;
		System.out.println(d);
		
		// Example2
		int x=(1==1)?100:200;
		System.out.println("the value of x is="+x);
		
		//Exmple3
		int person_age=30;
		
		String res=(person_age>=18)? "Able to vote": "Not able to vote";
		System.out.println(res);
		
		
		
		
		
	}

}

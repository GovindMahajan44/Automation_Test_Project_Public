package day3;

public class AssinmentOprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Assinement oprator = += -= *= /=  %=
		//
		
		int a=10;
		// a+=5;
	    System.out.println(a);
		a-=5;
		System.out.println(a);
		a=a-5;
		System.out.println("A value is"+a);
		int b=10;
		b+=5;
		System.out.println("B value is"+b); // incress kela
		int c=20;
		c*=2;
		System.out.println("C value is"+c); // Gunakar kela
		int d=20;
		d/=2;
		System.out.println("D value is"+d); //bhagakar kela
		int e=30;
		e%=5;
		System.out.println("E value is"+e); //percentage kalda
	   
		// Relational operators  > >= <= != ==
		// Return Boolean value
		
		System.out.println(a>b);
		b=20;
		System.out.println(a>=b);  // False
		System.out.println(a<=b);  //  True
		System.out.println(a!=b); //true
		System.out.println(a==b);// false
		
		// logical operators  && || !
		// Return boolean value = true or false
		// Works between 2 boolen value 
		boolean x= true;
		boolean y=false;
		System.out.println("the value is" +(x&&y)); //False
		System.out.println("the value or "+(x||y));// True
		System.out.println("the value of not equil to"+(!y)); // true
		
		boolean b1 = 10>20;
		System.out.println(b1);//False
		
		boolean b2 = 20>10;
		System.out.println(b2);	//	True
		
		
		
		
	}

}

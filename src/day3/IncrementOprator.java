package day3;

public class IncrementOprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Increment and decrement operators
		 // ++ is increment -- is decrement
		int a =10;
		a=a+1;
		System.out.println(a);
		a++;
		System.out.println(a); 
		
		//post increment operator  --case2 count chy nanatr ++ lavla
	
		int d=15;
		int govi=d++;   //this is post increment operator after asine value then we will increen the vlaue.
		System.out.println("value of d"+govi);
		
		
		//pre-increment Operators-- case3   count chy adi++ lavla 
		int b=14;
		int ba=++b;
		System.out.println("this is our preincrement vlaue:"+ba);
		
		// decrement opartor means -- adi lavla vlaue kami zala
		int c=17;
		int aa=--c;
		System.out.println("this is our pre decrement vlaue"+aa);
		
		// decrement opretor means --nantr lavla ki value kami hot nai
		int g=20;
		int sa=g--;
		System.out.println(sa);
		System.out.println("this is our post decrement vlaue:"+g);
				
		
		
		
		
		
		
		
		
		
		
		
	}

}

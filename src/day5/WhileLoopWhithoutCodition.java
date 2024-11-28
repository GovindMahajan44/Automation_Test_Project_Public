package day5;

public class WhileLoopWhithoutCodition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=1;
 // example 1
 /*while (true)
 {
	 System.out.println("Hello");
	 a++;
	 if (a==20) 
	 {
		 break;
	 }
	 */
 // example 2
  while (a<=20) 
     {
	  System.out.println(a);
	  a++;
     }
	// example 3
  
  int b =1;
   while (b<=10)
   {
	   System.out.println("Hello");
	   b++;
   }
	// even number print	
   int c=1;
   while (c<=10) 
   {
	   if (c%2==0)
	   System.out.println(c);
	   c++;
   }
		
		
	}

}

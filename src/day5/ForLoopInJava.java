package day5;
// for loop is very simple loop by compre with DO and while loop
public class ForLoopInJava {

	public static void main(String[] args) {
// in the for loop we can (initilization; condition ; inc/ dec) and then statment 
	//Example1  1 to 10 number 
		
		for (int i=1;i<=10;i++) 
		{
			System.out.println(i);
		}	
	//Example2 1 to 10 even number
		for(int a=2;a<=10;a+=2) 
		{
			System.out.println(a);
		}	
	//Example3 1 to 10 number indefy the odd and even number
		for (int i=1;i<=10;i++)
		{
			if (i%2==0) 
			{
				System.out.println(i+"even");
			}
			else 
			{
				System.out.println(i+"odd");	
			}	
		}
		// Desc order in for loop
		for (int q=10;q>0;q--) 
		{
			System.out.println(q);
		}
		
	
	}

}

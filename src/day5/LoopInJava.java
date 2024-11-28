package day5;

// while condition if condition is true then can perform.

public class LoopInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// while loop, Do while, for loop
		
		// while loop in java
		// example 1,2,3,......10 number
	/*int	 i=1;
	while (i<=100)     // condition
	{
	System.out.println(i);	
	i++; 
	//incremention
	}*/
	// I want to print out the hello word 10 times8 
	int a=1;
	
	while (a<5) 
	{
		System.out.println("Yes, I am Batman");
		a++;
	}
	// I want to print even number 1 to 10  //2,4,6,8,10
	int i=2;
	while (i<=10) 
	{
	    if (i%2==0)
		System.out.println(i);
		i=i+2;
	}
	// odd number print in 1 to 20 // 1,3,5,7,..19
	
	int c=1;
	while (c<=20) 
	{
		if (c%2==0)
		System.out.println(c+"even");
		
		else
		{
			System.out.println(c+"odd");
		}
		c++;
		
	}
	
	
	
	
	
	
	
	}

}

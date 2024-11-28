package day12;

public class Adder {

	int a= 10, b=20;
	
		void sum() //1 no parameters
		{
			System.out.println(a+b);
		}
	
		void sum(int x,int y) //2----- 2 parameter and object is same
		{
			System.out.println(x+y);
		}

		void sum(int x,double y) //3--- 2 Different parameter and object is same
		{
			System.out.println(x+y);
		} 
		
		void sum(double y,int x) //3--- 2 change the position of parameter and object is same
		{
			System.out.println(x+y);
		} 
}

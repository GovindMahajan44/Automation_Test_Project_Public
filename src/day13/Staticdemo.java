package day13;

public class Staticdemo {

	static int a=10; // Static Variable
	int  b=20; // non Static veriable
	
	static void m1() // static method
	{
		System.out.println("m1 Static method....");
	}
	 void m2() //non-static method method
	{
		System.out.println("m2 non-static method....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a);
		m1();
		//System.out.println(b);
	//	m2();
	}

	
}

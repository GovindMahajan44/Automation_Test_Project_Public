package day15;

class abc
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}

class xyz extends abc
{
	void m1(int a) // overriding method
	{
		System.out.println(a*a);
	}
	
	void m2 (int a, int b) // overloading method
	{
		System.out.println(a+b);
	}
}



public class OverloadingVsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		xyz xyzobj= new xyz();
		
		xyzobj.m1(10);
		xyzobj.m2(20);
		xyzobj.m2(10, 20);
		
	}

}

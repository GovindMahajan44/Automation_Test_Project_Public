package day16;

interface shape
{
	int lenght=10; //Static and final 
	int width=20; //Static and final
	
	void circle(); // abstract method
	
	default void square()
	{
		System.out.println("Default method"); // default method
	}

	static void rectangle()
	{
		System.out.println("static method"); // static method
	}
	static void triangle() 
	{
		System.out.println("this is old");
	}
	
	
}

public class InterfaceDemo implements shape{
	
	public void circle() 
	{
		System.out.println("This the circle ..abstrac method");
	}
	
	void triangle () 
	{
		System.out.println("this is... Triangle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scenario 1
		InterfaceDemo idobj= new InterfaceDemo();
		idobj.circle();
		idobj.square();
		
		shape.rectangle(); // static method can directly access from interface
		idobj.triangle();
		System.out.println(shape.lenght*shape.width);
	/*	
		// Scenario 2
		shape sh= new InterfaceDemo();
		
		sh.circle();// Abstract method
		sh.square();// Default method
	*/	shape.rectangle(); //static method can directly access from interfac
	}

}

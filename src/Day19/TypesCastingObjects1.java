package Day19;

class parent 
{
	String name= "Govind";
	void m1() 
	{
		System.out.println("This is m1 parent");
	}
}
class child extends parent 
{
	String id= "4419";
	void m2() 
	{
		System.out.println("This is m2 child");
	}
}



public class TypesCastingObjects1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// up casting 
	/*	child c= new child();
		c.m1();
		System.out.println(c.name); // parent class
		c.m2();
		System.out.println(c.id);// child class
		*/
		// Down casting --- Demo
		parent p= new parent();
		child c=(child)p;
		
		System.out.println(c.id);
		System.out.println(c.name);
		c.m1();
		c.m2();
	}

}

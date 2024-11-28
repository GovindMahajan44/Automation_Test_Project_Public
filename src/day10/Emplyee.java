package day10;

public class Emplyee {
	// Veriable
	int eid;
	String ename;
	String job;
	int sal;
	// Methods
	void desplay()
	
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emplyee emp1= new Emplyee();
		
		emp1.eid= 101;
		emp1.ename= "Govind";
		emp1.job= "QA Engineer";
		emp1.sal= 20000;
		emp1.desplay();
		
		Emplyee emp2 = new Emplyee();
		
		emp2.eid= 102;
		emp2.ename="Pravin";
		emp2.job= "Devloper";
		emp2.sal= 40000;
		emp2.desplay();
		
		
		
		
		
	}

}

package day11;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Student stu= new Student();
	// by using object reference variable	
		stu.sid= 101;
		stu.sname="Govind";
		stu.grad= 'A';
	
		stu.printStudentData();
		
	// second Approches 
		stu.Studentteam(112, "Govinda mahajan", 'D');
		stu.printStudentData();
*/
		// Thard apporoched
		// Using constructor
		Student stu= new Student(111,"Govind",'A');
		stu.printStudentData();
		
		
	}

	
	
}

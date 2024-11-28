package day10;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// dusry class madhla method ya class madhe call keli (main method)
		StudentClass stu1= new StudentClass();
		
		stu1.sid =102;
		stu1.sname= "Govind";
		stu1.grad= 'A';
		stu1.city="Pune";
		
		stu1.Printdata();
		
		StudentClass stu2= new StudentClass();
		stu2.sid =103;
		stu2.sname= "Navin";
		stu2.grad= 'B';
		stu2.city="Mumbai";
		
		stu2.Printdata();
	}

}

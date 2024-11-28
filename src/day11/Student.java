package day11;

public class Student {

	int sid;
	String sname;
	char grad;
// by using object	
	// it is only print the data
	void printStudentData() 
	{
		System.out.println(sid+" "+sname+" "+grad);
	}
	
// By using parameters 
	// It will take input and store data in veriable
	void Studentteam(int id, String name,char gr) 
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
// by using constructor
	Student(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grad= gr;
		
		
	}
}

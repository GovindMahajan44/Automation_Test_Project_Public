package day15;

public class Animal {

	String color = "white";
	
	
}
 class Dog extends Animal
 {
	String color="Black"; 
	
	void displayColors() 
	{
		System.out.println("The colors is" +super.color); // super keyword for veriable
		
	}
	 
 }
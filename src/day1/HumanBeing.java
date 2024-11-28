package day1;

public class HumanBeing {
	String name= "Govind";
	byte age; //-128 to 127
	int hieght;
	String lang = "English";
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HumanBeing human1 = new HumanBeing(); //value assine insilized
		HumanBeing humen2 =new HumanBeing();
	human1.name= "Sanket";
	humen2.age =33;
	humen2.lang= "Hindi";
	System.out.println(human1.name);
	System.out.println(humen2.age);
	System.out.println(human1.age);
	
	human1.humanBeingCanTalk();
	humen2.humanBeingCanTalk();
	
	}

	public void humanBeingCanTalk() 
	{
		System.out.println("He can speek ="+lang);
	}
	
	public void humanBeingCanRun() 
	{
		System.out.println("He can run with 10 KMPH");
	}
	
	
	
	
	
	
	
}

package Day19;

class animal {}

class Dog extends animal{}
class Cat extends animal{}


public class TypeCastingObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Rule 1
		// The type of 'd' and 'C' must  have same relationship
	/*	animal an= new Dog();
		Cat ct= (Cat)dg; // in-valid Rule 1
		animal an= new Dog();
		Cat ct= (Cat)an; // valid rule 1
		
	*/	
		// Rule 2
		// 'C' must be either same or child  of 'A'.
	/*	animal an= new Dog();
		Cat ct= (Cat)an;  // valid as per the rule2
		animal an= new Dog();
		Cat ct= (Dog)an; // In vaild as per the rule2
		*/
	}

}

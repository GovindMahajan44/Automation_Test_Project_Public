package day9;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Case 1-- sc1
	/*	String s1= "Welcome";
		String s2= "to java";
		
		System.out.println(s1==s2); //False
		System.out.println(s1.equals(s2));  // False
	*/	
//Case 2-- sc2
	/*	String s1= new String ("Welcome");
		String s2= new String ("Welcome");
		
		System.out.println(s1==s2); // False--- To compare to objects
		System.out.println(s1.equals(s2));// true-- to compare value of objects
	*/	
// Case 3 -- sc3
		String s1= "Welcome";
		String s2= new String("Welcome");
		
		System.out.println(s1==s2);// False karn s1 and s2 same naia 
		System.out.println(s1.equals(s2)); // True karn s1 and s2 chi value same ahe
		
	}

}

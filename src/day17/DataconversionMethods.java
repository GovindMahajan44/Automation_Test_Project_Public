package day17;

public class DataconversionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String --> int
		//String s= "welcome";  // cannot convert to int
		//int sint=Integer.parseInt(s);
		
	// String -->int
	/*	String s1= "10";
		String s2= "20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
	*/
	// String -->double
/*		String s1="10.23";
		String s2="12.23";
		System.out.println(Double.parseDouble(s1)+ Double.parseDouble(s2));
		*/
	// String to Boolean
	/*	String s= "False";
		System.out.println(Boolean.parseBoolean(s));
	*/	
	// int,double,boolean,char---->String
		int a=10;
		double c=10.2;
		char d='A';
		boolean b1= true;
		String s= String.valueOf(a);// Integer to String
		System.out.println(s);
		s= String.valueOf(c);// Double to String
		System.out.println(s);
		s=String.valueOf(d); // Char to String
		System.out.println(s);
		s= String.valueOf(b1); // Boolean to String
		System.out.println(s);
	}

}

package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		// String
		String s= "Welcome";
		s.concat("to java");
		System.out.println(s);  // immutable Connot change original value of s
		*/
	/*	// String Buffer -mutable
		StringBuffer s= new StringBuffer("Welcome");
		s.append("to java");
		System.out.println(s);
	*/	
		// String builder
		StringBuilder s= new StringBuilder("Welcome");
		s.append("to java");
		System.out.println(s);
		
		
		
		
		
		
	}

}

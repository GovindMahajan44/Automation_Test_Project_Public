package day8;

import java.util.Arrays;

public class StringVeriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// To check how many charector in the String we can find
		//String s = "Welcome";
		String s= new String ("welcome");
		
		s.length();
		System.out.println(s.length());
	    System.out.println("welcome".length());
	    
	// Concatnation ()----Joint Muiltiple string    
	    String s1 = "Welcome";
	    String s2 = "TO JAVA";
	    System.out.println(s1+s2);
	    
	    System.out.println(s1.concat(s2));  // Content method for add 2 Strings
	   
// Trime-----Removed Space right and left side
	     s= "   Welcome   ";
	     System.out.println(s.trim());
	     System.out.println("After Trimmed..:"+s.trim().length());
	    
// CharAt --Return a character from a string based on index
	     s= "Welcome";
	     System.out.println(s.charAt(4));
	     
//Contains () --Return true/ False
	    System.out.println(s.contains("Wel"));  // True
	    System.out.println(s.contains("come")); // True
	    System.out.println(s.contains("wel")); //False .....Only correct value is accepted
	    System.out.println(s.contains("Come")); //False
//  Replace character---
	    s="Welcome the selenim python selenim c#";
	    System.out.println(s.replace('e', 'X'));  // WXlcomX thX sXlXnim python sXlXnim c#
	    // by useing Replace
	    
// Sustring Method in java -- Substirng in main java String
	 // Starting
	 // Ending    
	  s= "Selenim";
	  System.out.println(s.substring(0, 3));//Sel
	  System.out.println(s.substring(2, 5));   // Len 
	  System.out.println(s.substring(1, 6));// eleni
	  System.out.println(s.replace('e', 'X'));// sxlxnim
	  System.out.println(s.length());
	  
	  // ToUpperCase() toLowerCase()
	  s= "Govind Mahajan";
	  System.out.println(s.toUpperCase());//GOVIND MAHAJAN
	  System.out.println(s.toLowerCase()); // govind mahajan

// Split() -split the string into multiple parts based on delimeter
	// don bhaga madhe vibhagni karta yete  
 s= "Gmahajan16@gmail.com";
 String a[]= s.split("@");
 System.out.println(a[0]); // Gmahajan16
 System.out.println(a[1]); // Gmail.com
 
 s= "What@Gmail.com";
 String c[]= s.split("@");
 System.out.println(c[0]); // What 
 System.out.println(c[1]); // Gmail.com
 System.out.println(Arrays.toString(c));// [What, Gmail.com]
	  
	
 //ex1
 // we can remove the dollar buy using replace method
	s= "$15,22,46,#13,34";
	System.out.println(s.replace("$", ""));//15,22,46
	System.out.println(s.replace("#", "")); // 15, 22, 46, 13,34
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}








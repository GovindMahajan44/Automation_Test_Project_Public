package Day18;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  s="Welcome";
		try {
	    	  System.out.println(s.length());
	      }
		catch (NullPointerException e) 
		{ 
			System.out.println("Catch block Handle exception...");
  	        System.out.println(e.getMessage());
  	     }
		finally
		{
			System.out.println("You enter enter into finally block....");
		}
		System.out.println("Finally Finished......");
	}

}

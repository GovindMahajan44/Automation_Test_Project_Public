package Day18;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program started...");
		System.out.println("Program in progress...");
		try 
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)  // Taking Break of 5 minutes
		{
			
		}
		
		System.out.println("Program Finished...");
		System.out.println("Program in Exited...");
	}

}

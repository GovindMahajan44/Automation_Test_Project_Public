package day7;

public class FindHowManyDuplicateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,10,20,20,20,30,30,10,10};
		int num =10;
		int count=0;
		for (int value:a) 
			
		{
			if (value==num) 
			{
			count++;
			}
		}
		System.out.println(count);
		
		
		
		
	}

}

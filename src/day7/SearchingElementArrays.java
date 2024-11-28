package day7;

public class SearchingElementArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// find the element in the list and after match it then exit the loops automaticlly
		int a[]= {10,20,30,40,50,60,30,30};
		int search_element= 30;
		boolean status=false;  // false - not found true--Found
	/*	
		for (int i=0;i<a.length;i++) 
		{
			if (a[i]==search_element) 
			{
				System.out.println("The value is match:"+a[i]);
				break;
			}
			else {System.out.println("the value is not matched");}
	*/			
		
		for (int x:a) 
		{
			if (x==search_element) {
				System.out.println("element is found");
			    status=true;
			    break;
			}
		}
		
      if (status==false) 
      {
    	  System.out.println("element is not found");
      }
	}

}

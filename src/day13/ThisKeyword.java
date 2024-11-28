package day13;

public class ThisKeyword {
	
	int x,y; // class veriable / instance variable
	
	ThisKeyword(int a,int b)
	{
		x=a;
		y=b;
	}

	void Display() 
	{
	System.out.println(x);
	System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword th = new ThisKeyword(100,200);
		
		th.Display();
		
		
		
		
	}

}

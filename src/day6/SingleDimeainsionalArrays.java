package day6;
/*
 1. Declare an Arrays
 2. Add values into arrays
 3. Find the size of an arrays
 4. Read single value  from an arrays
 5. Read multiple value from an arrays
  */
public class SingleDimeainsionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// approch 1
		int a[]=new int [5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
// Approch 2
		int b[]= {100,200,300,400,500};
		
	/*	// find length of arrays
		System.out.println("the Length of arrays is"+b.length);
		System.out.println(b[2]);
		
		*/
		// normal for loop
		for (int c=0;c<=a.length-1;c++) 
		{
		System.out.println(a[c]);	
		}
		// inhanced for loop/ for each loop
		for (int x:a) {System.out.println("inhaced looping"+x);}
		
	}

}

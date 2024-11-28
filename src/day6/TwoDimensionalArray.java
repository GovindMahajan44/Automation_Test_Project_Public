package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// two demension arrays
		
// Approach 1		
	//	int a[][]= new int [1][2];
	/*	
	a[0][0]=100;
	a[0][1]=200;
	
	a[1][0]=300;
	a[1][1]=400;
	
	a[2][0]=500;
	a[2][1]=600;
	*/
	int a[][]= { {100,200},{300,400},{500,600}  };	
	
	//find size of arrays 
		System.out.println("length of rows:"+a.length);
		System.out.println("length of column:"+a[0].length);
	// normal for
	//R represting row number
	/*for (int r=0;r<=3;r++)  //0
	{
		for (int c=0;c<=1;c++) //0
		{
			System.out.println(a[r][c]+" ");
		}
		System.out.println();
	}
	*/
/*	for (int r=0;r<=a.length-1;r++)  //0
	{
		for (int c=0;c<=a[r].length-1;c++) //0
		{
			System.out.println(a[r][c]+" ");
		}
		System.out.println();
	}
	*/	
	//enhanced for loop
	
for (int arr[]:a) 
		{
			for (int x:arr) 
			{
			System.out.print(x+ " ");	
			}
			System.out.println();
		}
		
		
	}

}

package day12;

public class Box {
 double width , hight, depth;
 
	
	void box() 
	{
		width=0;
		hight=0;
		depth=0;
		
		width=hight=depth=0;  // we can assigne this value aslo
	}
	void box(double w, double h, double d) 
	{
		width=w;
		hight=h;
		depth=d;
	}
	void box(double h, int w, double d) 
	{
		width=h;
		hight=w;
		depth=d;
	}
	/*Box(double len)
	{
		width=hight=depth=0;
		
	}
	
	*/
	
	
}
package Day19;

//UpCasting --Converting value from smaller to---> larger
// int ---> Long
// Float--->double



//UpCasting --Converting value from Large to---> Smaller

//Long ---> int
//double---> Float

public class TypeCastingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		UpCasting --Converting value from smaller to---> larger
		/*	int intvalaue=100;
		long longvlaue=intvalaue;
		System.out.println(intvalaue);*/
	/*	
		float floatvalue=10.3f;
		double dvalue= floatvalue;
		System.out.println(floatvalue);
		*/
		// Downcasting ---> manually ---->larger to smaller
		
		long longvl= 10000;
		int intvalue=(int)longvl;
		
		// example 1 --> Up- casting
		
		int i= 100;
		double d=i;
		System.out.println(d); // 100.0 value return
		
		// example 2 --> Down-casting
		
		double e= 10.3;
		int w= (int)e;
		System.out.println(w);// 10 value return
		
		
	}

}

package day12;

public class AdderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder addobj= new Adder();
		
		addobj.sum(); // no parametors only addition
		addobj.sum(10, 22);// two same parametors int int is same
		addobj.sum(10, 12.44);// int and double 2 diffrent formate 
		addobj.sum(10.22, 12);// Double and int 2 switch parametors formate
	}

}

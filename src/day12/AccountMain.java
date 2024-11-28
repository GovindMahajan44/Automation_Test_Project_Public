package day12;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac = new Account();
		
		ac.setAccno(123456789);
		System.out.println(ac.getAccno());
		ac.setAmount(3248484.43);
		ac.setAname("Govind");
		
		System.out.println(ac.getAmount());
		System.out.println(ac.getAname());
		
		
		
		
	}

}

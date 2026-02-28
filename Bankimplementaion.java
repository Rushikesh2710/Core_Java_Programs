package Oops;

public class Bankimplementaion extends Bank {

	@Override
	void bankbalance() {
		// TODO Auto-generated method stub
		System.out.println("Bank balance is:"+50000);
	}

	public static void main(String[] args) {
		Bankimplementaion b1=new Bankimplementaion();
		
		b1.bankbalance();
	}
}

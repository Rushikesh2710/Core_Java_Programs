package Oops;

public class methodoverriding {
	void payment() {
		System.out.println("Payment by debit card");
	}
	void payment(int one) {
		System.out.println("Payment by credit card");
	}
	void payment(String two, int one) {
		System.out.println("Payment by UPI");
	}
	void payment(String str) {
		System.out.println("payment by wallet");
	}
	void payment(int one, String str) {
		System.out.println("Payment by cash");
	}
	public static void main(String[] args) {
		methodoverriding obj=new methodoverriding();
		obj.payment();
		obj.payment(10);
		obj.payment("hello");
		obj.payment(10,"good");
		obj.payment("good",10);
	}
}

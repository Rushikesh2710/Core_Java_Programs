package Oops;

public interface work {
	void salary();
	
	static void name() {
		System.out.println("hello sham");
	}
	default void email() {
		System.out.println("sham@gmail.com");
	}
	
	public static void main(String[] args) {
//		System.out.println("hello");
//		work one=new work();
	}
}

package Exception_handling;

public class throwkeyword extends Exception{
	public throwkeyword(String str) {
		super.getSuppressed();
	}
	public static void main(String[] args) {
		throwkeyword obj=new throwkeyword("hello");
	
		int age=10;
		if(age>18) {
			System.out.println("you are eligible for voting");
		}
		else {
			throw new ArithmeticException("you cannot vote");
		}
	}
}

package Oops;

class way{
	void display() {
		System.out.println("hello");
	}
	void display(int one) {
		System.out.println("hello students");
	}
}
class ways extends way{
	void display() {
		super.display();
		System.out.println("plane");
	}
	void display(int one) {
		System.out.println("bike students");
	}
}
public class task10 {
	public static void main(String[] args) {
		ways obj=new ways();
		obj.display();
		obj.display(10);
		
	}

}

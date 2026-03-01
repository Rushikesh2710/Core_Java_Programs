package Exception_handling;

public class demoException {
	public static void main(String[] args) {
	try {
		int num=10/0;
	}
	catch(Exception ex){
		System.out.println(ex);
	}
	System.out.println("hello monday");
}
}

package Exception_handling;

public class ArrayException {
	public static void main(String[] args) {
		int a[]=new int[2];
		a[0]=101;
		a[1]=201;
		try {
		a[2]=300;
		}
		catch(Exception e) {
			System.out.println("Exception is handled......."+e);
		}
		finally {
			System.out.println("finally block is executed");
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}

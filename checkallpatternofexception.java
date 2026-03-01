package Exception_handling;

public class checkallpatternofexception {
	public static void main(String[] args) {
		//1
//		try {
//			int num=23/0;
//		}
		
		//2
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		//3
//		try {
//			int num=23/0;
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		//4
//		try {
//			int num=23/0;
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("Program is completed");
//		}
		
		//5
//		try {
//			int num=23/0;
//		}
//		finally {
//			System.out.println("Program is completed");
//		}
		
		//6
//		int a[]=new int[2];
//		a[0]=101;
//		a[1]=201;
//		try {
//			a[2]=300;
//					try {
//						int num2=10/0;
//					}
//					catch(Exception e) {
//						System.out.println(e.getMessage());
//					}
//		}
//		catch(Exception ex) {
//			System.out.println(ex.getMessage());
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		
		//7
//		String str=null;
//		try {
//			int num=20/0;
//		}
//		catch(Exception e) {
//			try {
//				System.out.println(str.length());
//			}
//			catch(Exception ex) {
//				System.out.println(ex.getMessage());
//			}
//			System.out.println(e);
//		}
		
		//8
//		String str=null;
//		try {
//			System.out.println(str.length());
//			int num=20/0;
//		}
//		catch(ArithmaticException ok) {
//			System.out.println(ok);
//		}
//		catch(Exception ex) {
//			System.out.println(ex.getMessage());
//		}
		
		//9
//		try {
//			int num=10/0;
//		}
//		finally {
//			catch(Exception e) {
//				System.out.println(e.getMessage());
//				System.out.println("hello");
//			}
//		}
		
		//10
//		try {
//			int num=10/0;
//			finally {
//				System.out.println("hello");
//			}
//			
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

}

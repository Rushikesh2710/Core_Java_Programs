package Exception_handling;

public class nestedtry {
	public static void main(String[] args) {
		int a[]=new int[2];
		a[0]=101;
		a[1]=201;
		try {
			
			try {
				int num2=10/0;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			a[2]=300;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}

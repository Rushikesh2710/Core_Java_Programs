package Arrays;

public class Two_dim_arraydemo {
	public static void main(String args[]) {
		int students[][]= {
				{10,30,40},
				{20,50,60},
				{60,50,40}
		};
//		System.out.println(students[2][2]);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(students[i][j]+"");
				
			}
			System.out.println();
		}
	}
}

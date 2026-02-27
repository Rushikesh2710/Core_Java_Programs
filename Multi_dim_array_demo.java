package Arrays;

public class Multi_dim_array_demo {
	public static void main(String args[]) {
		int arrayofarrays[][][]= {{{ 5,6},{7,8},
									{10,11},{5,9}}};
		for(int k=0;k<arrayofarrays.length;k++) {
			for(int i=0;i<arrayofarrays[k].length;i++) {
				for(int j=0;j<arrayofarrays[k][i].length;j++) {
					System.out.print(arrayofarrays[k][i][j]+"  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

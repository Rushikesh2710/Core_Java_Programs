package collection;

import java.util.Vector;

public class listdemo3 {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("java");
		vector.add("sql");
		vector.add("c");
		System.out.println(vector);
		vector.remove(1);
		System.out.println(vector);
	}

}

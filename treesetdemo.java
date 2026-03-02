package collection;

import java.util.TreeSet;

public class treesetdemo {
	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<>();
		t1.add(20);
		t1.add(50);
		t1.add(100);
		System.out.println(t1);
		System.out.println(t1.getLast());
	}

}

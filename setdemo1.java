package collection;

import java.util.HashSet;

public class setdemo1 {
	public static void main(String[] args) {
		HashSet<Integer> num=new HashSet<>();
		
		num.add(10);
		num.add(20);
		num.add(20);
		System.out.println(num);
		num.remove(2);
		System.out.println(num);
		System.out.println(num.contains(20));
	}
	
}

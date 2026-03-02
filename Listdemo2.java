package collection;

import java.util.LinkedList;

public class Listdemo2 {
	public static void main(String[] args) {
		LinkedList<Integer> number=new LinkedList<>();
		number.add(40);
		number.add(1, 100);
		
		System.out.println(number);
		System.out.println("element at o index:"+number.get(0));
	}

}

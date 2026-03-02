package collection;

import java.util.ArrayList;
import java.util.List;

public class Listdemo1 {
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("sandip");
		names.add("bhagwat");
		System.out.println(names.contains("sandip"));
		System.out.println(names);
	}

}

package File_Handling;

import java.io.File;
import java.io.IOException;

public class filedemo {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Rushikesh Shinde\\friday9thjan.txt");
		f.createNewFile();
		if(f.canRead()) {
			String s=f.getName();
			System.out.println(s);
		}
//		f.renameTo(f);
		String s=f.getAbsolutePath();
		System.out.println(s);
		String s1=f.getCanonicalPath();
		
		System.out.println(s1);
		boolean a=f.canExecute();
		System.out.println(a);
		
		boolean b=f.canExecute();
		System.out.println(b);
		
		long space=f.getTotalSpace();
		System.out.println(space);
		
		long one=f.getUsableSpace();
		System.out.println(one);
		
		long two=f.length();
		System.out.println(two);
		
		boolean b1=f.isHidden();
		System.out.println(b1);
		
		long ten=f.lastModified();
		System.out.println(ten);
		
		boolean nine=f.mkdir();
		System.out.println(nine);
		
		
		System.out.println("created new file");
	}
}

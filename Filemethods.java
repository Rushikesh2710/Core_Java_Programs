package File_Handling;
import java.io.*;
public class Filemethods {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Rushikesh Shinde\\OneDrive\\Monday.txt");
//		f.createNewFile();
//		System.out.println("file created");
		if(f.createNewFile()) {
			System.out.println("file created");
		}
		if(f.exists()) {
			System.out.println(f.delete()+"file deleted successfully"); 
		}
		
//		System.out.println("Can read:"+f.canRead());
//		System.out.println("can write:"+f.canWrite());
//		System.out.println("Exist:"+f.exists());
//		System.out.println("file Deleted:"+f.delete());
//		System.out.println("Can read:"+f.canRead());
//		System.out.println("can write:"+f.canWrite());
//		System.out.println("Exist:"+f.exists());
	}

}

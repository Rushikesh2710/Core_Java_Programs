package File_Handling;
import java.io.*;
public class File_read {
	public static void main(String[] args) throws IOException {
		FileReader re=new FileReader("javaone.txt");
		
		int charater;
		while((charater=re.read())!=-1) {
			System.out.print((char)charater);
		}
	}
}

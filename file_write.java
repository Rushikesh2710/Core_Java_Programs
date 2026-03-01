package File_Handling;
import java.io.*;
public class file_write {
public static void main(String[] args) throws IOException {

	File f2=new File("C:\\Users\\Rushikesh Shinde\\OneDrive\\Desktop\\Core_java\\First_java_code\\javaone.txt");
	if(f2.createNewFile()) {
		System.out.println("Demo file is created");
	}
	else {
		System.out.println("demo file is not created");
	}
	
	FileWriter fw=new FileWriter("javaone.txt",true);
	fw.write("this is java one class");
	fw.close();
	System.out.println("file writing done");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	FileWriter fw=new FileWriter("C:\\Users\\Rushikesh Shinde\\OneDrive\\Monday.txt");
//	fw.write("hello goodmorning");
//	fw.write("\nhappy makarsankart");
//	fw.append("\nmonday");
//	fw.append("\nthis is om", 0,11);
//	fw.write("\nsham",0,5);
//	fw.close();
//	System.out.println("file writed succeed");
}
}

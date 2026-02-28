package Oops;
import java.util.*;
public class calculator {
	Scanner sc=new Scanner(System.in);
	calculator(){
		System.out.println("---------Enter the values for Additon --------");
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		int add=num1+num2;
		System.out.println("Addition of two Number:"+add);
		
	}
	calculator(int num){
		System.out.println("---------Enter the values for Substraction --------");
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		int sub=num1-num2;
		System.out.println("Substration of two Number:"+sub);
	}
	calculator(float one){
		System.out.println("---------Enter the values for Multiplication --------");
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		int Multi=num1*num2;
		System.out.println("Multiplication of two Number:"+Multi);
	}
	calculator(String one){
		System.out.println("---------Enter the values for Divison --------");
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		int div=num1/num2;
		System.out.println("Divison of two Number:"+div);
	}
	public static void main(String[] args) {
		calculator one=new calculator();
		calculator two=new calculator(10);
		calculator four=new calculator(10.0f);
		calculator three=new calculator("one");
		
	}
}

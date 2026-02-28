package Oops;

public class constructor {
	constructor(){
		System.out.println("This is My Constructor");
	}
	constructor(String one){
		System.out.println("Name of Constructor:"+one);
	}
	constructor(int num){
		System.out.println("Number of Constructor:"+num);
	}
	private constructor(int one , String two) {
		System.out.println("private constructor");
	}

	public static void main(String[] args) {
		constructor c1=new constructor();
		constructor c2=new constructor("second ");
		
		constructor c3=new constructor(5);
		constructor c4=new constructor(5,"hello");
	}
}

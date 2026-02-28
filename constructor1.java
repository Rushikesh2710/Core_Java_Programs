package Oops;

public class constructor1 {
	int id;
	String email;
	constructor1(int id,String email){
		this.id=id;
		this.email=email;
		System.out.println("Parameterized constructor values:"+id+"Email : "+email);
	}
	constructor1(constructor1 s){
		this.id=s.id;
		this.email=s.email;
		System.out.println("copy constructor values:"+id+"Email : "+email);
	}
	public static void main(String[] args) {
		constructor1 obj1=new constructor1(20,"user@gmail.com");
		System.out.println("-------------------------");
		System.out.println("Values of instance variables:"+"ID:"+obj1.id+"Email:"+obj1.email);
		System.out.println("-------------------------");
		constructor1 obj2=new constructor1(obj1);
		System.out.println("Values of 2nd instance variables:"+"ID:"+obj1.id+"Email:"+obj1.email);
		
	}
	
}

package Oops;

 class comapny{
	 void details() {
		System.out.println("comapany name is: Fortune cloud");
		System.out.println("comnpany loctaion:Pmc pune");
		System.out.println("Company Employee count: 30");
	}
}
class employee extends comapny{
	void details() {
	super.details();
	System.out.println("employee name: purvesh");
	System.out.println("employee salary:20000");
	System.out.println("employee designation: Trainer");
	}
}
public class methodoverridingdemo {
	public static void main(String[] args) {
		employee e1=new employee();
		e1.details();
	}
}
//achive the overriding by 4 classes

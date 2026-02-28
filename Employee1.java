package Oops;

public class Employee1 {
	String name;
	long Mo_no;
	
	Employee1(String name ,long Mo_no){
		this.name=name;
		this.Mo_no=Mo_no;
		System.out.println("Employee Details in Para_construcor:"+"name:"+name+"Mobile no:"+Mo_no);
		
		
	}
	Employee1(Employee1 a){
		this.name=a.name;
		this.Mo_no=a.Mo_no;
		System.out.println("Employee Details in Copy_construcor:"+"name:"+this.name+"Mobile no:"+this.Mo_no);
	}
	public static void main(String[] args) {
		Employee1 e1=new Employee1("purvesh",806070234);
		System.out.println("------------------------------");
		System.out.println("Employee Details in Instance:"+"name:"+e1.name+"Mobile no:"+e1.Mo_no);
		Employee1 e2=new Employee1(e1);
		System.out.println("------------------------------");
		System.out.println("Employee Details in 2ndInstance:"+"name:"+e2.name+"Mobile no:"+e2.Mo_no);
	}
}

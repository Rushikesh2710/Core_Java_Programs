package Oops;

public class encapsulation {
	private int emp_id;
	private int emp_salary;
	
	public void setemp_details(int id,int salary) {
		this.emp_id=id;
		this.emp_salary=salary;
		
	}
	public int getemp_id() {
		return emp_id;
	
		
	}
	public int getemp_salary() {
		
		return emp_salary;
		
	}
	public static void main(String[] args) {
		encapsulation e1=new encapsulation();
		e1.setemp_details(10, 100000);
		System.out.println("ID:  "+e1.getemp_id());
		System.out.println("Salary:  "+e1.getemp_salary());
	}
	
	

}

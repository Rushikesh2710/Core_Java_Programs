package Oops;

public class Admin {
	
	private String Email;
	private String password;
	
	public void setAdmin_Details(String Email,String password) {
		this.Email=Email;
		this.password=password;
		
	}
	public String getAdmin_Email() {
		return Email;
	}
	public String getAdmin_password() {
		return password;
	}
	public static void main(String[] args) {
		Admin obj=new Admin();
		obj.setAdmin_Details("admin8090@gmail.com", "admin@78");
		System.out.println("Admin Email is:  "+obj.getAdmin_Email());
		System.out.println("Admins Password is:  "+obj.getAdmin_password());
	}
	
}

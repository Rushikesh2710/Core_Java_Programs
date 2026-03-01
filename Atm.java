package Exception_handling;
//import Exception_handling.InvalidPinException;
import java.util.*;
public class Atm {
	public static void main(String[] args) throws InvalidPinException,InsufficientBalance {
		Scanner sc=new Scanner(System.in);
		
		
		int balance=2000;
		int correctpin=1234;
		System.out.println("Enter the Pin:");
		int user_pin=sc.nextInt();
		System.out.println("Enter Amount to withdraw:");
		int amount=sc.nextInt();
		if(user_pin==correctpin) {
			if(amount>balance) {
				throw new InsufficientBalance("Insuccicient balance please check balance");
			}else {
				System.out.println("money withdraw successfully");
			}
			
		}
		else 
		{
			throw new InvalidPinException("Invalid pin");
		}
		
	}
}

package Oops;

public class worker implements work {

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println(25000);
	}
	public static void main(String[] args) {
		worker w=new worker();
		w.salary();
		w.email();
		work.name();
	}
}

package Oops;

public class hybridsubchild extends hybridchild2 {
	void sc() {
		System.out.println("hello This is subchild");
	}
	public static void main(String[] args) {
		hybridsubchild obj=new hybridsubchild();
		obj.c2();
		obj.p();
		obj.sc();
		
		hybridchild1 oj=new hybridchild1();
		oj.c1();
	}
}

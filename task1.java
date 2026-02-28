package Oops;

public class task1 {
	void Area(int l,int b) {
		System.out.println("Area of Rectangle:"+(l*b));
	}
	void Area(int side) {
		System.out.println("Area of Square:"+(side*side));
	}
	void Area(float radius) {
		System.out.println("Area of Circle:"+(3.14*radius*radius));
	}
	void Area() {
		int length=20;
		int height=50;
		System.out.println("Area of Triangle is:"+(1%2*length*height));
	}
	public static void main(String[] args) {
		task1 s1=new task1();
		s1.Area();
		s1.Area(20.50F);
		s1.Area(50);
		s1.Area(30, 80);
	}
}

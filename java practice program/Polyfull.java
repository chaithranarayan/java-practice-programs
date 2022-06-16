package test;

public class Polyfull extends poly2{
	void work() {
		System.out.println("r u doing good");
	}

	public static void main(String[] args) {
		poly2 obj=new Poly3();
		obj.work();
		poly2 obj1=new Polyfull();
		obj1.work();

	}

}

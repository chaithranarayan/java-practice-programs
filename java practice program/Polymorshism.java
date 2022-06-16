package test;

public class Polymorshism {
//	method with one arg
	void buy(int amt) {
		System.out.println("the amt is "+amt);
	}
//	method with different arg
void buy(String name, int amt) {
	System.out.println("the name and amt"+ name + amt);
}
//method with different in sequence of arg
void buy( int amt ,String name) {
	System.out.println("the name and amt"+ amt + name);
}
//method with different datatype of arg
void buy( String name) {
	System.out.println("the name and amt"+ name);
}

	public static void main(String[] args) {
	Polymorshism po=new Polymorshism();
	po.buy(100);
	po.buy("food");
	po.buy(200,"doll");
	po.buy(300,"wood");

	}

}

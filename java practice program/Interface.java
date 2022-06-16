package test;

public interface Interface {
	int id=24;
	void orderFood();
	class Inter implements Interface{
		public void orderFood() {
			System.out.println("ordering food");
		}
		public static void main(String[] args) {
			Inter obj=new Inter();
			obj.orderFood();
			System.out.println(Interface.id);
		}
	}

}

public class inheritance {
    void display() {
        System.out.println("hello");
    }
}
    class in extends inheritance{
        void show(){
            System.out.println("hi");
        }

    public static void main(String[] args){

        in obj1 = new in();
        obj1.display();

    }
}

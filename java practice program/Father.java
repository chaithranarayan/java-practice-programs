public class Father {
    int age=30;
    void display(){
        System.out.println("hi");
    }
}
class Son extends Father{
    String name="chaithra";
    void show (){
        System.out.println("world");
    }
}
class daugter {
    public static void main(String[] args){
        Son s1= new Son();
        s1.display();
        System.out.println(s1.age);
    }
}

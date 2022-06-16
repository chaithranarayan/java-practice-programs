public class multiple {
    int sal=3000;
    void show(int a){
        System.out.println("hi world");
    }
}
class collage extends multiple{
    void marks(){
        System.out.println("memoriable");
    }
}
class school extends multiple{
    void show(){
        System.out.println("good days");
    }
}
class degree{
    public static void main(String[] args){
        school s1=new school();
        s1.show(10);
    }
}

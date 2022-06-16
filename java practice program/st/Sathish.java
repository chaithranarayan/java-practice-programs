package st;

public class Sathish {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
class test {
    public static void main(String[] args){
        Sathish s=new Sathish();
        s.setAge(25);
        System.out.println(s.getAge());
    }
}

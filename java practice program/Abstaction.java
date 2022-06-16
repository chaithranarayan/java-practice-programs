public abstract class Abstaction {
    abstract void work();

}
class ab1 extends Abstaction{
    void work(){
        System.out.println("all r working");
    }
}
class test
{
    public static void main(String[] args){
        ab1 obj=new ab1();
        obj.work();
        Abstaction obj2=new ab1();
        obj.work();
    }
}
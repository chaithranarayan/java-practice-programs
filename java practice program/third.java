public class third {
    int num;
    String name;
//    function without parameter
    void working(){
        System.out.println("all are working");
    }
//    fuction with parameter
    void display(int a){
        System.out.println(a);

    }
    public static void main (String[] arg){
       third obj=new third();
       obj.working();
       obj.display(3);
    }
}

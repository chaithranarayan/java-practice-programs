public class consractor {
   consractor( int a){
       System.out.println("constructor with parameter");
   }
   consractor(){
       System.out.println("without parameter");
   }
   consractor(int a,String name){
       System.out.println("diffrent in parameter");
   }
   consractor(String name,int a){
       System.out.println("consractor is differ in the order of the parameter");

   }


    public static void main(String[] args){
        consractor obj=new consractor(9);
        consractor obj2=new consractor();
        consractor obj3=new consractor("java",10);
        consractor obj4=new consractor(10,"program");
    }
}

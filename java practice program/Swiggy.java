public interface Swiggy {
    int id=123;
    void orderfood();
    class customer implements Swiggy{
        public  void orderfood(){
            System.out.println("testy");
        }
    public  static void main(String[] args){
            customer c=new customer();
            c.orderfood();
    }
    }

}

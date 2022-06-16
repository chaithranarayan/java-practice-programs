import java.io.FileInputStream;
import java.io.*;
public class FileOpen {
    public static void main(String[] args){
        char[] array=new char[40];
        try{
            FileInputStream obj=new FileInputStream("D:\\java.txt");
            InputStreamReader obj1=new InputStreamReader(obj);
            obj1.read(array);
            System.out.println(array);
            obj1.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}

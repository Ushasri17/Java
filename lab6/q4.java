import java.io.*;
class Q4 {
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("q4.java");
            int i=0;
           while((i=f.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch(Exception e){
            System.out.print("file not found");
        }
    }
}
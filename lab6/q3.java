import java.io.*;
class Q3{
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("file.txt");
            FileWriter fw=new FileWriter("file2.txt");
            FileReader f=new FileReader("file2.txt");
            int i=0;
            while((i=fr.read())!=-1){
                fw.write((char)i);
                fw.flush();
            }
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch(Exception e){
            System.out.println("file not found");
        }
        
    }
}
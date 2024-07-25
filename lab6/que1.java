import java.io.*;
public class que1 {
    public static void main(String args[]) throws Exception{
        int vowel=0;
        // try{
        File f=new File("file.txt");
        System.out.println("New file created:"+f.createNewFile());
        // }
        // catch(Exception e){
        //     System.out.println("There is a problem in creation");
        // }
        // FileOutputStream fos=new FileOutputStream("file.txt"); 
        // fos.write('v');
       FileInputStream fis=new FileInputStream(f);
        int i=0;    
    while((i=fis.read())!=-1)
    System.out.print((char)i);
    // {
    // if((char)i=='a' || (char)i=='e' || (char)i=='i' || (char)i=='o' || (char)i=='u'){
    // vowel++;
    // }
    fis.close();    

    }
    //System.out.println("The number of vowels is: "+vowel);
}

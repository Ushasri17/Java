import java.util.*;
public class RemoveSpace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String a=sc.nextLine();
        String b="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=32) b+=a.charAt(i);
        }
        System.out.println("The sentence without spaces: ");
        System.out.print(b);
    }
}

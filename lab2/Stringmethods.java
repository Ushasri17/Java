import java.util.*;
public class Stringmethods {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String a=sc.next();
        String b=sc.next();
        System.out.println("the given strings: "+a+","+b);
        b+=a.charAt(0);
        a=a.concat("pavitra");
        System.out.println("the updated strings are: "+a+","+b);
        int p=a.length();
        System.out.print("the length of a is: "+p);
        
    }
}

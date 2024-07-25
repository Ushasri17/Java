import java.util.*;
public class Alphabets {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    String a=sc.next();
    String alpha="";
    for(int i=0;i<a.length();i++){
        if(a.charAt(i)>=65 && a.charAt(i)<=90 || a.charAt(i)>=97 && a.charAt(i)<=122){
            alpha+=a.charAt(i);
        }
    }
    System.out.print("The word with only alphabets is: ");
    System.out.print(alpha);
   } 
   
}

import java.util.*;
public class Email {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter email: ");
        String a=sc.next();
        int n=a.length();
        String alpha="";
        int count=0;
        for(int i=0;i<n;i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90 || a.charAt(i)>=97 && a.charAt(i)<=122){
                alpha+=a.charAt(i);
            }
            count++;
        }
        System.out.print(alpha);
        System.out.print("\nThe no of character are: "+count);
    }
}

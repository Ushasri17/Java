import java.util.*;
public class Interleaving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String c="";
        int l=a.length();
        int m=b.length();
        for(int i=0;i<l;i++){
            c+=a.charAt(i);
            c+=b.charAt(i);
        }
        System.out.print(c);
    }
}

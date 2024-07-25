import java.lang.*;
import java.util.*;
public class NumtoRoman {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        char a[]=new char[n.length()];
        NumtoRoman p=new NumtoRoman();
        for(int i=0;i<n.length();i++){
            a[i]=n.charAt(i);
            p.Roman(a[i]);
        }
    }
    void Roman(char s){
        if(s=='1') System.out.print("I ");
        if(s=='2') System.out.print("II ");
        if(s=='3') System.out.print("III ");
        if(s=='4') System.out.print("IV ");
        if(s=='5') System.out.print("V ");
        if(s=='6') System.out.print("VI ");
        if(s=='7') System.out.print("VII ");
        if(s=='8') System.out.print("VIII ");
        if(s=='9') System.out.print("IX ");
    }
}

import java.util.*;
public class Substrings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int j=0,flag=0;
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        String a=sc.next();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==a.charAt(j)){
                for(i=1;i<s.length();i++){
                    for(j=1;j<a.length();j++){
                       if(s.charAt(i)!=s.charAt(j)){
                        flag=1;
                        break;
                       } 
                    }
                }
            }
        }
        if(flag!=1) System.out.println("The String is not substring of given String");
        else System.out.println("The String is substring of given string");
    }
}

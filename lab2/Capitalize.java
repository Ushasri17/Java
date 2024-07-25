import java.util.*;
public class Capitalize {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a=sc.nextLine();
        String b="";
        if((char)(a.charAt(0))<='z'&& (char)(a.charAt(0))>='a'){
        b+=(char)(a.charAt(0)-32);
        }
        else{
            b+=(char)(a.charAt(0));
        }
        int j=0;
            for(int i=0;i<a.length();i++){
            if(a.charAt(i)==32){
                b+=a.charAt(i);
                j=i+1;
                b+=(char)(a.charAt(j)-32);
            }
            else{
                if(j==i)
                continue;
                b+=a.charAt(i);
            }
           
        }
        System.out.print(b);
}
}

import java.util.*;
import java.math.*;
public class Armstrong {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<=n;i++){
        int k;
        k=Armstrong_num(i);
        if(i==k) System.out.print(i+" ");
    }
}
    public static int Armstrong_num(int n){
        int t=n,count=0,p=n,s=0;
        while(n!=0){
            int remainder=n%10;
            count++;
            n=n/10;
        }
        while(p!=0){
            int r=p%10;
            s=s+(int)(Math.pow(r,count));
            p=p/10;
        }
    return s;
}}




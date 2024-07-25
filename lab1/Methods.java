import java.util.*;
class Methods{
        int Add(int a,int b){
        int sum=a+b;
        return sum;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int a,b,sum;
        Methods obj1=new Methods();
        a=sc.nextInt();
        b=sc.nextInt();
        sum=obj1.Add(a,b);
        System.out.print(sum);
    }
}

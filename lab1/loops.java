import java.util.*;
class Loops{ 
     public static void main(String[] args){
        int n,i=1,sum=0,remainder;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    //    while(i<=n){
    //       sum+=i;
    //         i++;
    //    }
    //    System.out.print(sum+"is sum of" +n+ "numbers");
    while(n!=0){
        remainder=n%10;
        n=n/10;
        sum++;
    }
    System.out.print(sum);
    }
}
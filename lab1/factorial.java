import java.lang.*;
import java.util.Scanner;
class factorial{
    static int factor(int n){
    if(n==0) return 1;
    else return n*factor(n-1);
    }
public static void main(String p[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int f=factor(n);
    System.out.println(f);
}

}
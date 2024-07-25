import java.util.*;
class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[],n,sum=0;
        n=sc.nextInt();
        a=new int[n];
       for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
       }
       System.out.print("The array is");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            sum=sum+a[i];
        }
        System.out.println("sum is"+sum);
    }
}
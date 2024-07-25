import java.util.*;
public class ArraySum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j,k,flag=0;
        int sum=0,sum1=0,count=0,count1;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.println(" "+arr[i]);
        }
        System.out.println("");
        for(i=0;i<n;i++){
            sum=sum+arr[i];
            count=count+1;
            sum1=0;
            count1=0;
            for(j=n-1;j>i;j--){
                sum1=sum1+arr[j];
                count1=count1+1;
                if(sum1>sum){
                    break;
                }
                if(sum==sum1 && count+count1==n){
                    System.out.println("The number of elements in 1st and 2nd set is: "+count+" "+count1);
                    System.out.println(" ");
                    for(k=0;k<=i;k++){
                        System.out.println("The first set is: "+arr[k]);
                    }
                    System.out.println(" ");
                    for(k=n-1;k>=j;k--){
                        System.out.println("The 2nd set is: "+arr[k]);
                    }
                    System.out.println(" ");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1) System.out.println("this array satisifies the condition");
        else System.out.println("this array doesn't satisfy the condition");
    }
}
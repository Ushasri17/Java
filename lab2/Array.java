import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter No of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n/2];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("your entered array\n:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nthe new array is:\n");
        for(int i=n-1,j=0;i>=n/2;i--,j++){
            arr1[j]=arr[i];
        }
        for(int i=n/2,j=0;i<n;i++,j++){
            arr[i]=arr1[j];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

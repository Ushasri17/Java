import java.util.*;
public class ArraySort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j=0;
        int arr[]=new int[n];
        int even[]=new int[n/2];
        int odd[]=new int[n/2];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0,j=0;i<n;i+=2,j++){
            even[j]=arr[i];
        }
        for(i=1,j=0;i<n;i+=2,j++){
            odd[j]=arr[i];
        }
        for(i=0;i<n/2;i++){
            for(j=i+1;j<n/2;j++){
                if(even[i]>even[j]){
                    int temp=even[i];
                    even[i]=even[j];
                    even[j]=temp;
                }
            }
        }
        for(i=0;i<n/2;i++){
            for(j=i+1;j<n/2;j++){
                if(odd[i]>odd[j]){
                    int temp=odd[i];
                    odd[i]=odd[j];
                    odd[j]=temp;
                }
            }
        }
        for(i=0,j=0;i<n;i+=2,j++){
            arr[i]=even[j];
        }
        for(i=1,j=0;i<n;i+=2,j++){
            arr[i]=odd[j];
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
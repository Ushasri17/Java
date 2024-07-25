import java.util.*;
public class Duplicates {
    public static void sorting(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int count=0,p=0;
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        sorting(arr);
        try{
            for(int j=0;j<len-1;j++){
                if(arr[j]==arr[j+1]) count++;
            }
            if(count!=0) throw new ArrayIndexOutOfBoundsException();
            else System.out.println("No duplicates");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Duplicates are there in your array");
        }
    }
}

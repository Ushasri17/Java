import java.util.*;
public class Marks {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no of students");
    int n=sc.nextInt();
    int arr[][]=new int[n][6];
    int total[]=new int[n];
    int marks[]=new int[n];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<6;j++){
          System.out.println("Enter "+(i+1)+" student's "+(j+1)+" subject marks");
            arr[i][j]=sc.nextInt();
            if(arr[i][j]>100) {
            System.out.print("Invalid marks,Enter valid marks");
              arr[i][j]=sc.nextInt();
        }
        total[i]+=arr[i][j];
        }
    } 
    System.out.print("Marks of the students");
    for(int i=0;i<arr.length ;i++){
      for(int j=0;j<6;j++){
      System.out.print(arr[i][j]+" ");
      }
      System.out.print("The total of"+(i+1)+" students"+total[i]);
    }
  }  
}

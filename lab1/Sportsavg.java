import java.util.*;
public class Sportsavg{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int[n][3];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<3;j++){
            System.out.print("enter "+(i+1)+" person oxygen level: "+(j+1));
            boolean valid;
           do{ 
            int read=sc.nextInt();
            if(read>=1  && read<=100){
                arr[i][j]=read;
                System.out.println("Your response was recorded as"+(read));
                valid=true;
            }
            else{
                System.out.println("Sorry! Enter valid range number");
            }while(!valid);
            }
            
        }
    }
    
}   
}
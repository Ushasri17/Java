import java.util.Scanner;

public class EmailReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter email: ");
        String a=sc.next();
        int n=a.length(),i=0,j=0;
        String alpha="";
        int count=0;
        String b="";
        String r="";
        for(i=0;i<n;i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90 || a.charAt(i)>=97 && a.charAt(i)<=122 || a.charAt(i)>=48 && a.charAt(i)<=57){
                alpha+=a.charAt(i);
            }
            else{
            b+=a.charAt(i);
            count++;
        }
        }
        System.out.print(alpha);
        System.out.print("\nThe no of special character are: "+count);
        System.out.print("\nthe characters in reverse order is: ");
        for(i=a.length()-1;i>=0;i--){
            r+=a.charAt(i);
        }
        System.out.print(r);
//write a progrm to count words in a sentence
//write a program to capitalize first letter of every word in a sentence
//write a program to remove spaces
//write a program to check given substring is in the original string or not
}
}

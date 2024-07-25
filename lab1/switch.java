import java.util.Scanner;
import java.math.*;
class Mid{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    boolean valid=true;
    do{System.out.println("\na) Even or odd \n b) No of digits in a number\n c) No of even digits in a number \n d) Sum of digits in a number\n e)Reverse of a number\n f)Palindrome or not \n g)Armstrong or not \n h)Fibonacci series upto n\n i)exit");
    char opt;
    opt=sc.snext().charAt(0);
    switch(opt)
    {
        case 'a':
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else
        System.out.println("Odd");
        valid=true;
        break;
        case 'b':
        System.out.println("Enter a number:");
        num=sc.nextInt();
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        System.out.print("No of digits are: "+count);
        valid=true;
        break;
        case 'c':
        num=sc.nextInt();
        count=0;
        while (num!=0) {
            int rem=num%10;
            if(num%2==0)
            {
                count++;
                num=num/10;
            }
            else 
             num=num/10;
        }
        System.out.println("No of  even digits are "+count);
        break;
        case 'd':
        num=sc.nextInt();
        int s=0;
        while(num!=0)
        {
            int r=num%10;
            s=s+r;
            num=num/10;
        }
        System.out.println("Sum of digits is"+s);
        break;
        case 'e':
        num=sc.nextInt();
        s=0;
        while(num!=0)
        {
            int r=num%10;
            s=s*10+r;
            num=num/10;
        }
        System.out.println("Reverse of digits is"+s);
        break;
        case 'f':
        num=sc.nextInt();
        int t=num;
        s=0;
        while(num!=0)
        {
            int r=num%10;
            s=s*10+r;
            num=num/10;
        }
        if (t==s) {
            System.out.println(t+" is a palindrome");
        }
        else{
            System.out.println(t+" not a palindrome");
        }
        valid=true;
        break;
        case 'g':
        num=sc.nextInt();
        int n=num;t=num;
        s=0;count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        while(t!=0)
        {
            int r=t%10;
            s=s+(int)(Math.pow(r,count));
            t=t/10;
        }
        if (n==s) {
            System.out.println(s+" is a armstrong number");
        }
        else{
            System.out.println(s+"is not a armstrong number");
        }
        break;
        case 'h':
         num=sc.nextInt();
         int a=0;
         int b=1,c=0,i=0;
         System.out.print(a);
         c=a+b;
         while(c<num){
            System.out.print(" " +c);
            c=a+b;
            a=b;
            b=c;
         }
         valid=true;
         break;
         case 'i':
         valid=false;
         System.out.print("your are exit from menu");
         break;
        default:
        System.out.print("Invalid");
    }
}
    while(valid);
}
}
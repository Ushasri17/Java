import java.util.*;
class Swapping{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Entered numbers are"+a+","+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swapped numbers are"+a+","+b);
    }
}
import java.util.*;
public class Q5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        try{
            if(marks<0 || marks>100)
            throw new IllegalArgumentException();
            marks=100/marks;
        }
        catch(IllegalArgumentException ae){
            System.out.println("HeHe");
        }
        catch(ArithmeticException a){
            System.out.println("HaHa");
        }
    }
}

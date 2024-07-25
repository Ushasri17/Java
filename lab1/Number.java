import java.util.*;
import java.lang.String;
class Number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String[] arr=a.split(",");
        int digit5=0,digit8=0;
        String num1="";
        String num2="";
        for(String digit:arr){
            if(digit.equals("5")){
                digit5=1;
            }
            else if(digit.equals("8")){
                digit8=1;
                num1+=digit;
            }
            if(digit5==1 && digit8==0) num1+=digit;
            else if (digit8!=1) num2+=digit;
            else num2+=digit;
        }
        String num3=num2.replace("8","");
        System.out.println(num1+" "+num3);
        int sum=Integer.parseInt(num1)+Integer.parseInt(num3);
        System.out.print(sum);
    }
}
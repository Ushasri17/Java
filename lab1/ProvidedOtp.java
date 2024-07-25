import java.util.*;
public class ProvidedOtp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter provided input");
        boolean valid=false;
        String otp="Pavitra@2006";
     do{  
        String Otp=sc.next();
         if(otp.equals(Otp)){
            System.out.print(Otp);
            valid=false;
        }
        else{
            System.out.print("Enter valid otp");
            valid=true;
    }
}while(valid);
}
}

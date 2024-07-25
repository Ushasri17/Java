import java.util.*;
class Otp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter otp");
        boolean valid=false;
        do{
            String otp=sc.next();
        if(otp.length()==6 || otp.length()==4){
            System.out.print(otp);
            valid=false;
        }
        else {
            System.out.print("Invalid otp.Enter valid otp containing 4 or 6 letters");
            valid=true;
        }
    }while(valid);
}
}
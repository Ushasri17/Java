import java.util.*;
public class Details {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter name");
        name=sc.next();
        if(name.charAt(0)>=65 && name.charAt(0)<=90){
            System.out.println("Name is "+name);
            Password();
        }
        else{
            System.out.println("Invalid name.Ensure that the first letter is capital");
        }
    }
    static void Password(){
        String password,re_enter_password;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password");
        password=sc.next();
        System.out.println("Re-enter the password");
        re_enter_password=sc.next();
        if(password.equals(re_enter_password)){
            System.out.println("password is "+password);
        }
        else System.out.print("Re-entered password not matching with password");
    }
}


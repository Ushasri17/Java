import java.lang.*;
import java.util.*;
class Details{
public static void main(String[] args)
{  
   boolean  v=false;
   do{
   Scanner sc=new Scanner(System.in);
System.out.println("Enter username");
String uname=sc.next();
System.out.println("Enter password");
String pswd=sc.next();
System.out.println("RE-enter password");
String repswd=sc.next();
LoginBussiness lb=new LoginBussiness(uname,pswd,repswd);
	if(lb.validate())
{
 System.out.println(uname+pswd+repswd);
 v=true;
}
else
{ 
	System.out.println("Please enter Valid data");
	v=false;
}
}while(!v);
}
class LoginBussiness{
 String uname,pswd,repswd;
  public LoginBussiness(String uname,String pswd,String repswd)
{ 
   this.uname=uname;
   this.pswd=pswd;
   this.repswd=repswd;
}
boolean validate()
{
      if(uname.isEmpty() || pswd.isEmpty() || repswd.isEmpty())
	return false;
      else if(uname.length()<4|| pswd.length()<4 ||repswd.length()<4)
	return false;
      else if(!(uname.charAt(0)>='a' && uname.charAt(0)<='z') || !(uname.charAt(0)>='A' && uname.charAt(0)<='Z'))
  	return false;
      else if(!pswd.equals(repswd))
        return false;
      return true;
}
}	
}

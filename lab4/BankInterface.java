interface Bank{
  public void Accountant_details();
}
class SBI implements Bank{
    public void Accountant_details(){
        String name="rahul";
        String Account_no="731345779";
        String address="Banglore";
        System.out.println("The SBI details are: "+name+" "+Account_no+" "+address);
    }
}
class PNB implements Bank{
    public void Accountant_details(){
        String name="virat";
        String Account_no="731345780";
        String address="delhi";
        System.out.println("The PNB details are: "+name+" "+Account_no+" "+address);
    }    
}
class ICICI implements Bank{
    public void Accountant_details(){
        String name="Devilliers";
        String Account_no="731345190";
        String address="southafrica";
        System.out.println("The ICICI accountant details are: "+name+" "+Account_no+" "+address);
    }    
}
public class BankInterface {
    public static void main(String[] args) {
    Bank i=new ICICI();
    i.Accountant_details();
    Bank s=new SBI();
    s.Accountant_details();
    Bank p=new PNB();
    p.Accountant_details();
    }
}

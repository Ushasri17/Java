import java.util.*;
abstract class Bank {
    abstract void interestRate();
    abstract void balanceEnquiry();
    abstract void deposit(int amount);
    abstract void withdrawl(int amount);
    public long balance;
}

class SBI extends Bank {
    Scanner sc=new Scanner(System.in);
    long min_bal=1000;
    long balance=10000;
    long withdrawn_money;
    void interestRate(){
        System.out.println("SBI Interest Rate: 5%");
    }

    
    void deposit(int amount) {
        balance+=amount;
    }

    
    void withdrawl(int amount) {
        long b=balance;
        if(balance>min_bal)
        balance-=amount;
        else    System.out.println("No sufficient balance..There should be minimum balance....");
        if(balance<=0){
            balance+=(amount-b+min_bal);
            amount-=(amount-b+min_bal);
            System.out.println("There should be minimum balance....You can take only "+amount);
        }

    }
    void balanceEnquiry() {
        System.out.println("Your balance is "+balance);
    }
}

class PNB extends Bank {
    Scanner sc=new Scanner(System.in);
    void interestRate() {
        System.out.println("PNB Interest Rate: 6%");
    }

    
    void balanceEnquiry() {
        System.out.println("HI");
    }

    
    void deposit(int amount) {
        System.out.println("HI");
    }

    
    void withdrawl(int amount) {
        System.out.println("HI");
    }
    
}

public class Que6 {
    public static void main(String[] args) {
        SBI s=new SBI();
        s.deposit(10000);
        s.withdrawl(20000);
        s.withdrawl(20000);
        s.balanceEnquiry();
    }
}

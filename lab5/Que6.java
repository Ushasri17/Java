import java.util.*;
class Average{
    private int avg;
    public void setAvg(int avg){
        this.avg=avg;
    }
    public int getAvg(){
        return avg;
    }
}
public class Que6 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Average a=new Average();
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();
    a.setAvg((num1+num2+num3)/3);
    System.out.println("The average of three numbers is:"+a.getAvg());
}
}

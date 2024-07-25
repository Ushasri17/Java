import java.util.*;
class Rectangle{
    Scanner sc=new Scanner(System.in);
    double l=sc.nextDouble();
    double b=sc.nextDouble();
    void area(){
        double area=l*b;
        System.out.println("The area is:"+area);
    }
}
class Cuboid extends Rectangle{
    void volume(double h){
        double volume=l*b*h;
        System.out.println("the volume is:"+volume);
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double h=sc.nextDouble();
        Cuboid c=new Cuboid();
        c.area();
        c.volume(h);
    }
}
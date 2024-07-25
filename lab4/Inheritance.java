import java.util.*;
class Circle{
    Scanner sc=new Scanner(System.in);
    double pi=3.14;
    double circlearea;
    double r=sc.nextDouble();
    void area(){
        circlearea=pi*r*r;
        System.out.println("The area of circle is:"+circlearea);
    }
}
class Cylinder extends Circle{
    //double pi=3.14;
    Scanner sc=new Scanner(System.in);
    double volume;
    void volume(double height){
        volume=pi*r*r*height;
        System.out.println("The volume of cylinder is:"+volume);
    }
}
class Inheritance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        Cylinder c=new Cylinder();
        System.out.println("Enter height");
        double height=sc.nextDouble();
        c.area();
        c.volume(height);
    }
}
import java.util.*;
class Triangle{
    Scanner sc=new Scanner(System.in);
    void AreaAndPerimeter(int a,int b,int c){
        int perimeter=(a+b+c)/3;
        int area=(b*c)/2;
        System.out.print("The perimeter is: "+perimeter+" And area is: "+area);
    }
}
class que2{
    public static void main(String[] args){
        Triangle t=new Triangle();
        t.AreaAndPerimeter(3,4,5);
    }
}
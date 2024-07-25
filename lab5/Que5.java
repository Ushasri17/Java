class Rectangle{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    int area(){
        return l*b;
    }
}
public class Que5{
    public static void main(String[] args) {
    Rectangle r=new Rectangle(4,5);
    Rectangle r2=new Rectangle(5,8);
    int a=r.area();
    System.out.println("The area of rectangle having dimensions 4,5 is: "+a);
    int b=r2.area();
    System.out.println("The area of rectangle having dimensions 5,8 is: "+b);
}
}
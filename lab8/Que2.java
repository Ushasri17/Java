package SecondPackage;
import FirstPackage.*;
class Class2{
    private Hello h;
    public Class2(){
        h=new Hello();
    }
    public void useHello(){
        h.Hi();
    }
    public static void main(String[] args) {
        Class2 c=new Class2();
        c.useHello();
    }
}
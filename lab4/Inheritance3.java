class Animal{
    int legs=2;
    int tail=1;
}
class Dog extends Animal{
    void Bark(){
        System.out.println("No of legs of dog is: "+legs);
    }
    void Eat(){
        System.out.println("The no of tails is: "+tail);
    }
}
public class Inheritance3 {
    public static void main(String[] args) {
    Dog d=new Dog();
    d.Bark();
    d.Eat();
}
}
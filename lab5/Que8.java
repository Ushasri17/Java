class Animal{
    String name="Dog";
}
class Dog extends Animal{
    public void Bark(){
        System.out.println("Dog barks as Bow-Bow");
    }
}
class Babydog extends Dog{
    public void BabydogBark(){
        System.out.println("Baby dog also bark as Bow-Bow");
    }
}
public class Que8 {
    public static void main(String[] args) {
    Babydog b=new Babydog();
    b.BabydogBark();
    b.Bark();
}
}

class Student{
    String id;
    String name;
    String branch;
   Student(String id,String name){
        this.id=id;
        this.name=name;
        System.out.println("The Student name is "+name+" id is "+id);
   } 
   Student(String id,String name,String branch){
        this.id=id;
        this.name=name;
        this.branch=branch;
        System.out.println("The Student name is "+name+" id is "+id+" branch is"+branch);
}
}
public class Que10 {
    public static void main(String[] args){
         new Student("18","virat");
         new Student("17","Devilliers","CSE");
    }
}
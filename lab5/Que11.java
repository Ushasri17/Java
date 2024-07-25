class Student{
    String id;
    String name;
    String branch;
    int total_marks;
    double percentage;
    Student(String id,String name,String branch,int total_marks){
        this.id=id;
        this.name=name;
        this.branch=branch;
        this.total_marks=total_marks;
        System.out.println("The name of student is "+name+" id is "+id+" branch is "+branch+" total marks are "+total_marks);
    }
    Student(String id,String name,String branch,double percentage){
        this.id=id;
        this.name=name;
        this.branch=branch;
        this.percentage=percentage;
        System.out.println("The name of student is "+name+" id is "+id+" branch is "+branch+" percentage is "+percentage);

    }
}
public class Que11 {
    public static void main(String[] args){
        Student s=new Student("17","Devilliers","Cricket",148);
        Student s2=new Student("18","Virat","cricket",150.5);
    }
    
}

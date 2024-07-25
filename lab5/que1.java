import java.util.*;
class Student{
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    String id_no=sc.next();
}
class que1{
    public static void main(String[] args) {
    Student s=new Student();
    String student_name=s.name;
    String student_id=s.id_no;
    System.out.println("The student name is: "+student_name+" id is: "+student_id);
}
}

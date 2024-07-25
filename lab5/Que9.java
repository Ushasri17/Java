class Student{
    String college="RGUKT,NUZVID";
}
class Student1 extends Student{
    public void S1details(){
    String name="virat";
    String id="18";
    String s1class="CSE-03";
    String branch="CSE";
    System.out.println("The name of student1 is "+name+" id is "+id+" class and branch is "+s1class+" and "+branch+" college is "+college);
    }
}
class Student2 extends Student{
    public void S2details(){
    String name="Devilliers";
    String id="17";
    String s2class="CSE-04";
    String branch="CSE"; 
    System.out.println("The name of student2 is "+name+" id is "+id+" class and branch is "+s2class+" and "+branch+" college is "+college);
    }
}
public class Que9 {
    public static void main(String[] args) {
        Student2 s2=new Student2();
        Student1 s1=new Student1();
        s2.S2details();
        s1.S1details();
    }
}

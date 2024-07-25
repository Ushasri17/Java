interface Bc1{
    void NTMid();
    void NTSem();
}
interface Bc2{
    void OOPSMid();
    void OOPSSem();
}
class Student implements Bc1,Bc2{
    String Name="Virat";
    String ID="18";
    String Branch="CSE";
    public void NTMid(){
        int mid_marks=39;
        System.out.println("The NT mid marks is:"+mid_marks); 
    }
    public void NTSem(){
        int sem_marks=56;
        System.out.println("The NT sem marks is:"+sem_marks);
    }
    public void OOPSMid(){
        int mid=40;
        System.out.println("The OOPS mid marks is:"+mid);
    }
    public void OOPSSem(){
        int sem=57;
        System.out.println("The OOPS sem marks is:"+sem);
    }
}
public class Que7 {
    public static void main(String[] args) {
    Student s2=new Student();
    System.out.println("The name of the student is:"+s2.Name);
    System.out.println("ID No is:"+s2.ID);
    System.out.println("Branch is:"+s2.Branch);
    s2.NTMid();
    s2.OOPSMid();
    s2.NTSem();
    s2.OOPSSem();
}
}

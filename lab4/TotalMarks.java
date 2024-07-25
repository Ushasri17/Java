interface Nt{
    int mid1=14;
    int mid2=20;
    int endsem=56;
    public void totalmarks();
}
interface Oops{
    int mid1=19;
}
class Marks implements Nt{
    public void totalmarks(){
        int marks=mid1+mid2+endsem;
        System.out.println(marks);
    }
}
public class TotalMarks {
    public static void main(String[] args){
        Nt n;
        n=new Marks();
        n.totalmarks();
    }
}

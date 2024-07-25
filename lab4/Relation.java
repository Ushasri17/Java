import java.util.*;
interface Grandfather{
        String name="Loki";
        String surname="Glenn";
        int property=10000;
    }
interface Father extends Grandfather{
    String name="Thor";
    int fatherproperty = property/2;
}
interface Mother extends Grandfather{
    String mothername="Ellyse";
	String details="fighter";
}
interface Uncle extends Grandfather{
    String unclename="Tony";
	int uncleproperty=property/2;
}
class Son implements Father,Mother{
    String sonname="Tom";
	String address;
    int childproperty = fatherproperty;
    
}
public class Relation {
    public static void main(String[] args) {
        Son s=new Son();
        System.out.println("property of uncle is:"+Father.fatherproperty);
    }
}
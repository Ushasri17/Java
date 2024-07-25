class Employee{
    void Employee1(){
    String name="Robert";
    String Year="1994";
    String address="64c-wallsStreet";
    System.out.print("Name Year of joining Address: "+name+" "+Year+" "+address);
    }
    void Employee2(){
    String name="sam";
    String Year="2000";
    String address="68D-wallsStreet"; 
    System.out.print(" "+name+" "+Year+" "+address);
    }
    void Employee3(){
        String name="John";
        String Year="1999";
        String address="26B-wallsStreet";
        System.out.print(" "+name+" "+Year+" "+address);
    }
}
class que4{
    public static void main(String[] args){
    Employee s=new Employee();
    s.Employee1();
    s.Employee2();
    s.Employee3();
}
}
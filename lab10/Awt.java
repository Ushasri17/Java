import java.awt.*;
import java.awt.event.*;
class Eventexample extends Frame {
    TextField tf1,tf2,tf3,tf4,tf5;
    Button b;
    Label l1,l2,l3,l4,l5,l6;
    TextArea ta;
    Eventexample(){
        setTitle("Registration form");
        setVisible(true);
        setSize(450,600);
        setLayout(new FlowLayout()); 
        setBackground(Color.cyan);
        l1=new Label("Enter your name:");
        l2=new Label("Enter email:");
        l3=new Label("Enter Phone number:");
        l4=new Label("Enter Your Aadhar:");
       // l5=new Label("Enter your address:");
        l5=new Label("Enter password:");
        tf1=new TextField(20);
        tf2=new TextField(20);
        tf3=new TextField(20);
        tf4=new TextField(20);
        tf5=new TextField(20);
        ta=new TextArea("Enter your address:");
        ScrollPane s=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        s.setPreferredSize(new Dimension(300,100));
        b=new Button("SUMBIT");
        add(l1);
        add(tf1);
        add(l2); 
        add(tf2);
        add(l5);
        add(tf5);
        add(l3);
        add(tf3);
        add(l4);
        add(tf4);
       // add(l5);
        add(ta);
        s.add(ta);
        add(s);
        add(b);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.out.println("Window closed");
                System.exit(0);
            }
        });
    }
}
class Awt{
    public static void main(String[] args){
        Eventexample e=new Eventexample();
    }
}

import java.awt.event.*;
import java.awt.*;

class CalFrame extends Frame{
    TextArea t1,t2,t3,t4;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,p,m,mp,d,e,pow;
    Label l1,l2,l3,l4;
    CalFrame(){
        setSize(500,500);
        setTitle("Calculator");
        setVisible(true);
        setBackground(Color.white);
        setLayout(new GridLayout(5,4));
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b0=new Button("0");
        pow=new Button("^");
        p=new Button("+");
        m=new Button("-");
        mp=new Button("x");
        d=new Button("/");
        e=new Button("=");
        l1=new Label();
        l2=new Label();
        l3=new Label();
        l4=new Label();
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(b1);
        add(b2);
        add(b3);
        add(p);
        add(b4);
        add(b5);
        add(b6);
        add(m);
        add(b7);
        add(b8);
        add(b9);
        add(pow);
        add(mp);
        add(b0);
        add(d);
        add(e);
        b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent a){
             System.out.println("Button clicked");
        }
    });
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.out.println("Window closed");
                System.exit(0);
            }
        });
    }
}
public class Calc{
    public static void main(String[] args) {
        CalFrame c=new CalFrame();
        
    }
}

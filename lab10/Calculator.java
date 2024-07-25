import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class Calculator1 extends Frame{
   Label l1,l2;
   Button b1;
    Calculator1(){
        setVisible(true);
        setLayout(null);
        setSize(500,500);
       l1=new Label("HI");
       l2=new Label("Hello");
       b1=new Button("submit");
       add(l1);
       add(l2);
       add(b1);
    }
}
class Calculator{
    public static void main(String[] args) {
        Calculator1 c=new Calculator1();

    }
}

import java.awt.*;
import java.awt.event.*;
public class BinarytoDecimal extends Frame{
    Label l1,l2;
    TextField t1,t2;
    Button b1;
    BinarytoDecimal(){
        setTitle("BinarytoDecimal");
        setVisible(true);
        setSize(600,600);
        l1=new Label("Enter a binary number");
        l2=new Label("your output");
        t1=new TextField();
        t2=new TextField();
        b1=new Button("Submit");
        setLayout(null);
        l1.setBounds(50,50,50,100);
        l2.setBounds(50,60,50,100);
        t1.setBounds(100,100,100,100);
        t2.setBounds(100,200,100,100);
        b1.setBounds(200,300,100,50);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.out.println("Hello");
                System.exit(0);
            }
            });
            b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                String binary = t1.getText();
                int decimal = Integer.parseInt(binary, 2);
                t2.setText(String.valueOf(decimal));
        }
    });
}
    public static void main(String[] args){
        BinarytoDecimal b=new BinarytoDecimal();
    }

}

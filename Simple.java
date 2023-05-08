import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Simple {
    public static void main(String[] args) {
        // Efgd obj = new Efgd();
        Addition obj = new Addition();

    }
}

// class Efgd extends JFrame {
// public Efgd(){
// super("My JFrame"); // set the title of the JFrame
// setLayout(new FlowLayout());
// JLabel label = new JLabel("hello my name is Mansi");
// JLabel label2 =new JLabel("hi hello");
// add(label);

// setVisible(true);
// setSize(400,400);

// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close
// operation

// }
// }
class Addition extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton btn;
    JLabel l1; 

    public Addition() {
        super("ADDITION");
         t1 = new JTextField(20);
         t2 = new JTextField(20);
         btn = new JButton("OK"); 
        l1 = new JLabel("Result");
        add(t1);
        add(t2);
        add(btn);
        add(l1);
        
        btn.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
    int num1=Integer.parseInt(t1.getText());
    int num2=Integer.parseInt(t2 .getText());
    int sum=num1 + num2;
    l1.setText(sum +"");
    }
}

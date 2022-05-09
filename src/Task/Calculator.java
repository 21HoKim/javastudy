package Task;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    Calculator(){
        this.setTitle("계산기");
        Image icon = Toolkit.getDefaultToolkit().getImage("calculator.png");
        this.setIconImage(icon);

/*
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("res/calculator.png");
        this.setIconImage(img);
*/


        this.setBounds(100,100,300,450);
        JTextField display = new JTextField("0");

        display.setFont(new Font("궁서체",Font.BOLD,50));
        display.setHorizontalAlignment(JTextField.RIGHT);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        btn3.addActionListener(e->{

        });
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnPlus = new JButton("+");
        JButton btnMinus=new JButton("-");
        JButton btnSign=new JButton("+/-");
        JButton btnDot=new JButton(".");
        JButton btnMult=new JButton("*");
        JButton btnEqual=new JButton("=");
        panel.add(btn7);panel.add(btn8);panel.add(btn9);panel.add(btnPlus);
        panel.add(btn4);panel.add(btn5);panel.add(btn6);panel.add(btnMinus);
        panel.add(btn1);panel.add(btn2);panel.add(btn3);panel.add(btnMult);
        panel.add(btnSign);panel.add(btn0);panel.add(btnDot);panel.add(btnEqual);







        JLabel status = new JLabel("계산기 입니다.");
        this.setLayout(new BorderLayout());
        this.add(BorderLayout.NORTH,display);
        this.add(BorderLayout.CENTER,panel);
        this.add(BorderLayout.SOUTH,status);

    }

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}

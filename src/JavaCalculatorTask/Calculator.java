package JavaCalculatorTask;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private double op1=0;
    private double op2=0;
    private String operator;
    private JButton[] btnNum= new JButton[10];

    public Calculator(){ // 생성자
        JLabel status=new JLabel("버튼을 클릭하세요");
        this.setTitle("계산기");
        this.setBounds(100,100,400,500);
        this.setLayout(new BorderLayout());

        JTextField display = new JTextField("0");
        display.setFont(new Font("",0,30) );
        display.setHorizontalAlignment(JTextField.RIGHT);
        this.add(BorderLayout.NORTH,display);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnMulti = new JButton("*");
        JButton btnDivision = new JButton("/");
        JButton btnDot=new JButton(".");
        JButton btnEqual = new JButton("=");
        btnNum[0]=new JButton("7");
        btnNum[1]=new JButton("8");
        btnNum[2]=new JButton("9");
        btnNum[3]=new JButton("4");
        btnNum[4]=new JButton("5");
        btnNum[5]=new JButton("6");
        btnNum[6]=new JButton("1");
        btnNum[7]=new JButton("2");
        btnNum[8]=new JButton("3");
        btnNum[9]=new JButton("0");
        panel.add(btnNum[0]);
        panel.add(btnNum[1]);
        panel.add(btnNum[2]);
        panel.add(btnPlus);
        panel.add(btnNum[3]);
        panel.add(btnNum[4]);
        panel.add(btnNum[5]);
        panel.add(btnMinus);
        panel.add(btnNum[6]);
        panel.add(btnNum[7]);
        panel.add(btnNum[8]);
        panel.add(btnMulti);
        panel.add(btnDot);
        panel.add(btnNum[9]);
        panel.add(btnEqual);
        panel.add(btnDivision);
        for(int i=0;i<10;i++){
            btnNum[i].addActionListener(e->{
                if(display.getText().equals("0")){
                    // display.setText(btnNum.getText());
                }
            });
        }




        this.add(BorderLayout.CENTER,panel);

        this.add(BorderLayout.SOUTH,status);
    }

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}

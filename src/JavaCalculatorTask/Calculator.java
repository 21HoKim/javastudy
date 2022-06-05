package JavaCalculatorTask;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private double op1=0;
    private double op2=0;
    private String operator;
    private String[] btnNum= {
            "7","8","9",
            "4","5","6",
            "1","2","3","0"
};

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
        panel.setLayout(new GridLayout(5,4));
        JButton btnPlus = new JButton("+");
        btnPlus.setFont(new Font("맑은 고딕",Font.BOLD,15));
        JButton btnMinus = new JButton("-");
        btnMinus.setFont(new Font("맑은 고딕",Font.BOLD,20));
        JButton btnMulti = new JButton("X");
        btnMulti.setFont(new Font("맑은 고딕",Font.BOLD,15));
        JButton btnDivision = new JButton("/");
        btnDivision.setFont(new Font("맑은 고딕",Font.BOLD,15));
        JButton btnDot=new JButton(".");
        btnDot.setFont(new Font("맑은 고딕",Font.BOLD,15));
        JButton btnEqual = new JButton("=");
        btnEqual.setFont(new Font("맑은 고딕",Font.BOLD,15));

        for(int i=0;i<10;i++){
            JButton btn = new JButton(btnNum[i]);
            btn.setFont(new Font("맑은 고딕",Font.BOLD,15));
            panel.add(btn);
            if(i==2){
                panel.add(btnPlus);
            }
            if(i==5){
                panel.add(btnMinus);
            }
            if(i==8){
                panel.add(btnMulti);
            }
            if(i==8){
                panel.add(btnDivision);
            }
            if(i==9) {
                panel.add(btnDot);
                panel.add(btnEqual);
            }
            btn.addActionListener(e->{
                if(display.getText().equals("0")){ //참조연산 비교는 equals 사용
                    display.setText(btn.getText());
                }else {
                    display.setText(display.getText() + btn.getText());
                }
            });

        }

        btnEqual.addActionListener(e->{ // = 클릭이벤트

            op2=Double.parseDouble(display.getText());

            double result=calc(op1,op2,operator);
            display.setText(""+result);
            status.setText(""+result);

        });

        btnPlus.addActionListener(e->{ // + 클릭이벤트
            op1=Double.parseDouble(display.getText());

            display.setText("0");
            operator="+";
            status.setText(op1+"+");
        });
        btnMinus.addActionListener(e->{ // - 클릭이벤트
            op1=Double.parseDouble(display.getText());
            display.setText("0");
            operator="-";
            status.setText(op1+"-");
        });
        btnDivision.addActionListener(e->{ // / 클릭이벤트
            op1=Double.parseDouble(display.getText());
            display.setText("0");
            operator="/";
            status.setText(op1+"/");
        });
        btnMulti.addActionListener(e->{ // X 클릭이벤트
            op1=Double.parseDouble(display.getText());
            display.setText("0");
            operator="X";
            status.setText(op1+"X");
        });
        btnDot.addActionListener(e->{ // . 클릭이벤트
            if(!display.getText().contains(".")){
                display.setText(display.getText()+btnDot.getText());
            }
        });

        JButton btnClear = new JButton("C");
        btnClear.addActionListener(e->{ // C 클릭이벤트
            op1=0;
            op2=0;
            operator="+";
            display.setText("0");
            status.setText(" ");
        });
        panel.add(btnClear);

        JButton btnBackspace = new JButton("<-");
        btnBackspace.addActionListener(e->{ // <- 클릭이벤트
            String temp = display.getText();
            temp=temp.substring(0,temp.length()-1);
            display.setText(temp);
        });
        panel.add(btnBackspace);

        this.add(BorderLayout.CENTER,panel);

        this.add(BorderLayout.SOUTH,status);
    }

    private double calc(double op1, double op2, String operator) {
        switch (operator){
            case "+":
                return op1+op2;
            case "-":
                return op1-op2;
            case "X":
                return op1*op2;
            case "/":
                return op1/op2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}

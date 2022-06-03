package Calculator;


import javax.swing.*;
import java.awt.*;

public class Calc extends JFrame {
    private double op1=0;
    private double op2=0;
    private String operator="+";
    private JLabel status;
    private String[] btnText = {
            "7","8","9",
            "4","5","6",
            "1","2","3","0"
    };
    public Calc(){
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
        JButton btnMinus = new JButton("-");
        JButton btnMulti = new JButton("*");
        JButton btnDivision = new JButton("/");
        //JButton btnPM=new JButton("+/-");
        JButton btnDot=new JButton(".");
        for(int i=0;i<10;i++){
            JButton btn = new JButton(btnText[i]);
            panel.add(btn);
            if(i==2){
                panel.add(btnMulti);
            }
            if(i==5){
                panel.add(btnMinus);
            }
            if(i==8){
                panel.add(btnPlus);
            }
            if(i==8){
                panel.add(btnDivision);
            }
            if(i==9){
                panel.add(btnDot);
            }
            btn.addActionListener(e->{
                if(display.getText().equals("0")){ //참조연산 비교는 equals 사용
                    display.setText(btn.getText());
                }else {
                    display.setText(display.getText() + btn.getText());
                }
            });

        }

        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(e->{
            op2=Double.parseDouble(display.getText());
            double result=calc(op1,op2,operator);
            display.setText(""+result);
        });
        panel.add(btnEqual);


        btnPlus.addActionListener(e->{
            op1=Double.parseDouble(display.getText());
            display.setText("0");
            operator = "+";
            status.setText(op1+"+");
        });
       //panel.add(btnPlus);


        btnDot.addActionListener(e->{
            if(!display.getText().contains(".")){
                display.setText(display.getText()+btnDot.getText());
            }
        });

        btnDivision.addActionListener(e->{});
        //panel.add(btnDot);

        JButton btnClear = new JButton("C");
        btnClear.addActionListener(e->{
            op1=0;
            op2=0;
            operator="+";
            display.setText("0");
            status.setText(" ");
        });
        panel.add(btnClear);



        this.add(BorderLayout.CENTER,panel);

        this.add(BorderLayout.SOUTH,status);
    }

    private double calc(double op1, double op2, String operater) {
        switch (operater){
            case "+":
                return op1+op2;
            case "-":
                return op1-op2;
            case "*":
                return op1*op2;
            case "/":
                return op1/op2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new Calc().setVisible(true);
    }
}

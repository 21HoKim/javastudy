package Calculator;


import javax.swing.*;
import java.awt.*;

public class Calc extends JFrame {
    private double op1=0;
    private double op2=0;
    private String operator="+";
    private JLabel status;
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
        panel.setLayout(new GridLayout(4,4));
        for(int i=0;i<10;i++){
            JButton btn = new JButton(""+i);
            btn.addActionListener(e->{
                if(display.getText().equals("0")){ //참조연산 비교는 equals 사용
                    display.setText(btn.getText());
                }else {
                    display.setText(display.getText() + btn.getText());
                }
            });
            panel.add(btn);
        }
        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(e->{
            op2=Double.parseDouble(display.getText());
            double result=calc(op1,op2,operator);
            display.setText(""+result);
        });
        panel.add(btnEqual);
        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(e->{
            op1=Double.parseDouble(display.getText());
            display.setText("0");
            operator = "+";
            status.setText(op1+"+");
        });
       panel.add(btnPlus);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(e->{
            if(!display.getText().contains(".")){
                display.setText(display.getText()+btnDot.getText());
            }
        });
        panel.add(btnDot);

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

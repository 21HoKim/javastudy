package May17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SwingTest extends JFrame {
    private String[] btnText = {
            "7","8","9",
            "4","5","6",
            "1","2","3"
    };
    private JButton btn;
    private JLabel lbl;
    public SwingTest(){
        this.setTitle("Swing Test");
        this.setBounds(100,100,300,500);
        this.setLayout(new GridLayout(4,3));

        for(int i=0;i<9;i++){
            btn = new JButton(btnText[i]);
            this.add(btn);
            btn.addActionListener(e->{
                lbl.setText(e.getActionCommand());
            });
        }

        lbl = new JLabel("");
        this.add(lbl);
    }
    private void doAction(ActionEvent e){
        switch(e.getActionCommand()){
            case "0": case "1": case "2":
                processNumber();
                break;
            case "+": case"-":
                processOperator();
                break;
            case "=":
                //
                break;
        }

        //lbl.setText(btn.getText());
    }

    private void processOperator() {
    }

    private void processNumber() {
    }

    public static void main(String[] args) {
        SwingTest S = new SwingTest();
        S.setVisible(true);
    }

}

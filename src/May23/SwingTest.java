package May23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SwingTest extends JFrame {
    String[] btnStr={
            "1","2","3",
            "a","b","c",
            "&","@","%"
    };
    String[] lblStr ={
            "숫자","영어","특수"
    };
    JButton btn;
    JLabel[] lbl=new JLabel[3];
    SwingTest(){
        this.setTitle("Swing TT");
        this.setBounds(100,100,300,400);
        this.setLayout(new GridLayout(4,3));
        for(String a : btnStr){
            btn=new JButton(a);
            this.add(btn);
            btn.addActionListener(e->doAction(e));
        }
        for(int i=0;i< lblStr.length;i++){
            lbl[i] = new JLabel(lblStr[i]);
            this.add(lbl[i]);
        }

    }

    private void doAction(ActionEvent e) {
        switch (e.getActionCommand()){
            case"1": case"2":case"3":
                lbl[0].setText(e.getActionCommand());  break;
            case"a": case"b": case"c":
                lbl[1].setText(e.getActionCommand()); break;
            case"&": case"@": case"%":
                lbl[2].setText(e.getActionCommand());  break;
        }
    }


    public static void main(String[] args) {
        SwingTest st=new SwingTest();
        st.setVisible(true);
    }
}

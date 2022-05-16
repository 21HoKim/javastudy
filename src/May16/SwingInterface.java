package May16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingInterface extends JFrame{
    private JLabel lbl;
    private JButton btn1,btn2;
    private SwingInterface(){
        this.setTitle(" Swing Interface ");
        this.setBounds(100,100,500,400);
        this.setLayout(null);

        lbl = new JLabel("test");
        lbl.setBounds(20,20,50,20);
        this.add(lbl);

        btn1 = new JButton("push");
        btn1.setBounds(220,300,70,30);
        this.add(btn1);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doAction();
            }};
        btn1.addActionListener(al);

        btn2 = new JButton("back");
        btn2.setBounds(150,300,70,30);
        this.add(btn2);
        btn2.addActionListener(e->doAction2());
         /* ActionListener al2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doAction2();
            }};
        btn2.addActionListener(al2); */
    }

    private void doAction2() {
        lbl.setLocation(lbl.getLocation().x-5,lbl.getLocation().y-5);
    }

    private void doAction() {
        lbl.setLocation(lbl.getLocation().x+5,lbl.getLocation().y+5);
    }

    public static void main(String[] args) {
        SwingInterface swing = new SwingInterface();
        swing.setVisible(true);


    }
}

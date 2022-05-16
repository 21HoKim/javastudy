package moving;

import javax.swing.*;

public class Moving extends JFrame {
    public Moving(){
        this.setTitle("Moving");
        this.setBounds(100,100,500,400);
        this.setLayout(null);

        ImageIcon image=new ImageIcon("testIcon.jpg");
        JLabel lbl=new JLabel(image);
        lbl.setBounds(10,10,100,100);
        this.add(lbl);

        JButton btn = new JButton("오른쪽");
        btn.addActionListener(e->{
            lbl.setLocation(lbl.getLocation().x+5,lbl.getLocation().y);
        });
    btn.setBounds(320,300,70,30);
    this.add(btn);

        JButton btn2 = new JButton("아래");
        btn2.addActionListener(e->{
            lbl.setLocation(lbl.getLocation().x,lbl.getLocation().y+5);
        });
        btn2.setBounds(280,330,70,30);
        this.add(btn2);

        JButton btn3 = new JButton("왼쪽");
        btn3.addActionListener(e->{
            lbl.setLocation(lbl.getLocation().x-5,lbl.getLocation().y);
        });
        btn3.setBounds(250,300,70,30);
        this.add(btn3);

        JButton btn4 = new JButton("위");
        btn4.addActionListener(e->{
            lbl.setLocation(lbl.getLocation().x,lbl.getLocation().y-5);
        });
        btn4.setBounds(280,270,70,30);
        this.add(btn4);

    }
    public static void main(String[] args) {
        Moving mv=new Moving();
        mv.setVisible(true);

    }
}

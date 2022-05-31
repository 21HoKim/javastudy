package May31;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class myNotePad extends JFrame {
    public myNotePad(){
        this.setTitle("메모장");
        this.setBounds(100,100,300,250);
        this.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu=new JMenu("파일");
        JMenu editMenu=new JMenu("편집");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        this.add(BorderLayout.NORTH,menuBar);

        JTextArea textArea = new JTextArea(60,30);
        JScrollPane sp=new JScrollPane(textArea);
        this.add(BorderLayout.CENTER,sp); //스크롤 구현

        JLabel status = new JLabel("안녕~");
        this.add(BorderLayout.SOUTH,status);

        fileMenu.addActionListener(e->{
            File in= new File("test.txt");
            readCharFile(in);
        });

    }

    public static void readCharFile(File inFile) {
        try{
            FileReader fr = new FileReader(inFile);
            int data;
            while((data=fr.read())!=-1){
                System.out.print((char)data);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myNotePad note = new myNotePad();
        note.setVisible(true);
    }
}

package May24;

import javax.swing.*;

public class notePad extends JFrame {
    notePad(){
        this.setTitle("메모장");
        this.setBounds(100,100,600,400);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("파일");
        JMenu editMenu = new JMenu("편집");
        JMenu textMenu = new JMenu("서식");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(textMenu);
        JMenuItem openMenuItem = new JMenuItem("열기");
        JMenuItem saveMenuItem = new JMenuItem("저장");
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        this.setJMenuBar(menuBar);

        openMenuItem.addActionListener(e->doOpen());
        saveMenuItem.addActionListener(e->doSave());
    }

    private void doSave() {
        System.out.println("저장 메뉴 선택");
    }

    private void doOpen() {
        System.out.println("열기 메뉴 선택");
    }

    public static void main(String[] args) {
        notePad np = new notePad();
        np.setVisible(true);
    }
}

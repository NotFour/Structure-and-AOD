package laba3;

import javax.swing.*;

public class MainForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(950,607);
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}

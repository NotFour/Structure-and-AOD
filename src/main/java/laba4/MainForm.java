package laba4;

import javax.swing.*;

public class MainForm {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setSize(780,605);
        frame.setVisible(true);
    }
}

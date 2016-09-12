package laba2;

import javax.swing.*;

public class MainForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
        frame.setSize(950,607);
        frame.add(panel);
        frame.setVisible(true);
        Arrays.createOrderedArray(1000000,5);
    }


}

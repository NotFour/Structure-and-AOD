package laba5;

import javax.swing.*;
import java.awt.*;

public class MainForm {
    public static void main(String[] args){
        JFrame form = new JFrame();
        Panelka panel = new Panelka();
        form.setExtendedState(Frame.MAXIMIZED_BOTH);
        form.add(panel);
        form.setVisible(true);
        ;
    }
}

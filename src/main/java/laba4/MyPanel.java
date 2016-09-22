package laba4;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    JTextField field1;
    JTextField field2;
    JLabel label;
    JButton button1;
    JButton button2;
    JButton button3;

    public MyPanel(){
        setLayout(null);
        Font font = new Font("Verdana", Font.BOLD, 17);
        field1 = new JTextField();
        field2 = new JTextField();
        label = new JLabel("Слова найдено");
        button1 = new JButton("Добавить");
        button2 = new JButton("Найти");
        button3 = new JButton("Выход");

        field1.setBounds(10,10,300,500);
        field2.setBounds(350,10,400,50);
        button1.setBounds(350,110,400,50);
        button2.setBounds(350,210,400,50);
        label.setBounds(350,310,400,50);
        button3.setBounds(350,493,400,50);

        field1.setFont(font);
        field2.setFont(font);
        label.setFont(font);
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);


        field1.setVisible(true);
        field2.setVisible(true);
        label.setVisible(true);
        button1.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);

        add(field1);
        add(field2);
        add(label);
        add(button1);
        add(button2);
        add(button3);
    }
}

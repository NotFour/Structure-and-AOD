package laba4;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class MyPanel extends JPanel{
    Map treeMap;
    JTextArea field1;
    JTextField field2;
    JLabel label;
    JButton button1;
    JButton button2;
    JButton button3;
    Metod metod;

    public MyPanel(){
        setLayout(null);
        Font font = new Font("Verdana", Font.BOLD, 17);
        field1 = new JTextArea();
        field2 = new JTextField("privet");
        label = new JLabel();
        button1 = new JButton("Добавить");
        button2 = new JButton("Найти");
        button3 = new JButton("Выход");
        treeMap = new TreeMap<Integer, String>();
        metod = new Metod();

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
        button1.addActionListener(new ButtonListener(this,metod));
        button2.setVisible(true);
        button2.addActionListener(new ButtonListener(this,metod));
        button3.setVisible(true);

        add(field1);
        add(field2);
        add(label);
        add(button1);
        add(button2);
        add(button3);
    }
}

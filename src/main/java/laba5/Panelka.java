package laba5;

import javax.swing.*;

public class Panelka extends JPanel {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;

    public Panelka(){
        button1 = new JButton("Обмен");
        button2 = new JButton("");
        button2 = new JButton("Выбор");
        button3 = new JButton("Вставка");
        button4 = new JButton("Шелла");
        button5 = new JButton("Линейная");
        button6 = new JButton("Характеристики");
        button7 = new JButton("Сортировать");

        button1.setBounds(0,0,320,50);
        button2.setBounds(0,320,320,50);
        button3.setBounds(0,640,320,50);
        button4.setBounds(0,960,320,50);
        button5.setBounds(0,1280,320,50);
        button6.setBounds(0,1600,320,50);
        button7.setBounds(0,840,840,50);

        button1.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);
        button4.setVisible(true);
        button5.setVisible(true);
        button6.setVisible(true);
        button7.setVisible(true);

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7 );

    }
}

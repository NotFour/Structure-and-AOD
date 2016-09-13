package laba2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyPanel extends JPanel {
    JButton button1;
    JButton button3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label10;
    JLabel label11;
    JLabel label12;
    JLabel label14;
    JLabel label15;
    JSpinner spinner1;
    JTextField field1;
    JTextField field2;
    JTextField field3;
    JTextField field4;
    JTextField field5;
    JTextField field6;

    public MyPanel() {
        setLayout(null);
        Font font = new Font("Verdana", Font.BOLD, 17);

        button1 = new JButton();
        button3 = new JButton();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        spinner1 = new JSpinner();
        field1 = new JTextField();
        field2 = new JTextField();
        field3 = new JTextField();
        field4 = new JTextField();
        field5 = new JTextField();
        field6 = new JTextField();

        label4.setBounds(0, 100, 475, 50);
        label5.setBounds(475, 100, 475, 50);
        label6.setBounds(0, 150, 70, 50);
        label7.setBounds(0, 200, 70, 50);
        label8.setBounds(0, 250, 70, 50);
        label10.setBounds(475, 200, 70, 50);
        label11.setBounds(475, 250, 70, 50);
        label12.setBounds(0, 300, 475, 50);
        label14.setBounds(0, 350, 70, 50);
        label15.setBounds(0, 400, 70, 50);
        button1.setBounds(0, 450, 950, 50);
        button3.setBounds(0, 500, 950, 50);
        spinner1.setBounds(80, 150, 390, 50);
        field1.setBounds(80, 200, 390, 50);
        field2.setBounds(80, 250, 390, 50);
        field3.setBounds(560, 200, 355, 50);
        field4.setBounds(560, 250, 355, 50);
        field5.setBounds(80, 350, 390, 50);
        field6.setBounds(80, 400, 390, 50);

        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label12.setHorizontalAlignment(SwingConstants.CENTER);

        label4.setText("Неоптимальный бинарный");
        label5.setText("Оптимальный бинарный");
        label6.setText("Ключ");
        label7.setText("Время");
        label8.setText("Индекс");
        label10.setText("Время");
        label11.setText("Индекс");
        label12.setText("Оптимальный последовательный");
        label14.setText("Время");
        label15.setText("Индекс");
        button1.setText("НАЙТИ");
        button3.setText("ВЫХОД");

        Random random = new Random();
        spinner1.setValue(random.nextInt(50000));

        label4.setFont(font);
        label5.setFont(font);
        label6.setFont(font);
        label7.setFont(font);
        label8.setFont(font);
        label10.setFont(font);
        label11.setFont(font);
        label12.setFont(font);
        label14.setFont(font);
        label15.setFont(font);
        spinner1.setFont(font);
        button1.setFont(font);
        button3.setFont(font);
        field1.setFont(font);
        field2.setFont(font);
        field3.setFont(font);
        field4.setFont(font);
        field5.setFont(font);
        field6.setFont(font);

        button1.setVisible(true);
        button3.setVisible(true);
        label4.setVisible(true);
        label5.setVisible(true);
        label6.setVisible(true);
        label7.setVisible(true);
        label8.setVisible(true);
        label10.setVisible(true);
        label11.setVisible(true);
        label12.setVisible(true);
        label14.setVisible(true);
        label15.setVisible(true);
        spinner1.setVisible(true);
        field1.setVisible(true);
        field2.setVisible(true);
        field3.setVisible(true);
        field4.setVisible(true);
        field5.setVisible(true);
        field6.setVisible(true);
        field1.setEditable(false);
        field2.setEditable(false);
        field3.setEditable(false);
        field4.setEditable(false);
        field5.setEditable(false);
        field6.setEditable(false);

        button1.addActionListener(new ButtonListener(this));
        button3.addActionListener(new ButtonListener(this));

        add(button1);
        add(button3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label10);
        add(label11);
        add(label12);
        add(label14);
        add(label15);
        add(spinner1);
        add(field1);
        add(field2);
        add(field3);
        add(field4);
        add(field5);
        add(field6);
    }
}

package laba2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyPanel extends JPanel {
        JButton button1;
        //JButton button2;
        JButton button3;
       // JLabel label1;
       // JLabel label2;
        //JLabel label3;
        JLabel label4;
        JLabel label5;
        JLabel label6;
        JLabel label7;
        JLabel label8;
       // JLabel label9;
        JLabel label10;
        JLabel label11;
        JLabel label12;
        //JLabel label13;
        JLabel label14;
        JLabel label15;
        //JLabel label16;
        //JLabel label17;
        JSpinner spinner1;
        //JSpinner spinner2;
        JTextField field1;
        JTextField field2;
        JTextField field3;
        JTextField field4;
        JTextField field5;
        JTextField field6;
        //JTextField field7;
        //JTextField field8;

    public MyPanel() {
            setLayout(null);
            Font font = new Font("Verdana", Font.BOLD, 17);

            button1 = new JButton();
           // button2 = new JButton();
            button3 = new JButton();
            //label1 = new JLabel();
            //label2 = new JLabel();
            //label3 = new JLabel();
            label4 = new JLabel();
            label5 = new JLabel();
            label6 = new JLabel();
            label7 = new JLabel();
            label8 = new JLabel();
           // label9 = new JLabel();
            label10 = new JLabel();
            label11 = new JLabel();
            label12 = new JLabel();
          //  label13 = new JLabel();
            label14 = new JLabel();
            label15 = new JLabel();
            //label16 = new JLabel();
            //label17 = new JLabel();

            spinner1 = new JSpinner();
            //spinner2 = new JSpinner();

            field1 = new JTextField();
            field2 = new JTextField();
            field3 = new JTextField();
            field4 = new JTextField();
            field5 = new JTextField();
            field6 = new JTextField();
          //  field7 = new JTextField();
          //  field8 = new JTextField();


            //label1.setBounds(0,0,950,50);
           // label2.setBounds(0,50,475,50);
           // label3.setBounds(475,50,475,50);
            label4.setBounds(0,100,475,50);
            label5.setBounds(475,100,475,50);
            label6.setBounds(0,150,70,50);
            label7.setBounds(0,200,70,50);
            label8.setBounds(0,250,70,50);
         //   label9.setBounds(475,150,70,50);
            label10.setBounds(475,200,70,50);
            label11.setBounds(475,250,70,50);
            label12.setBounds(0,300,475,50);
          //  label13.setBounds(475,300,475,50);
            label14.setBounds(0,350,70,50);
            label15.setBounds(0,400,70,50);
            //label16.setBounds(475,350,70,50);
            //label17.setBounds(475,400,70,50);
            button1.setBounds(0,450,950,50);
          //  button2.setBounds(633,450,158,50);
            button3.setBounds(0,500,950,50);
            spinner1.setBounds(80,150,390,50);
            //spinner2.setBounds(560,150,355,50);
            field1.setBounds(80,200,390,50);
            field2.setBounds(80,250,390,50);
            field3.setBounds(560,200,355,50);
            field4.setBounds(560,250,355,50);
            field5.setBounds(80,350,390,50);
            field6.setBounds(80,400,390,50);
         //   field7.setBounds(560,350,355,50);
         //   field8.setBounds(560,400,355,50);



           // label1.setHorizontalAlignment(SwingConstants.CENTER);
           // label2.setHorizontalAlignment(SwingConstants.CENTER);
           // label3.setHorizontalAlignment(SwingConstants.CENTER);
            label4.setHorizontalAlignment(SwingConstants.CENTER);
            label5.setHorizontalAlignment(SwingConstants.CENTER);
            label12.setHorizontalAlignment(SwingConstants.CENTER);
         //   label13.setHorizontalAlignment(SwingConstants.CENTER);


          //  label1.setText("Последовательный поиск");
          //  label2.setText("Неупорядоченный массив");
          //  label3.setText("Упорядоченный массив");
            label4.setText("Неоптимальный бинарный");
            label5.setText("Оптимальный бинарный");
            label6.setText("Ключ");
            label7.setText("Время");
            label8.setText("Индекс");
          //  label9.setText("Ключ");
            label10.setText("Время");
            label11.setText("Индекс");
            label12.setText("Оптимальный последовательный");
          //  label13.setText("Поиск как в упорядоченном");
            label14.setText("Время");
            label15.setText("Индекс");
            //label16.setText("Время");
            //label17.setText("Индекс");
            button1.setText("НАЙТИ");
           // button2.setText("НАЙТИ");
            button3.setText("ВЫХОД");

            Random random = new Random();
            spinner1.setValue(random.nextInt(50000));
            //spinner2.setValue(random.nextInt(50000));

        //    label1.setFont(font);
         //   label2.setFont(font);
         //   label3.setFont(font);
            label4.setFont(font);
            label5.setFont(font);
            label6.setFont(font);
            label7.setFont(font);
            label8.setFont(font);
          //  label9.setFont(font);
            label10.setFont(font);
            label11.setFont(font);
            label12.setFont(font);
          //  label13.setFont(font);
            label14.setFont(font);
            label15.setFont(font);
            //label16.setFont(font);
           // label17.setFont(font);
            spinner1.setFont(font);
            //spinner2.setFont(font);
            button1.setFont(font);
         //   button2.setFont(font);
            button3.setFont(font);
            field1.setFont(font);
            field2.setFont(font);
            field3.setFont(font);
            field4.setFont(font);
            field5.setFont(font);
            field6.setFont(font);
         //   field7.setFont(font);
          //  field8.setFont(font);

            button1.setVisible(true);
          //  button2.setVisible(true);
            button3.setVisible(true);
       //     label1.setVisible(true);
       //     label2.setVisible(true);
       //     label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(true);
            label6.setVisible(true);
            label7.setVisible(true);
            label8.setVisible(true);
        //    label9.setVisible(true);
            label10.setVisible(true);
            label11.setVisible(true);
            label12.setVisible(true);
          //  label13.setVisible(true);
            label14.setVisible(true);
            label15.setVisible(true);
         //   label16.setVisible(true);
         //   label17.setVisible(true);
            spinner1.setVisible(true);
            //spinner2.setVisible(true);
            field1.setVisible(true);
            field2.setVisible(true);
            field3.setVisible(true);
            field4.setVisible(true);
            field5.setVisible(true);
            field6.setVisible(true);
          //  field7.setVisible(true);
          //  field8.setVisible(true);

            button1.addActionListener(new ButtonListener(this));
           // button2.addActionListener(new ButtonListener(this));
            button3.addActionListener(new ButtonListener(this));

            add(button1);
           // add(button2);
            add(button3);
       //     add(label1);
       //     add(label2);
       //     add(label3);
            add(label4);
            add(label5);
            add(label6);
            add(label7);
            add(label8);
          //  add(label9);
            add(label10);
            add(label11);
            add(label12);
          //  add(label13);
            add(label14);
            add(label15);
         //   add(label16);
         //   add(label17);
            add(spinner1);
            //add(spinner2);
            add(field1);
            add(field2);
            add(field3);
            add(field4);
            add(field5);
            add(field6);
           // add(field7);
          //  add(field8);
    }
}

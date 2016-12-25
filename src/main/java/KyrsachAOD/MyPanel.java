package KyrsachAOD;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    JButton buttonExit;
    JButton buttonDraw;
    Font font;

    public MyPanel() {
        setLayout(null);
        font = new Font("Verdana",Font.BOLD, 17);
        buttonExit = new JButton("Выход");
        buttonDraw = new JButton("Построить");
        //1920 1080
        buttonExit.setBounds(1720, 1059, 200, 50);
        buttonDraw.setBounds(640, 1059, 640, 50);

        buttonExit.setFont(font);
        buttonDraw.setFont(font);

        buttonExit.setVisible(true);
        buttonDraw.setVisible(true);

        add(buttonExit);
        add(buttonDraw);








    }
    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D)gr ;
        BasicStroke pen1 = new BasicStroke(15);
        g.setStroke(pen1);

        /**
         * 1920,1110
         * */
        g.drawLine(10,10,10,1000);
        g.drawLine(10,1000,1900,1010);
    }
   
}

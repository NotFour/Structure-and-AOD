package laba4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    MyPanel mp;
    Metod metod;

    public ButtonListener(MyPanel mp, Metod metod) {
        this.mp = mp;
        this.metod = metod;
    }

    public void actionPerformed(ActionEvent e) {
        char[] array = mp.field2.getText().toCharArray();
        char[] newArray = new char[array.length + 1];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = '0';

        if (e.getSource().equals(mp.button1) && (!mp.field2.getText().equals(""))) {
            metod.addEnd(newArray);
            mp.field1.setText(mp.field1.getText() + mp.field2.getText() + "\n");
            mp.field2.setText("");
        }
        if (e.getSource().equals(mp.button2) && (!mp.field2.getText().equals(""))) {
            if (metod.search(newArray)) {
                mp.label.setText("Найдено");
            } else {
                mp.label.setText("Не найдено");
            }
            mp.field2.setText("");
        }
    }
}

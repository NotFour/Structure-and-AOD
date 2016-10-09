package laba1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    MyPanel mp;


    public ButtonListener(MyPanel mp) {
        this.mp = mp;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(mp.button3)){
            System.exit(0);
        }
        if(e.getSource().equals(mp.button1)){

            Arrays.Structure result = Arrays.findOptimalArray(Arrays.commonArray,Integer.parseInt(mp.spinner1.getModel().getValue().toString()));
            mp.field5.setText(String.valueOf(result.time));
            mp.field6.setText(String.valueOf(result.index));
            result = Arrays.findNotOptimalArray(Integer.parseInt(mp.spinner1.getModel().getValue().toString()));
            mp.field1.setText(String.valueOf(result.time));
            mp.field2.setText(String.valueOf(result.index));
        }
        if(e.getSource().equals(mp.button2)){
            Arrays.Structure result = Arrays.findOptimalArray(Arrays.orderedArray,Integer.parseInt(mp.spinner2.getModel().getValue().toString()));
            mp.field3.setText(String.valueOf(result.time));
            mp.field4.setText(String.valueOf(result.index));
            result = Arrays.findOptimalOrderedArray(Integer.parseInt(mp.spinner2.getModel().getValue().toString()));
            mp.field7.setText(String.valueOf(result.time));
            mp.field8.setText(String.valueOf(result.index));
        }
    }
}

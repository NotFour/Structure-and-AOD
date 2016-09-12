package laba2;

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
            Arrays.binaryNotOptimal(Integer.parseInt(mp.spinner1.getModel().getValue().toString()));
            mp.field1.setText(String.valueOf(Arrays.Structure.time));
            mp.field2.setText(String.valueOf(Arrays.Structure.index));
            Arrays.binaryOptimal(Integer.parseInt(mp.spinner1.getModel().getValue().toString()));
            mp.field3.setText(String.valueOf(Arrays.Structure.time));
            mp.field4.setText(String.valueOf(Arrays.Structure.index));
            Arrays.findOptimalArray(Arrays.orderedArray,Integer.parseInt(mp.spinner1.getModel().getValue().toString()));
            mp.field5.setText(String.valueOf(Arrays.Structure.time));
            mp.field6.setText(String.valueOf(Arrays.Structure.index));


        }

    }
}
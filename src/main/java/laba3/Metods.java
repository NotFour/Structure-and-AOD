package laba3;

import java.util.Random;

public class Metods {
    Random random = new Random();
    public Metods(final int count){
        int[] array = new int[count];
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(count);
        }
    }
}
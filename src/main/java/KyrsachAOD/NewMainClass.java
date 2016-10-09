package KyrsachAOD;

import java.util.Random;

public class NewMainClass {
    public static void main(String[] args) {
        Random random = new Random();
        final int arraySize = 100;
        int[] a = new int[arraySize];
        for(int i=0;i<arraySize;i++){
            a[i]=random.nextInt(100);
        }
        double[] arrayChance = new double[arraySize];

    }
}
package KyrsachAOD;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        int[] kolvoNumbers = new int[5];
        int[] arraynumbers = new int[5];
        for (int i = 0; i < 5; i++) {
            arraynumbers[i] = i + 5;
            System.out.print(arraynumbers[i]+" ");
        }
        System.out.println("");
        double[] arrayChances = new double[5];
        arrayChances[0] = 55.5;
        arrayChances[1] = 15.5;
        arrayChances[2] = 10.0;
        arrayChances[3] = 9.0;
        arrayChances[4] = 10.0;
        for(int h=0;h<5;h++){
            System.out.print(arrayChances[h]+" ");
        }
        System.out.println("");
        System.out.println("20 раз выбираем по миллиону чисел");
        for (int y = 0; y < 20; y++) {
            for(int t=0;t<5;t++){
                kolvoNumbers[t]=0;
            }
            for (int i = 0; i < 1000000; i++) {
                switch (ChoiceNumber.choice(arraynumbers, arrayChances)) {
                    case 5:
                        kolvoNumbers[0]++;
                        break;
                    case 6:
                        kolvoNumbers[1]++;
                        break;
                    case 7:
                        kolvoNumbers[2]++;
                        break;
                    case 8:
                        kolvoNumbers[3]++;
                        break;
                    case 9:
                        kolvoNumbers[4]++;
                        break;
                }
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("цифр "+(j+5)+" "+kolvoNumbers[j]+" штук ||"+ " ");
            }
            System.out.println("");
        }
    }
}
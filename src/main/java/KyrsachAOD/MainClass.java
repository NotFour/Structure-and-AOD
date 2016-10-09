package KyrsachAOD;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        /**
         * Размер массивов
         * */
        final int size = 20;
        /**
         * Массив счетчик для всех массивов
         * countMassives[0]-идеальный массив
         * countMassives[1]-массив методом транспозиции
         * countMassives[2]-массив методом в начало
         * countMassives[3]-массив смешанным методом
         * */
        int[] countMassives = new int[4];
        for (int i = 0; i < countMassives.length; i++) {
            countMassives[i] = 0;
        }
        /**
         * Массив исходных чисел
         * */
        int[] arrayNumbers = new int[size];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = i + 5;
        }
        /**
         * Массив вероятностей
         * */
        double[] arrayChances = new double[size];
        arrayChances[0] = 1.1;
        arrayChances[1] = 0.87;
        arrayChances[2] = 8.93;
        arrayChances[3] = 7.8;
        arrayChances[4] = 3.15;
        arrayChances[5] = 5.6;
        arrayChances[6] = 4.81;
        arrayChances[7] = 8.6;
        arrayChances[8] = 5.01;
        arrayChances[9] = 3.3;
        arrayChances[10] = 4.17;
        arrayChances[11] = 6.34;
        arrayChances[12] = 5.43;
        arrayChances[13] = 3.4;
        arrayChances[14] = 10.6;
        arrayChances[15] = 5.3;
        arrayChances[16] = 7.14;
        arrayChances[17] = 5.1;
        arrayChances[18] = 1.15;
        arrayChances[19] = 2.2;

        for(int i=0;i<arrayChances.length;i++){
            System.out.print(arrayChances[i]+" ");
        }
        System.out.println("");
        /**
         * Идеальный массив
         * */
        int[] idealNumbers = new int[size];
        for (int i = 0; i < idealNumbers.length; i++) {
            idealNumbers[i] = arrayNumbers[i];
        }
        Massives.changeElems(idealNumbers, arrayChances);

        /**
         * Массив, который меняем транспозицией
         * */
        int[] transNumbers = new int[size];
        for (int i = 0; i < transNumbers.length; i++) {
            transNumbers[i] = arrayNumbers[i];
        }

        /**
         * Массив, который меняем методов в начало
         * */
        int[] startNumbers = new int[size];
        for (int i = 0; i < startNumbers.length; i++) {
            startNumbers[i] = arrayNumbers[i];
        }
        /**
         * Массив, который меняем смешанным методом
         * */
        int[] mixNumbers = new int[size];
        for (int i = 0; i < mixNumbers.length; i++) {
            mixNumbers[i] = arrayNumbers[i];
        }
        int number;//рандомное число сохраняется сюда
        int transIndex;//сюда сохраняем индекс найденного элемента
        int startIndex;//сюда сохраняем индекс найденного элемента
        int mixIndex;//сюда сохраняем индекс найденного элемента

        for (int y = 0; y < 20; y++) {
            for (int i = 0; i < 100; i++) {
                number = ChoiceNumber.choice(arrayNumbers, arrayChances);

                countMassives[0] += Massives.findNotOptimalArray(idealNumbers, number) + 1;

                transIndex = Massives.findNotOptimalArray(transNumbers, number);
                countMassives[1] += transIndex+1;
                transNumbers = Massives.methodTrans(transNumbers, transIndex);

                startIndex = Massives.findNotOptimalArray(startNumbers, number);
                countMassives[2] += startIndex + 1;
                startNumbers = Massives.methodStart(startNumbers, startIndex);

                mixIndex = Massives.findNotOptimalArray(mixNumbers, number);
                countMassives[3] += mixIndex + 1;
                if(0==y){
                    mixNumbers = Massives.methodStart(mixNumbers,mixIndex);
                }else{
                    mixNumbers = Massives.methodTrans(mixNumbers,mixIndex);
                }
            }
            for (int i = 0; i < countMassives.length; i++) {
                System.out.print((double) countMassives[i] / 100 + " ");
                countMassives[i] = 0;
            }
            System.out.println("");

        }
    }
}

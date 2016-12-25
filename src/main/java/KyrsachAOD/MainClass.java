package KyrsachAOD;

import java.io.IOException;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) throws IOException {
        /**
         * Размер массивов
         * */
        final int size = 1000;
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
        Random rand = new Random();
        for (int i = 0; i < arrayChances.length; i++) {
            arrayChances[i] = rand.nextDouble();
        }
        //сделать случайные вероятности, но высчитывать отношения
        //от 1 до тысячи например

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
        number = ChoiceNumber.choice(arrayNumbers, arrayChances);
        for (int y = 0; y < 40; y++) {
            for (int i = 0; i < 100; i++) {
                //number = ChoiceNumber.choice(arrayNumbers, arrayChances);

                countMassives[0] += Massives.findNotOptimalArray(idealNumbers, number) + 1;

                transIndex = Massives.findNotOptimalArray(transNumbers, number);
                countMassives[1] += transIndex + 1;
                transNumbers = Massives.methodTrans(transNumbers, transIndex);

                startIndex = Massives.findNotOptimalArray(startNumbers, number);
                countMassives[2] += startIndex + 1;
                startNumbers = Massives.methodStart(startNumbers, startIndex);

                mixIndex = Massives.findNotOptimalArray(mixNumbers, number);
                countMassives[3] += mixIndex + 1;
                if (0 == y) {
                    mixNumbers = Massives.methodStart(mixNumbers, mixIndex);
                } else {
                    mixNumbers = Massives.methodTrans(mixNumbers, mixIndex);
                }
            }
            for (int i = 0; i < countMassives.length; i++) {
                System.out.print((double) countMassives[i] / 10 + " ");
                countMassives[i] = 0;
            }
            System.out.println("");

        }
    }
}

package KyrsachAOD;

import java.util.Random;

public class ChoiceNumber {
    ;

    /**
     * Выбор случайного числа из массива с определенным шансом
     *
     * @param arrayNumbers массив элементов
     * @param arrayChances массив вероятностей
     * @return возвращает выбранный случайно с заданной вероятностью элемент массива arrayNubmers
     */
    public static int choice(int[] arrayNumbers, double[] arrayChances) {
        Random random = new Random();
        double symm = 0;
        double previous = 0;
        for (int i = 0; i < arrayChances.length; i++) {
            symm += arrayChances[i];
        }
        int number = random.nextInt((int) symm);
        if ((number >= 0) && (number < arrayChances[0])) {
            return arrayNumbers[0];
        } else {
            previous += arrayChances[0];
        }
        for (int i = 1; i < arrayChances.length; i++) {
            if ((number >= previous) && (number < (previous + arrayChances[i]))) {
                return arrayNumbers[i];
            } else {
                previous += arrayChances[i];
            }
        }
        /**
         * такого быть не может, но метод требует возвращать значение
         * */
        return arrayNumbers[arrayNumbers.length - 1];
    }
}
package laba1;

import java.util.Random;

public class Arrays {
    /**
     * время начала в нс
     */
    static long startTime;

    /**
     * обычный массив
     */
    public static int[] commonArray;

    /**
     * упорядоченный массив
     */
    public static int[] orderedArray;

    private static Random random = new Random();

    /**
     * создание обычного массива
     *
     * @param size       размер массива
     * @param allNumbers числа, из которых берутся рандомные
     */
    public static void createCommonArray(int size, int allNumbers) {

        commonArray = new int[size];
        for (int i = 0; i < size; i++) {
            commonArray[i] = random.nextInt(allNumbers);
        }
    }

    /**
     * создание упорядоченного массива
     *
     * @param size       размер массива
     * @param allNumbers числа, из которых берутся рандомные
     */
    public static void createOrderedArray(int size, int allNumbers) {
        orderedArray = new int[size];
        orderedArray[0] = random.nextInt(allNumbers);
        for (int i = 1; i < size; i++) {
            orderedArray[i] = random.nextInt(allNumbers) + orderedArray[i - 1];
        }
    }

    /**
     * Неоптимальный поиск в обычном/упорядоченном массивах
     *
     * @param array входной массив(обычный/упорядоченный)
     * @param value ключ поиска
     * @return найдено или не найдено, индекс если найдено, время поиска
     */
    public static String findNotOptimalArray(int[] array, int value) {
        startTime = System.nanoTime();
        int i;
        for (i = 0; i < array.length; i++) {
            if (value == array[i]) {
                break;
            }
        }
        if (i == array.length) {
            return "Не найдено, время " + (System.nanoTime() - startTime) / 1000 + "мкс";
        } else {
            return "Найдено, индекс " + i + ", время " + (System.nanoTime() - startTime) / 1000 + "мкс";
        }
    }

    /**
     * Оптимальный поиск в обычном(неупорядоченном) массиве
     *
     * @param value ключ поиска
     * @return найдено или не найдено, индекс если найдено, время поиска
     */
    public static String findOptimalArray(int value) {
        startTime = System.nanoTime();
        int[] newCommonArray = new int[commonArray.length + 1];  //создаем массив размером на 1 больше чем commonArray
        for (int i = 0; i < commonArray.length; i++) {
            newCommonArray[i] = commonArray[i];
        }
        newCommonArray[newCommonArray.length - 1] = value;  //последним элементов(барьером) нового массива устанавливаем ключ поиска
        int i = 0;
        while (value != newCommonArray[i]) {
            i++;
        }
        if (i < newCommonArray.length - 1) {
            return "Найдено, индекс " + i + ", время " + (System.nanoTime() - startTime) / 1000 + "мкс";

        } else {
            return "Не найдено, время " + (System.nanoTime() - startTime) / 1000 + "мкс";
        }

    }

    /**
     * Оптимальный поиск в упорядоченном массиве
     *
     * @param value ключ поиска
     * @return найдено или не найдено, индекс если найдено, время поиска
     */
    public static String findOptimalOrderedArray(int value) {
        startTime = System.nanoTime();
        int[] newOrderedArray = new int[orderedArray.length + 1];  //создаем массив размером на 1 больше чем commonArray
        for (int i = 0; i < orderedArray.length; i++) {
            newOrderedArray[i] = orderedArray[i];
        }
        newOrderedArray[newOrderedArray.length - 1] = value + 1;
        int i = 0;
        while (value > newOrderedArray[i]) {
            i++;
        }
        if (value == newOrderedArray[i]) {
            return "Найдено, индекс " + i + ", время " + (System.nanoTime() - startTime) / 1000 + "мкс";

        } else {
            return "Не найдено, время " + (System.nanoTime() - startTime) / 1000 + "мкс";
        }

    }
}

package laba1;

import java.util.Random;

public class Arrays {

    public static class Structure{
        public long time;
        public int index;
        public Structure(long time, int index){
            this.time=time/10;
            this.index=index;
        }
    }

    /**
     * обычный массив
     */
    public static int[] commonArray;


    /**
     * упорядоченный массив
     */
    public static int[] orderedArray;


    /**
     * создание обычного массива
     *
     * @param size       размер массива
     * @param allNumbers числа, из которых берутся рандомные
     */
    public static void createCommonArray(int size, int allNumbers) {
Random random = new Random();
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
        Random random = new Random();
        orderedArray = new int[size];
        orderedArray[0] = random.nextInt(allNumbers);
        for (int i = 1; i < size; i++) {
            orderedArray[i] = random.nextInt(allNumbers) + orderedArray[i - 1]+1;
        }
    }

    /**
     * Неоптимальный поиск в обычном массивах
     *
     * @param value ключ поиска
     * @return найдено или не найдено, индекс если найдено, время поиска
     */
    public static Structure findNotOptimalArray(int value) {

        int i;
        long startTime = System.nanoTime();
        for (i = 0; i < commonArray.length; i++) {
            if (value == commonArray[i]) {
                break;
            }
        }
        if (i == commonArray.length) {
            return new Structure(System.nanoTime()-startTime,-1);
        } else {
            return new Structure(System.nanoTime()-startTime,i);
        }
    }

    /**
     * Оптимальный поиск в обычном/упорядоченном массиве массиве
     * @param array входной массив(обычный/упорядоченный)
     * @param value ключ поиска
     * @return найдено или не найдено, индекс если найдено, время поиска
     */
    public static Structure findOptimalArray(int[] array,int value) {

        int[] newArray = new int[array.length + 1];  //создаем массив размером на 1 больше чем commonArray
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = value;  //последним элементов(барьером) нового массива устанавливаем ключ поиска
        int i = 0;
        long startTime = System.nanoTime();
        while (value != newArray[i]) {
            i++;
        }
        if (i < newArray.length - 1) {
            return new Structure(System.nanoTime()-startTime,i);
        } else {
            return new Structure(System.nanoTime()-startTime,-1);
        }

    }

    /**
     * Оптимальный поиск в упорядоченном массиве
     *
     * @param value ключ поиска
     * @return найдено или не найдено, индекс если найдено, время поиска
     */
    public static Structure findOptimalOrderedArray(int value) {

        int[] newOrderedArray = new int[orderedArray.length + 1];  //создаем массив размером на 1 больше чем orderedArray
        for (int i = 0; i < (newOrderedArray.length-1); i++) {
            newOrderedArray[i] = orderedArray[i];
        }
        newOrderedArray[newOrderedArray.length - 1] = value + 1;  //последним элементов(барьером) нового массива устанавливаем ключ поиска+1
        int i = 0;
        long startTime = System.nanoTime();
        while (value > newOrderedArray[i]) {
            i++;
        }
        if (value == newOrderedArray[i]) {
            return new Structure(System.nanoTime()-startTime,i);
        } else {
            return new Structure(System.nanoTime()-startTime,-1);
        }

    }
}

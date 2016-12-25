package KyrsachAOD;

public class Massives {
    public static int[] changeElems(int[] arrayNumbers, double[] arrayChances) {
        double[] newArrayChance = new double[arrayChances.length];
        for (int i = 0; i < newArrayChance.length; i++) {
            newArrayChance[i] = arrayChances[i];
        }
        int swapNumber;
        double swapChance;
        for (int y = 0; y < arrayNumbers.length; y++) {
            for (int i = 1; i < arrayNumbers.length; i++) {
                if (newArrayChance[i] > newArrayChance[i - 1]) {
                    swapNumber = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[i - 1];
                    arrayNumbers[i - 1] = swapNumber;
                    swapChance = newArrayChance[i];
                    newArrayChance[i] = newArrayChance[i - 1];
                    newArrayChance[i - 1] = swapChance;
                }
            }
        }
        return arrayNumbers;
    }

    public static int findNotOptimalArray(int[] array, int number) {
        int i = 0;
        while (number != array[i]) {
            i++;
        }
        return i;
        /**
         * количество сравнений получается i+1
         * */
    }

    public static int[] methodTrans(int[] array, int index) {
        if (0 != index) {
            int change = array[index - 1];
            array[index - 1] = array[index];
            array[index] = change;
        }
        return array;
    }

    public static int[] methodStart(int[] array, int index) {
        if (0 != index) {
            int change = array[index];
            for (int i = index; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = change;
        }
        return array;
    }
}

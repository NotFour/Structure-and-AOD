package KyrsachAOD;

public class Massives {
    public static int[] changeElems(int[] arrayNumbers, double[] arrayChances) {
        int swapNumber;
        double swapChance;
        for (int y = 0; y < arrayNumbers.length; y++) {
            for (int i = 1; i < arrayNumbers.length; i++) {
                if (arrayChances[i] > arrayChances[i - 1]) {
                    swapNumber = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[i - 1];
                    arrayNumbers[i - 1] = swapNumber;
                    swapChance = arrayChances[i];
                    arrayChances[i] = arrayChances[i - 1];
                    arrayChances[i - 1] = swapChance;
                }
            }
        }
        return arrayNumbers;
    }
    /*public static double generateRandom(){

    }*/
}

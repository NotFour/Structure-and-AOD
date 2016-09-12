package laba2;

public class Arrays extends laba1.Arrays {
    public static Structure binaryNotOptimal(int value) {
        long startTime = System.nanoTime();
        int left = 0;
        int right = orderedArray.length - 1;
        int i = 0;
        while (right >= left) {
            i = (left + right) / 2;
            if (value == orderedArray[i]) {
                break;
            } else if (value < orderedArray[i]) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }
        if (right < left) {
            return new Structure(System.nanoTime() - startTime, -1);
        } else {
            return new Structure(System.nanoTime() - startTime, i);
        }
    }

    /*public static Structure binaryOptimal(int value) {
        long startTime = System.nanoTime();
        int left = 0;
        int right = orderedArray.length - 1;
        int i = 0;
        while (right > left) {
            i = (left + right) / 2;
            if (value <= orderedArray[i]) {
                right = i;
            } else {
                left = i + 1;
            }
        }
        if (value == orderedArray[i]) {
            return new Structure(System.nanoTime() - startTime, i);
        } else {
            return new Structure(System.nanoTime() - startTime, -1);
        }
    }*/

    public static Structure binaryOptimal(int val) {
        long timeStart=System.nanoTime();
        return new Structure(System.nanoTime()-timeStart,binaryOptimal(val, 0, orderedArray.length-1));
    }

    private static int binaryOptimal(int value, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (value < orderedArray[mid]) {
            return binaryOptimal(value, left, mid - 1);
        } else if (value > orderedArray[mid]) {
            return binaryOptimal(value, mid + 1, right);
        } else {
            return mid;
        }
    }
}

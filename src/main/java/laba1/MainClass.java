package laba1;


public class MainClass {
    public static void main(String[] args) {
        Arrays.createCommonArray(10000000, 30);
        Arrays.createOrderedArray(10000000, 2);

        Arrays.findNotOptimalArray(15);
        System.out.println(Arrays.Structure.time+" "+Arrays.Structure.index);
        Arrays.findOptimalArray(Arrays.commonArray,15);
        System.out.println(Arrays.Structure.time+" "+Arrays.Structure.index);
        Arrays.findOptimalArray(Arrays.orderedArray, 15);
        System.out.println(Arrays.Structure.time+" "+Arrays.Structure.index);
        Arrays.findOptimalOrderedArray(15);
        System.out.println(Arrays.Structure.time+" "+Arrays.Structure.index);

    }
}

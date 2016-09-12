package laba2;



public class MainClass {
    public static void main(String[] args) {
        Arrays.createOrderedArray(10000000, 5);

        //System.out.println("");
        Arrays.findOptimalOrderedArray(323000);
        System.out.println(Arrays.Structure.time+" "+Arrays.Structure.index);
        Arrays.binaryNotOptimal(323000);
        System.out.println(Arrays.Structure.time+" "+Arrays.Structure.index);
        Arrays.binaryOptimal(323000);
        System.out.println(Arrays.Structure.time+" "+Arrays.Structure.index);

    }
}
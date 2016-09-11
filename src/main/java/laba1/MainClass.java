package laba1;


public class MainClass {
    public static void main(String[] args) {
        Arrays.createCommonArray(100, 30);
        Arrays.createOrderedArray(20, 2);

        System.out.println(Arrays.findNotOptimalArray(Arrays.commonArray, 15));
        System.out.println(Arrays.findOptimalArray(15));
        System.out.println(Arrays.findNotOptimalArray(Arrays.orderedArray, 10));
        System.out.println(Arrays.findOptimalOrderedArray(10));
        /*System.out.println("");
        for (int i = 0; i < Arrays.orderedArray.length; i++) {
            System.out.println(Arrays.orderedArray[i]);
        }
        System.out.println("");
        for(int i=0;i<Arrays.commonArray.length;i++){
            System.out.println(Arrays.commonArray[i]);
        }*/
    }
}

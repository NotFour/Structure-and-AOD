package laba4;

import java.util.ArrayList;

public class Container {
    private static ArrayList<char[]> arrayChar = new ArrayList<char[]>();

    public static void add(String word){
        arrayChar.add(arrayChar.size(),word.toCharArray());
    }

    public static ArrayList<char[]> getArrayChar(){
        return arrayChar;
    }

    public static char[] getWord(int index){
        return arrayChar.get(index);
    }

}

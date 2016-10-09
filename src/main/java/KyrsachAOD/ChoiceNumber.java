package KyrsachAOD;
import java.util.Random;
public class ChoiceNumber {;

    /**
     * Выбор случайного числа из массива с определенным шансом
     *
     * @param arrayNumbers массив элементов
     * @param arrayChances массив вероятностей
     * @return возвращает выбранный случайно с заданной вероятностью элемент массива arrayNubmers
     */
    public static int choice(int[] arrayNumbers, double[] arrayChances){
        Random random = new Random();
        double previous=0;
        int number = random.nextInt(1000);
        if((number>=0)&&(number<(arrayChances[0]*10))){
            return arrayNumbers[0];
        } else {
            previous+=(arrayChances[0]*10);
        }
        for(int i=1;i<arrayChances.length;i++){
            if((number>=previous)&&(number<(previous+(arrayChances[i]*10)))){
                return arrayNumbers[i];
            } else{
                previous+=(arrayChances[i]*10);
            }
    }
    /**
     * такого быть не может, но метод требует возвращать значение
     * */
    return -1;
    }
}
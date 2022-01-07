package day4;
/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.

 */
import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int value = 0;
        int valueMax = 0;
        int index = 0;

        for (int i = 0; i < array.length - 2; i++){
            valueMax = 0;
            valueMax = array[i] + array[i + 1] + array[i + 2];
            if (value < valueMax) {
                value = valueMax;
                index = i;
            }
        }
        System.out.println(value);
        System.out.println(index);
    }
}

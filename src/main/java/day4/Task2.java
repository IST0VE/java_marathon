package day4;

import java.util.Arrays;
import java.util.Random;

/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя цикл for each вывести в консоль:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.
 */
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int value = 0;
        for (int k : array) {
            max = k;
            if (value < max) {
                value = max;
            }
        }
        System.out.println(value);

        value = 100000;
        for (int k : array) {
            min = k;
            if (value > min) {
                value = min;
            }
        }
        System.out.println(value);

        value = 0;
        int res = 0;
        for (int j : array) {
            if (j % 10 == 0){
                value++;
                res += j;
            }
        }
        System.out.println(value);
        System.out.println(res);
    }
}

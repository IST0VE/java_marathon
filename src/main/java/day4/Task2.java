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

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int value = 0;
        int valueLast = 0;
        for (int k : array) {
            valueLast = k;
            if (value < valueLast) {
                value = valueLast;
            }
        }
        System.out.println(value);

        value = 100000;
        valueLast = 0;
        for (int k : array) {
            valueLast = k;
            if (value > valueLast) {
                value = valueLast;
            }
        }
        System.out.println(value);

        value = 0;
        for (int j : array) {
            if (j % 10 == 0)
                value++;
        }
        System.out.println(value);

        value = 0;
        for (int i :array) {
            if (i % 10 == 0)
                value += i;
        }
        System.out.println(value);
    }
}

package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
С клавиатуры вводится число n - размер массива. Необходимо создать массив
указанного размера и заполнить его случайными числами от 0 до 10 (не включительно).
Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++){
            array[i] = (random.nextInt(9) + 1);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Длина массива: " + array.length);

        int res = 0;
        for (int value : array) {
            if (value > 8) {
                res++;
            }
        }
        System.out.println("Количество чисел больше 8: " + res);

        res = 0;
        for (int value : array) {
            if (value == 1) {
                res++;
            }
        }
        System.out.println("Количество чисел равных 1: " + res);

        res = 0;
        int count = 0;
        for (int k : array) {
            if (k % 2 == 0) {
                res++;
            }
            else if (k % 2 != 0){
                count++;
            }
        }
        System.out.println("Количество четных чисел: " + res);
        System.out.println("Количество нечетных чисел: " + count);

        res = 0;
        for (int j : array) {
            res += j;
        }
        System.out.println("Сумма всех элементов массива: " + res);
    }
}

package day4;

import java.util.Arrays;
import java.util.Random;

/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n -
размерность по колонкам). В консоль вывести индекс строки, сумма
чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
 */
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(50);
            }
        }
        System.out.println(Arrays.deepToString(array));

        int value = 0;
        int valueLast = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++){
            valueLast = 0;
            for (int j = 0; j< array[i].length; j++){
                valueLast += array[i][j];
                if (value < valueLast){
                    value = valueLast;
                    index = i;
                }
            }
        }
        System.out.println(value);
        System.out.println(index);
    }
}

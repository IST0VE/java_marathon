package day3;

import java.util.Scanner;

/*
Реализовать программу, которая 5 раз запрашивает от пользователя два
числа - делимое и делитель. Для этих двух чисел программа рассчитывает
результат деления и выводит его в консоль. Если пользователь вводит 0 в
качестве делителя, вместо того, чтобы останавливать работу цикла
принудительно, мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
Ключевое слово else или два if использовать в этой программе нельзя.
В решении обязательно использовать оператор continue.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            double dividend = scanner.nextDouble();
            double divisor = scanner.nextDouble();
            if (divisor == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(dividend / divisor);
        }
    }
}

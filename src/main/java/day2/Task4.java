package day2;

import java.util.Scanner;

/*
Реализовать программу, которая принимает на вход через консоль
с помощью класса Scanner, число x. Для этого числа, по формуле выше,
необходимо вычислить значение y и вывести его в консоль,
используя метод System.out.println().

 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x >= 5){
            System.out.println((x * x - 10) / (x + 7));
        }
        else if (x > - 3 && x < 5)
            System.out.println((x + 3) * (x * x - 2));
        else
            System.out.println("420.0");
    }
}

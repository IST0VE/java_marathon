package day2;

import java.util.Scanner;

/*
Реализовать программу №2, используя цикл while.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res = a + 1;

        while (res < b){
            if (res % 5 == 0 && res % 10 != 0)
                System.out.print(res + " ");
            res++;
        }
        if (a >= b)
            System.out.println("Некорректный ввод");
    }
}

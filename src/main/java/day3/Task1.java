package day3;

import java.util.Scanner;

/*
1. Реализовать программу, используя switch, которая в консоль выводит название страны,
принимая на вход название города. Программа должна работать до тех пор, пока не будет введено слово “Stop”.
Реализовать, используя следующие данные:
Москва, Владивосток, Ростов - Россия
Рим, Милан, Турин - Италия
Ливерпуль, Манчестер, Лондон - Англия
Берлин, Мюнхен, Кёльн - Германия

При вводе любого другого города, вывести сообщение “Неизвестная страна”.

 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String country = scanner.nextLine();
            if (country.equals("Stop"))
                break;
            switch (country){
                case "Москва":
                    System.out.println("Россия");
                    break;
                case "Владивосток":
                    System.out.println("Россия");
                    break;
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                    System.out.println("Италия");
                    break;
                case "Милан":
                    System.out.println("Италия");
                    break;
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                    System.out.println("Англия");
                    break;
                case "Манчестер":
                    System.out.println("Англия");
                    break;
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                    System.out.println("Германия");
                    break;
                case "Мюнхен":
                    System.out.println("Германия");
                    break;
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}

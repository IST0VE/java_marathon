package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        Car audi = new Car();
        audi.setModel("RS7");
        audi.setColor("Black");
        audi.setYear(2021);

        Motorbike kawasaki = new Motorbike("Z1000SX Ninja", "Green", 2015);

        audi.info();
        kawasaki.info();

        System.out.println("Разница: " + audi.yearDifference(1920));
        System.out.println("Разница: " + kawasaki.yearDifference(2020));
    }
}

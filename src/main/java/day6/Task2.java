package day6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airplane airbus = new Airplane("Airbus", 2020, 37, 42100);

        airbus.info();

        Airplane boeing = new Airplane("Boeing", 2019, 40, 42410);
        boeing.setYear(2006);
        boeing.setLength(74);
        boeing.fillUp(5200);
        boeing.fillUp(3000);
        boeing.info();
    }
}

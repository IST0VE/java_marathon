package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike kawasaki = new Motorbike("Z1000SX Ninja", "Green", 2015);

        System.out.println("Модель: " + kawasaki.getModel());
        System.out.println("Цвет: " + kawasaki.getColor());
        System.out.println("Год выпуска: " + kawasaki.getYear());
    }
}

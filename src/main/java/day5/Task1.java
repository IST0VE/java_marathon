package day5;

public class Task1 {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.setModel("RS7");
        audi.setColor("Black");
        audi.setYear(2021);

        System.out.println("Модель: " + audi.getModel());
        System.out.println("Цвет: " + audi.getColor());
        System.out.println("Год выпуска: " + audi.getYear());
    }
}

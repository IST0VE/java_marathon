package day5;

public class Motorbike {

    private String model;
    private String color;
    private int year;

    public Motorbike (String model){
        if (model.isEmpty()) {
            System.out.println("Вы не ввели модель мотоцикла");
        } else {
            this.model = model;
        }
    }

    public Motorbike (String model, String color){
        if (model.isEmpty()) {
            System.out.println("Вы не ввели модель мотоцикла");
        } else {
            this.model = model;
        }
        if (color.isEmpty()) {
            System.out.println("Вы не ввели цвет мотоцикла");
        } else {
            this.color = color;
        }
    }

    public Motorbike (String model, String color, int year){
        if (model.isEmpty()) {
            System.out.println("Вы не ввели модель мотоцикла");
        } else {
            this.model = model;
        }
        if (color.isEmpty()) {
            System.out.println("Вы не ввели цвет мотоцикла");
        } else {
            this.color = color;
        }
        if (year < 1885) {
            System.out.println("Вы ввели неправильную дату");
        } else {
            this.year = year;
        }
    }

    public String getModel(){
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}

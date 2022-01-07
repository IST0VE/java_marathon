package day5;

public class Car {

    private String model;
    private String color;
    private int year;

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Вы не ввели модель автомобиля");
        } else {
            this.model = model;
        }
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Вы не ввели цвет автомобиля");
        } else {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        if (year < 1886) {
            System.out.println("Вы ввели неправильную дату");
        } else {
            this.year = year;
        }
    }

    public int getYear() {
        return year;
    }
}

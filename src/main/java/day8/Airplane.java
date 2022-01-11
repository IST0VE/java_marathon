package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length; //float
    private int weight; //float
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public float getFuel() {
        return fuel;
    }

    public void info(){
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year +
                ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int n){
        fuel += n;
    }

    public static void compareAirplanes(Airplane first, Airplane second){
        if (first.length > second.length)
            System.out.println("Первый самолет длиннее");
        else if (first.length < second.length)
            System.out.println("Второй самолет длиннее");
        else
        System.out.println("Длины самолетов равны");
    }
    @Override
    public String toString(){
        return "Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " +
                length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }
}

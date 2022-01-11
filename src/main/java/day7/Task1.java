package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airbusA320NEO = new Airplane("Airbus", 2020, 37, 42100);

        Airplane boeing777_800 = new Airplane("Boeing", 2019, 40, 42410);

        Airplane.compareAirplanes(airbusA320NEO, boeing777_800);
    }
}
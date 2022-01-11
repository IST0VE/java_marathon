package day8;

public class Task1 {
    public static void main(String[] args) {
        String string1;
        int x1 = 20000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= x1; i++){
            string1 = i + " ";
            System.out.print(string1);
            //string1 += i + " ";
        }
        //System.out.println(string1);
        System.out.println();
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        StringBuilder string2 = new StringBuilder();
        int x2 = 20000;
        startTime = System.currentTimeMillis();
        for (int i = 0; i <= x2; i++){
            string2.append(i).append(" ");
        }
        stopTime = System.currentTimeMillis();
        System.out.println(string2);
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }
}

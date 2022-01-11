package day7;


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] power = new int[10];
        for (int i = 0; i < power.length; i++){
            power[i] = random.nextInt(10) + 90;
        }

        Player p1 = new Player(power[0]);
        Player p2 = new Player(power[1]);
        Player p3 = new Player(power[2]);
        Player p4 = new Player(power[3]);
        Player p5 = new Player(power[4]);
        Player p6 = new Player(power[5]);
        Player p7 = new Player(power[6]);
        //Player p8 = new Player(power[7]);
        Player.info();
        System.out.println(p1.getStamina());
        for (int i = 0; i <= power[0]; i++){
            p1.run();
        }
        System.out.println(p1.getStamina());
        Player.info();
    }
}

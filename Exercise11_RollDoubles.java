package Lec5;

import java.util.Random;

public class Exercise11_RollDoubles {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int dice1, dice2;

        do {
            count++;
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            System.out.println("Lan " + count + ": " + dice1 + " va " + dice2);
        } while (dice1 != dice2);

        System.out.println("Ban da do duoc cap giong nhau sau " + count + " lan.");
    }
}

package Lec5;

import java.util.Random;
import java.util.Scanner;

public class Exercise7_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Tro choi doan so tu 1 den 100!");

        while (guess != secretNumber) {
            System.out.print("Nhap so ban doan: ");
            guess = scanner.nextInt();

            if (guess > secretNumber) {
                System.out.println("So ban doan lon hon so bi mat.");
            } else if (guess < secretNumber) {
                System.out.println("So ban doan nho hon so bi mat.");
            } else {
                System.out.println("Chuc mung! Ban da doan dung.");
            }
        }
    }
}

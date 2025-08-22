package Lec5;

import java.util.Scanner;

public class Exercise12_PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen lon hon 1: ");
        int N = scanner.nextInt();

        if (N <= 1) {
            System.out.println("So khong hop le.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N + " la so nguyen to.");
            } else {
                System.out.println(N + " khong phai so nguyen to.");
            }
        }
    }
}

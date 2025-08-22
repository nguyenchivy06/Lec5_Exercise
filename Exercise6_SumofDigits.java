package Lec5;

import java.util.Scanner;

public class Exercise6_SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen duong: ");
        int number = scanner.nextInt();

        int tong = 0;
        while (number > 0) {
            int chuSo = number % 10;
            tong += chuSo;
            number /= 10;
        }

        System.out.println("Tong cac chu so la: " + tong);
    }
}

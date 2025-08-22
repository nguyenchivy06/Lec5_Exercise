package Lec5;

import java.util.Scanner;

public class Exercise5_CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen khong am N: ");
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("Gia tri khong hop le! N phai la so nguyen khong am.");
        } else {
            long giaiThua = 1;
            for (int i = 1; i <= N; i++) {
                giaiThua *= i;
            }
            System.out.println("Giai thua cua " + N + " la: " + giaiThua);
        }
    }
}

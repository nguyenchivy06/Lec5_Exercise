package Lec5;

import java.util.Scanner;

public class Exercise9_CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        int number;

        do {
            System.out.print("Nhap mot so (nhap 0 de dung): ");
            number = scanner.nextInt();
            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        if (count > 0) {
            System.out.println("Trung binh cong la: " + (sum / count));
        } else {
            System.out.println("Khong co so nao duoc nhap.");
        }
    }
}

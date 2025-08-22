package Lec5;
import java.util.Scanner;
public class Exercise4_DrawaRight_AngledTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap h: ");
        int h = scanner.nextInt();
            

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
    }}} 
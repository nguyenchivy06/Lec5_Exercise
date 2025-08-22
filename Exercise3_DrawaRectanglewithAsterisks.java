package Lec5;
import java.util.Scanner;

public class Exercise3_DrawaRectanglewithAsterisks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu cao: ");
        int chieucao = scanner.nextInt();

        System.out.print("Nhap chieu rong: ");
        int chieurong = scanner.nextInt();

     
        for (int i = 1; i <= chieucao; i++) {
            for ( int j = 1 ; j <= chieurong; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}

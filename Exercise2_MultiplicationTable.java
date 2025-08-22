package Lec5;
import java.util.Scanner;
public class Exercise2_MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen tu 2 den 9:");
        int n = scanner.nextInt();
        for( int i = 1 ; i <= 10 ; i++ ){
           int ketqua = i * n;
            System.out.println("ket qua : " + ketqua);
        }
    }
}

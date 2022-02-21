package ss1.IntroductionJava.ThucHanh;

import java.util.Scanner;

public class KTNamNhuan {
    public static void main(String[] args) {
        int NamKT;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam muon kiem tra: ");
        NamKT = scanner.nextInt();
        if(NamKT % 4 == 0){
            if(NamKT % 100 == 0){
                if(NamKT % 400 == 0){
                    System.out.printf("%d is a leap year", NamKT);
                } else {
                    System.out.printf("%d is NOT a leap year", NamKT);
                }
            } else {
                System.out.printf("%d is a leap year", NamKT);
            }
        } else {
            System.out.printf("%d is NOT a leap year", NamKT);
        }
    }
}

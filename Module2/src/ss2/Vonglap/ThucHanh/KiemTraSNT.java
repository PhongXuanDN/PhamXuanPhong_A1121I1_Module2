package ss2.Vonglap.ThucHanh;

import java.util.Scanner;

public class KiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSNT;
        System.out.println("Nhap vao so nguyen : ");
        inputSNT = scanner.nextInt();
        boolean checkSNT = true;
        if(inputSNT>2) {
            for (int i = 2; i < inputSNT; i++) {
                if (inputSNT % i == 0) {
                    checkSNT = false;
                }
            }
            if (checkSNT)
                System.out.println(inputSNT + " la so nguyen to");
            else
                System.out.println(inputSNT + " Khong phai la so nguyen to");
        }
        else
            System.out.println(inputSNT + " Khong phai la so nguyen to");
    }
}

package ss1.IntroductionJava.ThucHanh;

import java.util.Scanner;

public class SDToanTu {
    public static void main(String[] args) {
        float cDai;
        float cRong;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai cua HCN: ");
        cDai = scanner.nextFloat();
        System.out.println("Nhap vao chieu rong cua HCN: ");
        cRong = scanner.nextFloat();
        float dTich = cDai * cRong;
        System.out.println("Dien tich cua HCN la: "+dTich);
    }
}

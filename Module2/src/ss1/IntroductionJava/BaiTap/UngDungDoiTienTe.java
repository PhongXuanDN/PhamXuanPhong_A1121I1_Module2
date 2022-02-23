package ss1.IntroductionJava.BaiTap;

import java.util.Scanner;

public class UngDungDoiTienTe {
    public static void main(String[] args) {
        int TiGia = 23000;
        int USD;
        int VietNam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tien USD chuyen doi sang tien Viet Nam: ");
        USD = scanner.nextInt();
        VietNam = USD * TiGia;
        System.out.printf("So tien duoc chuyen tu %d USD sang tien Viet Nam la: %d",USD,VietNam);

    }
}

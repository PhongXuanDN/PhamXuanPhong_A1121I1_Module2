package ss1.IntroductionJava.BaiTap;

import java.util.Scanner;

public class UngDungDoiTienTe {
    public static void main(String[] args) {
        int tiGia = 23000;
        int usd;
        int vietNam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tien USD chuyen doi sang tien Viet Nam: ");
        usd = scanner.nextInt();
        vietNam = usd * tiGia;
        System.out.printf("So tien duoc chuyen tu %d USD sang tien Viet Nam la: %d",usd,vietNam);

    }
}

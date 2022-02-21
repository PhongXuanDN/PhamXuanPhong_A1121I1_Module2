package ss1.IntroductionJava.ThucHanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        int ngay;
        System.out.print("Nhap vao ngay tu 2-8: ");
        Scanner scanner = new Scanner(System.in);
        ngay = scanner.nextInt();
        switch (ngay){
            case 2:
                System.out.println("Thu hai");break;
            case 3:
                System.out.println("Thu ba");break;
            case 4:
                System.out.println("Thu tu");break;
            case 5:
                System.out.println("Thu nam");break;
            case 6:
                System.out.println("Thu sau");break;
            case 7:
                System.out.println("Thu bay");break;
            case 8:
                System.out.println("Chu nhat");break;
            default:
                System.out.println("Ban nhap ngay khong dung");break;
        }
    }
}

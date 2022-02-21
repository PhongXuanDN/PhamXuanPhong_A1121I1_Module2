package ss2.Vonglap.ThucHanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SoluongTienVay, SoThang;
        float LaiSuat;
        System.out.println("Nhap vao so tien cho vay: ");
        SoluongTienVay = scanner.nextInt();
        System.out.println("Nhap vao so thang cho vay: ");
        SoThang = scanner.nextInt();
        System.out.println("Nhap vao lai suat trong 1 nam: ");
        LaiSuat = scanner.nextFloat();
        double Sotienlai=0;
        for (int i =0;i<SoThang;i++){
            Sotienlai += SoluongTienVay * (LaiSuat/100)/12*SoThang;
        }
        System.out.println("So tien phai tra la: "+Sotienlai);
    }
}

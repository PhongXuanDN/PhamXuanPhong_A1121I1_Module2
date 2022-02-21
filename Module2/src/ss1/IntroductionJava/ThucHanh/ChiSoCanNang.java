package ss1.IntroductionJava.ThucHanh;

import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        float ChieuCao;
        float CanNang;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao(met): ");
        ChieuCao = scanner.nextFloat();
        System.out.println("Nhap vao can nang(kg): ");
        CanNang = scanner.nextFloat();
        float ChiSo = CanNang / (ChieuCao*ChieuCao);
        if(ChiSo<18.5)
            System.out.println("BMI Underweight");
        else if(ChiSo<25)
            System.out.println("BMI Normal");
        else if(ChiSo<30)
            System.out.println("BMI Overweight");
        else
            System.out.println("BMI Obese");

    }
}

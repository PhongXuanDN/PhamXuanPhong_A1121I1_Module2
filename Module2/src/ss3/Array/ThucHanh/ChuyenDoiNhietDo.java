package ss3.Array.ThucHanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        int DoF;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao Do F:");
        DoF = scanner.nextInt();
        System.out.println("Do F ="+DoF+"-----> Do C ="+ChuyenDoiDoF(DoF));
    }
    public  static double ChuyenDoiDoF(int DoF){
        double DoC=  (5.0 / 9) * (DoF - 32);
        return DoC;
    }
}

package Ss4.Class.ThucHanh;

import java.util.Scanner;

public class ClassHCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai hinh chu nhat");
        int weight = scanner.nextInt();
        System.out.println("Nhap vao chieu rong hinh chu nhat");
        int hight = scanner.nextInt();
        HCN hcn = new HCN(weight,hight);
        System.out.println(hcn.display());
        System.out.println("Dien tich hcn: "+hcn.getArea());
        System.out.println("Chu vi hcn: "+hcn.ChuVi());
    }
}

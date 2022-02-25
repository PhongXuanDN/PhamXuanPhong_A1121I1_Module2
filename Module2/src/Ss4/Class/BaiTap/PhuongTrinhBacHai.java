package Ss4.Class.BaiTap;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh bac 2 co dang : ax^2 + bx + c = 0");
        System.out.println("Nhap vao a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap vao c: ");
        int c = scanner.nextInt();
        ClassPTBH ptbh = new ClassPTBH(a,b,c);
        System.out.println("Phuong trinh "+ptbh.display());
        if(a==0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nguyen");
                } else {
                    System.out.println("Phuong trinh vo so nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem: x=" + (-c / a));
            }
        }
            else{
                double delta = ptbh.getDiscriminant();
                if(delta ==0){
                    System.out.println("Phuong trinh co nghiem kep x= "+(-b/(2*a)));
                }else if(delta<0){
                    System.out.println("Phuong trinh vo nghiem");
                }else{
                    System.out.printf("Phuong trinh co 2 nghiem x1= %d, x2 = %d",ptbh.getRoot1(),ptbh.getRoot2());
                }
        }

    }
}

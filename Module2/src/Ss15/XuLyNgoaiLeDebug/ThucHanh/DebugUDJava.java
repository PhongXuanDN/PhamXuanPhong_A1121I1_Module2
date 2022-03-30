package Ss15.XuLyNgoaiLeDebug.ThucHanh;

import java.util.Scanner;

public class DebugUDJava {
    public static void main(String[] args) {
        System.out.println("Debug Ung Dung Java");
        System.out.println("Nhap vao phuong trinh bac nhat ax + b = 0: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao b: ");
        double b = scanner.nextDouble();
        if(a!=0){
            System.out.println("nghiem phuong trinh la: "+(-b/a));
        }
        else if (b!=0){
            System.out.println("Phuong trinh vo nghiem");
        }else {
            System.out.println("Phuong trinh vo so nghiem");
        }
    }
}

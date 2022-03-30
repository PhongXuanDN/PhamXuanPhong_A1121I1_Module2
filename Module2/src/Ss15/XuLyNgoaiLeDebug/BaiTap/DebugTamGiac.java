package Ss15.XuLyNgoaiLeDebug.BaiTap;

import java.util.Scanner;

public class DebugTamGiac {
    public static void main(String[] args) throws IllegalTriangleException{
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhap vao 3 canh cua tam giac: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a<=0||b<=0||c<=0){
            throw  new IllegalTriangleException("Nhap do dai canh phai lon hon 0...");
        }
        if(a+b<=c||b+c<=a||a+c<=b){
            throw new IllegalTriangleException("Tong do dai 2 canh phai lon hon canh con lai...");
        }

    }
}

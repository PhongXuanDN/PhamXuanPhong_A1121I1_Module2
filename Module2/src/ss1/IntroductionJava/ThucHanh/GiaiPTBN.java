package ss1.IntroductionJava.ThucHanh;

import java.util.Scanner;

public class GiaiPTBN {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh bac nhat co dang: ax + b = 0");
        System.out.println("Nhap vao a: ");
        a = scanner.nextInt();
        System.out.println("Nhap vao b: ");
        b = scanner.nextInt();
        System.out.println("Giai phuong trinh bac nhat co dang: "+a+"x + "+b +"= 0");
        if(a==0 && b==0){
            System.out.println("Phuong trinh "+a+"x + "+b +"= 0"+" co vo so nghiem");
        } else if(a==0){
            System.out.println("Phuong trinh "+a+"x + "+b +"= 0"+" vo nghiem");
        }
        else
            System.out.println("Phuong trinh "+a+"x + "+b +"= 0"+" co nghiem"+(-b/a));
    }
}

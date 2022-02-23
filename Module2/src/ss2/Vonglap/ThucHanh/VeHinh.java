package ss2.Vonglap.ThucHanh;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int Chon=-1;
        while (Chon!=0){
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Chon menu tu 0-3");
            Chon = scanner.nextInt();
            if(Chon== 1 || Chon==2 || Chon==3|| Chon == 0) {
                switch (Chon) {
                    case 1:
                        System.out.println("Draw the triangle");
                        System.out.println("******");
                        System.out.println("*****");
                        System.out.println("****");
                        System.out.println("***");
                        System.out.println("**");
                        System.out.println("*");
                        break;
                    case 2:
                        System.out.println("Draw the square");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        break;
                    case 3:
                        System.out.println("Draw the rectangle");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("No choice!");
                }
            }
            else {
                System.out.println("Moi ban Nhap lai");
            }
        }
    }
}

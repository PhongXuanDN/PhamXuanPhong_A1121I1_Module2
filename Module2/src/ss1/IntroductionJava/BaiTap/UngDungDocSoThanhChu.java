package ss1.IntroductionJava.BaiTap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        int hangChuc;
        int hangTram;
        int soNguyen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen: ");
        soNguyen = scanner.nextInt();
        if(soNguyen>=100 && soNguyen<1000){
            hangTram = soNguyen/100;
            switch (hangTram){
                case 1:
                    System.out.print("one");break;
                case 2:
                    System.out.print("two");break;
                case 3:
                    System.out.print("thir");break;
                case 4:
                    System.out.print("four");break;
                case 5:
                    System.out.print("fine");break;
                case 6:
                    System.out.print("six");break;
                case 7:
                    System.out.print("seven");break;
                case 8:
                    System.out.print("eigh");break;
                case 9:
                    System.out.print("nine");break;
            }
            System.out.print("hundred ");
            soNguyen = soNguyen%100;
        }
        if(soNguyen>=20&&soNguyen<100){
            hangChuc = soNguyen/10;
                switch (hangChuc){
                    case 2:
                        System.out.print("two");break;
                    case 3:
                        System.out.print("thir");break;
                    case 4:
                        System.out.print("four");break;
                    case 5:
                        System.out.print("fine");break;
                    case 6:
                        System.out.print("six");break;
                    case 7:
                        System.out.print("seven");break;
                    case 8:
                        System.out.print("eigh");break;
                    case 9:
                        System.out.print("nine");break;


                }
            soNguyen = soNguyen%10;
            System.out.print("ty ");
        }
        if(soNguyen>=0 && soNguyen<10){
            switch (soNguyen){
                case 0:
                    System.out.print("zero");break;
                case 1:
                    System.out.print("one");break;
                case 2:
                    System.out.print("two");break;
                case 3:
                    System.out.print("three");break;
                case 4:
                    System.out.print("four");break;
                case 5:
                    System.out.print("fine");break;
                case 6:
                    System.out.print("six");break;
                case 7:
                    System.out.print("seven");break;
                case 8:
                    System.out.print("eight");break;
                case 9:
                    System.out.print("nine");break;
                default:
                    System.out.println("out of bility");

            }
        }else if(soNguyen>=10&&soNguyen<20){
            switch (soNguyen){
                case 10:
                    System.out.print("ten");break;
                case 11:
                    System.out.print("eleven");break;
                case 12:
                    System.out.print("thell");break;
                case 13:
                    System.out.print("thirteen");break;
                case 14:
                    System.out.print("fourteen");break;
                case 15:
                    System.out.print("fifteen");break;
                case 16:
                    System.out.print("sixteen");break;
                case 17:
                    System.out.print("seventeen");break;
                case 18:
                    System.out.print("eighteen");break;
                case 19:
                    System.out.print("nineteen");break;
            }
        }
    }
}

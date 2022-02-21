package ss1.IntroductionJava.BaiTap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        int HangChuc;
        int HangTram;
        int SoNguyen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen: ");
        SoNguyen = scanner.nextInt();
        if(SoNguyen>=100 && SoNguyen<1000){
            HangTram = SoNguyen/100;
            switch (HangTram){
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
            SoNguyen = SoNguyen%100;
        }
        if(SoNguyen>=20&&SoNguyen<100){
            HangChuc = SoNguyen/10;
                switch (HangChuc){
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
            SoNguyen = SoNguyen%10;
            System.out.print("ty ");
        }
        if(SoNguyen>=0 && SoNguyen<10){
            switch (SoNguyen){
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
        }else if(SoNguyen>=10&&SoNguyen<20){
            switch (SoNguyen){
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

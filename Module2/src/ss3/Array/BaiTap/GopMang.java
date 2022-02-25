package ss3.Array.BaiTap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mangA, mangB;
        System.out.println("Nhập độ dài mảng a: ");
        mangA = scanner.nextInt();
        int[] arrayA = new int[mangA];
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("arrayA[" + i + "] = ");
            arrayA[i] = scanner.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("arrayA[" + i + "] = " + arrayA[i]);
        }
        System.out.println("Nhập độ dài mảng b: ");
        mangB = scanner.nextInt();
        int[] arrayB = new int[mangB];
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print("arrayB[" + i + "] = ");
            arrayB[i] = scanner.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("arrayB[" + i + "] = " + arrayB[i]);
        }

        int[] arrayC = new int[mangA+mangB];
        for (int i = 0; i < arrayC.length; i++) {
            if(i<arrayA.length) {
                arrayC[i] = arrayA[i];
            }
            else{
                arrayC[i] = arrayB[i-arrayA.length];
            }
        }
        System.out.println("Mang gop tu mang A va mang B: ");
        for (int i = 0; i < arrayC.length; i++) {
            System.out.println("arrayC[" + i + "] = " + arrayC[i]);
        }
    }
}

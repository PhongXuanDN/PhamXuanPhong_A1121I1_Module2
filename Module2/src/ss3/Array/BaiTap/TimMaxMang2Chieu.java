package ss3.Array.BaiTap;

import java.util.Scanner;

public class TimMaxMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        int sDong = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        int sCot = scanner.nextInt();
        int[][] Mang2C = new int[sDong][sCot];
        for (int i = 0;i<sDong;i++){
            for (int j=0;j<sCot;j++){
                System.out.println("array["+i+"]["+j+"]= ");
                Mang2C[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0;i<sDong;i++) {
            for (int j = 0; j < sCot; j++) {
                System.out.println("array[" + i + "][" + j + "]= " + Mang2C[i][j]);
            }
        }
        int max = Mang2C[0][0];
        for (int i = 0;i<sDong;i++) {
            for (int j = 0; j < sCot; j++) {
                if(max<Mang2C[i][j]){
                    max = Mang2C[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat cua mang 2 chieu la: "+max);
    }
}

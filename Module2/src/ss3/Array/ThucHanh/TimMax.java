package ss3.Array.ThucHanh;

import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int phanTu = scanner.nextInt();
        int[] arrayList = new int[phanTu];
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print("array[" + i + "] = ");
            arrayList[i] = scanner.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < arrayList.length; i++) {
            System.out.println("array[" + i + "] = " + arrayList[i]);
        }
        int max = arrayList[0];
        for (int i = 0;i<arrayList.length;i++){
            if(max<arrayList[i]){
                max = arrayList[i];
            }
        }
        System.out.println("max la: "+max);
    }
}

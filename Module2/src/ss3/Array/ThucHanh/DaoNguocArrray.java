package ss3.Array.ThucHanh;

import java.util.Scanner;

public class DaoNguocArrray {
    public static void main(String[] args) {
        int pTu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        pTu = scanner.nextInt();
        int[] arrayList = new int[pTu];
        for(int i =0 ; i<arrayList.length;i++){
            System.out.print("array["+i+"] = ");
            arrayList[i] = scanner.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0;i<arrayList.length;i++){
            System.out.println("array["+i+"] = "+arrayList[i]);
        }
        for(int i =0; i<arrayList.length/2;i++){
            for(int j =arrayList.length-1;j>arrayList.length/2;j--){
                int temp = arrayList[i];
                arrayList[i] = arrayList[j];
                arrayList[j] = temp;
            }
        }
        System.out.println("Dao nguoc: ");
        for (int i = 0;i<arrayList.length;i++){
            System.out.println("array["+i+"] = "+arrayList[i]);
        }
    }
}

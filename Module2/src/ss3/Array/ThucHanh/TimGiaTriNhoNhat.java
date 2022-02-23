package ss3.Array.ThucHanh;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int phanTu = scanner.nextInt();
        int[] arrayList = new int[phanTu];
        for(int i =0 ; i<arrayList.length;i++){
            System.out.print("array["+i+"] = ");
            arrayList[i] = scanner.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0;i<arrayList.length;i++){
            System.out.println("array["+i+"] = "+arrayList[i]);
        }
        System.out.println("Gia tri nho nhat: "+TimGTri(arrayList));
    }
    public static int TimGTri(int[] array){
        int Gtri = array[0];
        for(int i =0;i<array.length;i++){
            if(Gtri>array[i]){
                Gtri = array[i];
            }
        }
        return Gtri;
    }
}

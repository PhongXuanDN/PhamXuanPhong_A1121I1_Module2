package ss3.Array.ThucHanh;

import java.util.Scanner;

public class TimViTri {
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
        System.out.println("Nhap vao so muon tim vi tri: ");
        int number = scanner.nextInt();
        boolean check = false;
        for (int i = 0;i<arrayList.length;i++){
            if(number == arrayList[i]){
                System.out.printf("Vi tri cua %d trong mang la : %d",number,i);
                check = true;
                break;
            }
        }
        if(!check)
            System.out.println(number+"Khong co trong mang...");
    }
}

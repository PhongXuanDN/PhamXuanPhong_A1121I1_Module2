package ss3.Array.BaiTap;

import java.util.Scanner;

public class TimGTNNtrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i =0 ; i<array.length;i++){
            System.out.print("array["+i+"] = ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0;i<array.length;i++){
            System.out.println("array["+i+"] = "+array[i]);
        }
        int min = array[0];
        for (int i =1;i<array.length;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la: "+min);
    }
}

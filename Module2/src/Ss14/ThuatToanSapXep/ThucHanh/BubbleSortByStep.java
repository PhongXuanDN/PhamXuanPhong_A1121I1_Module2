package Ss14.ThuatToanSapXep.ThucHanh;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int size = scanner.nextInt();
        int arr[] =new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"]= ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("arr["+i+"]= "+arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int tamp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tamp;
                }
                for (int k = 0; k <arr.length ; k++) {
                    System.out.print("arr["+i+"]= "+arr[k] + " ");
                }
                System.out.println("---");
            }



        }
    }
}

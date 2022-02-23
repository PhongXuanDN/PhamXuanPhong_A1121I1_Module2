package ss3.Array.BaiTap;

import java.util.Scanner;

public class ThemPTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can chen: ");
        int number = scanner.nextInt();
        System.out.println("Nhap vi tri can chen: ");
        int index = scanner.nextInt();
        int [] array = {0,1,2,3,4,5,0,0,0,0};
        Them(array,number,index);

    }
    public static void Them(int [] array, int number, int index){
        if(index>=1 || index<=array.length-1) {
            for (int i = array.length -1; i >= index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = number;
        }else
            System.out.println("Lỗi...");

        for (int i = 0;i<array.length;i++){
            System.out.println("array["+i+"] = "+array[i]);
        }

    }
}

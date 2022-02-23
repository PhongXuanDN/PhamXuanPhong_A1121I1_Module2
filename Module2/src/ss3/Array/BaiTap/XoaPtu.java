package ss3.Array.BaiTap;

import java.util.Scanner;

public class XoaPtu {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao phan tu can xoa : ");
        int number = scanner.nextInt();
        XoaPtu(array,number);
    }
    public static void XoaPtu(int [] array , int a){
        int index = -1;
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(a == array[i]){
                index = i;
                count ++;
            }
            if(index>=0){
                for (int j=index;j<array.length-1;j++){
                    array[j] = array[j+1];
                }
            }

        }

        for (int i = 0;i<array.length-count;i++){
            System.out.println("array["+i+"] = "+array[i]);
        }
    }
}

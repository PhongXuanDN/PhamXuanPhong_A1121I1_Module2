package Ss13.Search.ThucHanh;

import java.util.Scanner;

public class BinarySort {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list, int key){
        int  low = 0;
        int high = list.length -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(key == list[mid]){
                return mid;
            }else if(key>list[mid]){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so muon tim kiem: ");
        int key = scanner.nextInt();
        System.out.println("Vi tri cua "+ key + ": "+binarySearch(list,key));
    }
}

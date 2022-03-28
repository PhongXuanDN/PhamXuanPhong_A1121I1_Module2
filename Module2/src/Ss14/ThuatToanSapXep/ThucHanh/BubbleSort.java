package Ss14.ThuatToanSapXep.ThucHanh;

public class BubbleSort {
    static int[] arr = {1,6,8,7,4,2,6,1,54,2,5,84};
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int tamp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tamp;
                }
            }
        }
        for (int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

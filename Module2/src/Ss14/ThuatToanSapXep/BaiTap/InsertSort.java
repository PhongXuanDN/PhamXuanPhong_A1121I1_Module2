package Ss14.ThuatToanSapXep.BaiTap;

public class InsertSort {
    static int[] array = {1,74,25,20,14,36};
    public static void main(String[] args) {
        for (int i = 1; i < array.length ; i++) {
            int min = array[i];
            for (int j = i-1; j >= 0 && array[j]>min; j--) {
                    array[j+1] = array[j];
                    array[j] = min;

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]= " + array[i]);
        }
    }
}

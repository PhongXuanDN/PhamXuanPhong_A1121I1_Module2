package Ss14.ThuatToanSapXep.ThucHanh;

public class SelectSort {
    static double[] list = {1.0,5.2,6.1,3.4,8.7,3.5};
    public static void main(String[] args) {
        for (int i = 0; i < list.length-1 ; i++) {
            double current = list[i];
            int min = i;
            for (int j = i+1; j < list.length ; j++) {
                if(list[min]>list[j]){
                    current = list[j];
                    min = j;
                }
            }
            list[min] =list[i];
            list[i] = current;

        }
        for (int i = 0; i < list.length; i++) {
            System.out.println("array["+i+"]= "+list[i]);
        }
    }
}

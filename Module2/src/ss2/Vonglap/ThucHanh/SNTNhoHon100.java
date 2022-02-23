package ss2.Vonglap.ThucHanh;

import java.util.Scanner;

public class SNTNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=4;
        System.out.print("2 ,  3,  ");
        while (count<100){
            boolean checkSNT = true;
            for(int i=2; i<count;i++){
                if(count%i==0){
                    checkSNT = false;
                }

            }
            if(checkSNT){
                System.out.print(count+"  ,");
            }
            count++;
        }
    }
}

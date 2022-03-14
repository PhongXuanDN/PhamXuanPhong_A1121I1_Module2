package ss2.Vonglap.BaiTap;

import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snt =2,count=4;
        System.out.print("2 ,  3,  ");
        while (snt<20){
            boolean checkSNT = true;
            for(int i=2; i<count;i++){
                if(count%i==0){
                    checkSNT = false;
                }

            }
            if(checkSNT){
                System.out.print(count+"  ,");
                snt++;
            }
            count++;
        }
    }
}

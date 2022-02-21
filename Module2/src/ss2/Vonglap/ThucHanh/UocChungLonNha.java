package ss2.Vonglap.ThucHanh;

import java.util.Scanner;

public class UocChungLonNha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhap vao so nguyen a= ");
        a = scanner.nextInt();
        System.out.println("Nhap vao so nguyen b= ");
        b = scanner.nextInt();
        int UCLN = 1;
        if(a==0 && b==0) {
            System.out.printf("Ca 2 so %d va %d khong co UCLN", a, b);
        }
        else if(a==0 || b==0){
            System.out.printf("Uoc chung lon nhat cua %d va %d la: %d",a,b,a+b);
        }
        else{
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Uoc chung lon nhat cua 2 so la: "+a);
        }

    }
}

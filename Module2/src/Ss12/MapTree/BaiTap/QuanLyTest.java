package Ss12.MapTree.BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<QuanLy> quanLIES = new ArrayList<>();
        quanLIES.add(new QuanLy("Banh","A003",21000));
        quanLIES.add(new QuanLy("Banh","A005",23000));
        quanLIES.add(1,new QuanLy("Keo","A001",23000));
        System.out.println(quanLIES);
        System.out.println("Nhập Id muốn sửa: ");
        String id = scanner.nextLine();
        for(int i =0;i<quanLIES.size();i++){
            QuanLyTest quanLyTest = (QuanLyTest) quanLIES;
            if(id == quanLIES.){

            }
        }
    }
}

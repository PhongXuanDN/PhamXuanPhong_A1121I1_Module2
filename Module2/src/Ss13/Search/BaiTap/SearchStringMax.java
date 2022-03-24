package Ss13.Search.BaiTap;

import java.util.Scanner;

public class SearchStringMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi :");
        String string = scanner.nextLine();
        char[] char1 = string.toCharArray();
        //sử dụng để chuyển đổi chuỗi thành các mảng ký tự. Nó trả về một mảng ký từ có độ dài tương đương độ dài của chuỗi.
        char[] char2 = new char[string.length()];
        int tmp = char1[0];

        for (int i = 0; i < char1.length; i++) {
            if (i == 0) {
                char2[i] = char1[i];
            }
            else
            if (char1[i] > tmp)
            {
                char2[i]=char1[i];
                tmp = char1[i];
            }
            else
                continue;
        }

        for (Character c : char2) {
            System.out.print(c);
        }
    }
}

package Ss16.IOFile.ThucHanh;
import java.io.*;
import java.util.Scanner;

public class ReadFileText {
    void writeFileText(){
        try{
            FileWriter fileWriter = new FileWriter("Text.txt");
            fileWriter.write("1\n2\n3\n4\n5\n6");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void readFileText(String path){
        try {
            // Đọc file theo đường dẫn
            File file = new File(path);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
    public static void main(String[] args) {


        System.out.println("Nhap duong dan File: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileText readFileText = new ReadFileText();
        readFileText.writeFileText();
        readFileText.readFileText(path);
    }
}

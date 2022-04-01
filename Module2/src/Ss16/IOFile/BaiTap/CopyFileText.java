package Ss16.IOFile.BaiTap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileText {
    void readFile(String path, String target){
        try {
            FileReader reader = new FileReader(path);
            FileWriter writer = new FileWriter(target);
            int character = -1;
            int count = 0;
            while ((character = reader.read()) != -1) {
                System.out.print((char)character);
                writer.write((char) character);
                count++;
            }
            writer.write("\nSo ki tu la: "+count);
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter("Text.txt");
            fileWriter.write("hello Word");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.writeFile();
        copyFileText.readFile("Text.txt","TimMax.txt");
        System.out.println("Ghi thanh cong");
    }
}

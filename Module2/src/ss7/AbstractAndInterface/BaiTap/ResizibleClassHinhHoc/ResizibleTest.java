package ss7.AbstractAndInterface.BaiTap.ResizibleClassHinhHoc;

public class ResizibleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println((int)circle.getDienTich());
        System.out.println((int)circle.resize(Math.random()*100));
    }
}

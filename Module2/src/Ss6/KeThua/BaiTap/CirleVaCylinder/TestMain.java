package Ss6.KeThua.BaiTap.CirleVaCylinder;

public class TestMain {
    public static void main(String[] args) {
        Cirle cirle = new Cirle();
        System.out.println(cirle.toString());
        Cirle cirle1  = new Cirle(4.5 , "red");
        System.out.println(cirle1.toString());
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.toString());
        Cylinder cylinder1 = new Cylinder(3.0);
        System.out.println(cylinder1.toString());
        Cylinder cylinder2 = new Cylinder(4.5,3.0,"Black");
        System.out.println(cylinder2.toString());
    }
}

package Ss5.Modifier_Method_Static.BaiTap;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: "+student.getName()+" Class: "+student.getClasses());
        student.setName("Phong");
        student.setClasses("A1121I1");
        System.out.println("Name: "+student.getName()+" Class: "+student.getClasses());
    }
}

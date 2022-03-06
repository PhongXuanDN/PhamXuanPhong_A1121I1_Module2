package Ss5.Modifier_Method_Static.BaiTap;

public class Student {
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    private String name = "John";

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    private String classes = "C02";
    public Student(){}


}

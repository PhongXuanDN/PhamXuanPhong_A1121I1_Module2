package Ss6.KeThua.BaiTap.CirleVaCylinder;

public class Cirle {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double radius = 1.0;
    private String color = "blue";
    public Cirle(){}
    public Cirle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getDienTich(){
        return this.radius * this.radius *3.14;
    }
    @Override
    public String toString(){
        return "Hinh trong co ban kinh: "+this.radius + " va co mau: "+ this.color;
    }
}

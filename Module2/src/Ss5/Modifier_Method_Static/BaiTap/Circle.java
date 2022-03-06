package Ss5.Modifier_Method_Static.BaiTap;

public class Circle {
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

    private double radius;
    private String color;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*3.14;
    }

}

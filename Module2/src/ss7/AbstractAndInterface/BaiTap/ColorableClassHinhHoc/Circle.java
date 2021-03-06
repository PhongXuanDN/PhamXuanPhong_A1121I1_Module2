package ss7.AbstractAndInterface.BaiTap.ColorableClassHinhHoc;

public class Circle extends Shape implements Colerble{
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    private double radius = 1.0;
    public double getChuvi(){
        return radius*2*3.14;
    }
    public double getDienTich(){
        return radius*radius*3.14;
    }
    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
    public String howToColor(){
        return "Color all four sides";
    }
    public void KiemTraColor(){
        if(getColor() == "Colorable"){
            System.out.println(howToColor());
        }
        else
            System.out.println(toString());
    }
}

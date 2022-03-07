package ss7.AbstractAndInterface.BaiTap.ColorableClassHinhHoc;

public class Rectangle extends Shape {
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double width = 1.0;
    private double height = 1.0;
    public Rectangle(){}
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width,double height,String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return (this.width+this.height)*2;
    }
    public double getPerimeter(){
        return this.height * this.width;
    }
    @Override
    public String toString(){
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}

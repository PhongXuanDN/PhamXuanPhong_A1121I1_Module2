package Ss6.KeThua.BaiTap.CirleVaCylinder;

public class Cylinder extends Cirle {
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height = 1.0;
    public  Cylinder(){}
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height, double radius , String color){
        super(radius, color);
        this.height = height;
    }
    public double getThetich(){
        return super.getRadius() * super.getRadius() * this.height * 3.14;
    }
    @Override
    public String toString(){
        return "Hinh trụ co ban kinh : " + super.getRadius() + " chieu cao: "+ this.height + " va mau: "+super.getColor();
    }

}

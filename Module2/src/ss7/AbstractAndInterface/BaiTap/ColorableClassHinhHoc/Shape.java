package ss7.AbstractAndInterface.BaiTap.ColorableClassHinhHoc;

public class Shape {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    private String color = "green";
    private boolean filled = true;
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape(){}
    @Override
    public String toString(){
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}

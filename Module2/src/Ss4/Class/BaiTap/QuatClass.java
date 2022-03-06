package Ss4.Class.BaiTap;

public class QuatClass {
    public int getSlow() {
        return Slow;
    }

    public void setSlow(int slow) {
        Slow = slow;
    }

    public int getMedium() {
        return Medium;
    }

    public void setMedium(int medium) {
        Medium = medium;
    }

    public int getFast() {
        return Fast;
    }

    public void setFast(int fast) {
        Fast = fast;
    }

    private int Slow = 1;
    private int Medium = 2;
    private int Fast = 3;
    private int speed=1;
    private boolean on= false;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

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

    private double radius = 5;
    private String color= "Blue";
    }



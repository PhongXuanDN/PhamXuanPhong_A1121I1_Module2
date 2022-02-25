package Ss4.Class.BaiTap;

public class ClassPTBH {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    private int b;
    private int c;
    public ClassPTBH(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        return  (-b-Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public double getRoot2(){
        return  (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public String display(){
        return a+"*"+"x^2 + "+b+"x +"+c+"= 0";
    }

}

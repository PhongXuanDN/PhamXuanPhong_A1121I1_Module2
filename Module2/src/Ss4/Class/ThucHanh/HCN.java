package Ss4.Class.ThucHanh;

public class HCN {
    int weight;
    int hight;
    public HCN(int weight, int hight){
        this.weight = weight;
        this.hight = hight;
    }
    public HCN(){}
    public double getArea(){
        return weight*hight;
    }
    public double ChuVi(){
        return (weight+hight)*2;
    }
    public String display(){
        return "weight= "+ weight + ": hight = "+hight;
    }
}

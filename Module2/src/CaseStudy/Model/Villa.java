package CaseStudy.Model;

import java.util.Date;

public class Villa extends Facility {
    private String standard;

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    private double areaPool;
    private int numberFloor;
    public Villa(){}
    public Villa(String standard, double areaPool, int numberFloor){
        this.standard = standard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }
    public Villa(String standard, double areaPool, int numberFloor, double area, double cost, int numberOfPeople, Date reantalType){
        super(area,cost,numberOfPeople,reantalType);
        this.standard = standard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }
}

package CaseStudy.Model;

import java.util.Date;

public class Villa extends Facility {
    private String standard;
    private double areaPool;
    private int numberFloor;

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


    public Villa(){}
    public Villa(String standard, double areaPool, int numberFloor){
        this.standard = standard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }
    //String idFacility, double area, int rentalPrice, int rentaPeopleMax, String rentalType
    public Villa(String id, double area, int rentalPrice, int rentaPeopleMax, String rentalType,String standard, double areaPool, int numberFloor){
        super(id,area,rentalPrice, rentaPeopleMax,rentalType);
        this.standard = standard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }
}

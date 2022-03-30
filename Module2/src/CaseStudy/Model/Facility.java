package CaseStudy.Model;

import java.util.Date;

public abstract class Facility {
    private String idFacility;
    private String name;
    private double area = 1.0;
    private int rentalPrice;
    private int rentaPeopleMax;
    private String rentalType;

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getRentaPeopleMax() {
        return rentaPeopleMax;
    }

    public void setRentaPeopleMax(int rentaPeopleMax) {
        this.rentaPeopleMax = rentaPeopleMax;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }


    public Facility(){}
    public Facility(String idFacility, double area, int rentalPrice, int rentaPeopleMax, String rentalType){
        this.idFacility = idFacility;
        this.area = area;
        this.rentalPrice = rentalPrice;
        this.rentaPeopleMax = rentaPeopleMax;
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", rental price=" + rentalPrice +
                ", rental People Max=" + rentaPeopleMax +
                ", rentalType=" + rentalType +
                '}';
    }
}

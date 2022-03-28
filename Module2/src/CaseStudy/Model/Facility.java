package CaseStudy.Model;

import java.util.Date;

public abstract class Facility {
    private String name;

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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Date getRentalType() {
        return rentalType;
    }

    public void setRentalType(Date rentalType) {
        this.rentalType = rentalType;
    }

    private double area = 1.0;
    private double cost;
    private int numberOfPeople;
    private Date rentalType;
    public Facility(){}
    public Facility(double area, double cost, int numberOfPeople, Date rentalType){
        this.area = area;
        this.cost = cost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }
}

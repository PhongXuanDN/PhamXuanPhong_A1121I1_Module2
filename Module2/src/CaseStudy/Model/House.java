package CaseStudy.Model;

public class House extends Facility {
    public House() {
    }

    public House(String standardVilla, int floor) {
        this.standardVilla = standardVilla;
        this.floor = floor;
    }

    public House(String id, double area, int rentalPrice, int rentaPeopleMax, String styleRenta, String standardVilla, int floor) {
        super(id,area, rentalPrice, rentaPeopleMax, styleRenta);
        this.standardVilla = standardVilla;
        this.floor = floor;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    private String standardVilla;
    private int floor;

}

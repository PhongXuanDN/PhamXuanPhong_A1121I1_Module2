package CaseStudy.Model;

import java.util.Date;

public class Room extends Facility {
    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }
//String idFacility, double area, int rentalPrice, int rentaPeopleMax, String rentalType
    public Room(String id,double area, int rentaPrice, int rentaPeopleMax, String rentalType, String freeService) {
        super(id,area, rentaPrice, rentaPeopleMax, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    private String freeService;

}

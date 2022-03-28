package CaseStudy.Model;

import java.util.Date;

public class Room extends Facility {
    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(double area, double cost, int numberOfPeople, Date rentalType, String freeService) {
        super(area, cost, numberOfPeople, rentalType);
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

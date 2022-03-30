package CaseStudy.Model;

public class Booking {
    private String idBooking;
    private String dateStart;
    private String dateEnd;
    private Customer customer;
    private Facility facility;



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }


    public Booking() {
    }

    public Booking(String idBooking, String dateStart, String dateEnd, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.customer = customer;
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
}

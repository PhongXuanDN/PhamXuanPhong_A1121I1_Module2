package CaseStudy.Model;

public class Customer extends Person {
    public Customer() {
    }

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String id, String name, String sex, int idCard, int phone, String email, String typeOfGuest, String address) {
        super(name, sex, idCard, phone, email);
        this.id = id;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Loại khách, Địa chỉ
    private String id;
    private String typeOfGuest;
    private String address;

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

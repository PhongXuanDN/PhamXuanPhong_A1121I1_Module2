package CaseStudy.Model;

public class Customer extends Person {
    public Customer(int indexId, String name, int age, String sex, String idCard, String email, String typeOfGuest, String address) {
    }

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(int id, String name, String sex, String idCard, String email, String typeOfGuest, String address) {
        super(id, name, sex, idCard, email);
        // loai khach
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }



    //Loại khách, Địa chỉ
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

    @Override
    public String toString() {
        return "Customer{"+ super.toString()+
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

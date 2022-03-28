package CaseStudy.Model;

import java.util.Date;

public abstract class Person {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        sex = sex;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }

    public Person(String name, String sex, int idCard, int phone, String email) {

        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
    }


    private String name;
    private String sex;
    private int idCard;
    private int phone;
    private String email;
}

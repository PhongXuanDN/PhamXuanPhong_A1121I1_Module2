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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }

    public Person(int id,String name, String sex, String idCard, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.email = email;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String name;
    private String sex;
    private String idCard;
    private String email;

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", email='" + email;
    }
}

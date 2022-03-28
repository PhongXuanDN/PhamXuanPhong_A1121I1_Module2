package CaseStudy.Model;

import java.util.Date;

public class Employee extends Person {
    public Employee() {
    }

    public Employee(String id, String level, String position, int salary) {
        this.id = id;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id,
                    String name,
                    String sex,
                    int idCard,
                    int phone,
                    String email,
                    String level,
                    String position,
                    int salary) {
        super(name, sex, idCard, phone, email);
        this.id = id;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Trình độ, Vị trí, lương
    private String id;
    private String level;
    private String position;
    private int salary;

}

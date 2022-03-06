package Ss5.Modifier_Method_Static.ThucHanh;

public class Car {
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineer() {
        return engineer;
    }

    public void setEngineer(String engineer) {
        this.engineer = engineer;
    }

    private String engineer;

    static int count;

    public Car(String name, String engineer){
        this.name = name;
        this.engineer = engineer;
        count++;
    }
    public Car(){}
}

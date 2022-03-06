package Ss5.Modifier_Method_Static.ThucHanh;

public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Madaz 3","Khong biet 1");
        System.out.println("So xe: " + Car.count);
        Car car2 = new Car("Madaz 3","Khong biet 2");
        System.out.println("So xe: " + Car.count);
    }
}

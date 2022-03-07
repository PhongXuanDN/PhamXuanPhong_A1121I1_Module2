package ss7.AbstractAndInterface.ThucHanh.AnimalVaEdible;

public class Chiken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chiken: gáy";
    }
    @Override
    public String howToEat(){
        return "eat fruit";
    }
}

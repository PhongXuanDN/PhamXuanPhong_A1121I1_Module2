package ss7.AbstractAndInterface.ThucHanh.AnimalVaEdible;

public class AnimalVaEdibleTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chiken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chiken) {
                Edible edibler = (Chiken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
    }


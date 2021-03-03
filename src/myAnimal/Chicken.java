package myAnimal;

import myInterface.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public void makeSound() {
        System.out.println("Chicken : O O O O");
    }

    @Override
    public String hoToEat() {
        System.out.println("NUONG - KFC");
        return null;
    }
}

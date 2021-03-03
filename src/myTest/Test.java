package myTest;

import myAnimal.Animal;
import myAnimal.Chicken;
import myAnimal.Tiger;
import myFruit.Apple;
import myFruit.Fruit;
import myFruit.Orange;
import myInterface.Edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal ani : animals) {
            ani.makeSound();

            // check va ef kieu ani -> Chicken
            // dung bien tham chieu edi de goi den phuong thuc hoToEat() cua Chicken;
            if (ani instanceof Chicken) {
                Edible edible = (Chicken) ani;
                System.out.println(edible.hoToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];

        fruits[0] = new Orange();
        fruits[1] = new Apple();

        for (Fruit fru : fruits) {
            System.out.println(fru.hoToEat());
        }
    }
}

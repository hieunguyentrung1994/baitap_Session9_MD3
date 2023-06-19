package rickkei.academy;

import rickkei.academy.animals.Animal;
import rickkei.academy.animals.Chicken;
import rickkei.academy.animals.Tiger;
import rickkei.academy.edible.IEdible;

public class Main {
    public static void main(String[] args) {

       //write your code here
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
        Object animal = null;
        if (animal instanceof Chicken) {
            IEdible edible = (Chicken) animal;
            System.out.println(edible.howToEat());
        }
    }
}
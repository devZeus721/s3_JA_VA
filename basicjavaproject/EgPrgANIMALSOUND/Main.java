package basicjavaproject.EgPrgANIMALSOUND;

import basicjavaproject.EgPrgANIMALSOUND.Animal;
import basicjavaproject.EgPrgANIMALSOUND.Cat;
import basicjavaproject.EgPrgANIMALSOUND.Dog;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.makeSound();
        cat.makeSound();
    }
}
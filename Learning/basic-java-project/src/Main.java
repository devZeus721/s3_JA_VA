public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        
        dog.displayInfo();
        dog.makeSound();
        
        cat.displayInfo();
        cat.makeSound();
    }
}
interface Animal {
    void sound();
}

interface Mammal {
    void feed();
}
class Dog implements Animal, Mammal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
    @Override
    public void feed() {
        System.out.println("Feeding milk");
    }
}
public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.feed();
    }
}

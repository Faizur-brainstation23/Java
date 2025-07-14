
    abstract class Animal {
        public void eat() {
            System.out.println("Eating...");
        }


        public abstract void sound();
    }
    class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Bark");
        }
    }

    public class Abstract {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat();
            dog.sound();
        }
    }





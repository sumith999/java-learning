package Week1.basics;

interface Animals {
    void sound();
    void eat();
}

interface Swimmable {
    void swim();
}

class dog implements Animals {
    public void sound() {
        System.out.println("Bark");
    }

    public void eat() {
        System.out.println("Dog eats");
    }
}

class Duck implements Animals, Swimmable {
    public void sound() {
        System.out.println("Quack");
    }

    public void eat() {
        System.out.println("Duck eats");
    }

    public void swim() {
        System.out.println("Duck swims");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.eat();

        Duck duck = new Duck();
        duck.sound();
        duck.swim();
    }
}

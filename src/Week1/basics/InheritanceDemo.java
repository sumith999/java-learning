package Week1.basics;

class Animal{
    void eat(){
        System.out.println("I can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("I can bark");
    }
}
class Pitbull extends Animal{
    void bite(){
        System.out.println("I can bite");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Pitbull d = new Pitbull();
        Dog b = new Dog();
        b.bark();
        d.eat();
//        d.bark();
        d.bite();
    }
}


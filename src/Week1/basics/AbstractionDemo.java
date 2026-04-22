package Week1.basics;

abstract class Car {
    public abstract void drive();
    public abstract void fly();
    public void playmusic(){
        System.out.println("Playing the music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving the Car....");
    }
}

class Update extends WagonR{
    public void fly(){
        System.out.println("Car can fly");
    }
}
public class AbstractionDemo {
    public static void main(String[] args){
        WagonR w = new Update();
        w.drive();
        w.playmusic();
        w.fly();
    }
}

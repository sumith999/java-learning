package Week1.basics;

class Counter {
    static int count = 0;
    String name;

    // static block — runs once when class loads
    static {
        System.out.println("Class loaded");
        count = 0;
    }

    Counter(String name) {
        this.name = name;
        count++;
    }

    // static method
    static void showCount() {
        System.out.println("Total objects: " + count);
    }

    void show() {
        System.out.println("Name: " + name);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter("Sumith");
        Counter c2 = new Counter("Rahul");
        Counter c3 = new Counter("Priya");

        c1.show();
        c2.show();
        c3.show();
        // static method called using class name
        Counter.showCount();
    }
}
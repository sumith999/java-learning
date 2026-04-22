package Week1.basics;

class Studentt {
    String name;
    int age;

    Studentt(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Studentt s1 = new Studentt("Sumith", 21);
        s1.show();
    }
}
package Week1.basics;

class Student{
    String name;
    int age;
    Student(String name){
        this(name,20);
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Bhai mera naam " + name + " aur umar " + age);
    }
}
public class ConstructorDemo {
    public static void main (String[] args){
//        Student s1 = new Student();
//        System.out.println(s1.id + " " + s1.name);
        Student u1 = new Student("Sumith");
        Student u2  = new Student("Akhil",50);
        System.out.println(u1.name);
        System.out.println(u2.name);

    }
}

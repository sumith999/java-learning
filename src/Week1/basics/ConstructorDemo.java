package Week1.basics;

class User{
    String name;
    int age;
    User(String name){
       this(name,0);
    }
    User(String naam, int umar){
        this.name = naam;
        this.age = umar;
        System.out.println("Bhai mera naam " + name + " aur umar " + age);
    }
}
public class ConstructorDemo {
    public static void main (String[] args){
//        Student s1 = new Student();
//        System.out.println(s1.id + " " + s1.name);
        User u1 = new User("Sumith");
        User u2  = new User("Akhil",50);
        System.out.println(u1.name);
        System.out.println(u2.name);

    }
}

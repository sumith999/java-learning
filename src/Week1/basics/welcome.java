package Week1.basics;
public class welcome {
    String name;
    int age;

    void details() {
        System.out.println(name);
        System.out.println(age);
    }
}
  class Main{
        public static void main(String[] args){
            welcome s1 = new welcome();
            s1.name = "Poojary";
            s1.age = 20;
            s1.details();
        }
    }


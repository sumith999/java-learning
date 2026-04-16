package Week1.basics;

public class MethodOverloadingDemo {
    int add(int a , int b){
        return a + b;
    }
    int add(int a , int b, int c){
        return a + b + c;
    }
    double add(double a , double b){
        return a + b;
    }
    String add (String a , String b){
        return a + b;
    }
    double add(int a , double b){
        return a + b;
    }
    int add(int... numbers){
        int  sum = 0;
        for (int n: numbers){
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args){
        MethodOverloadingDemo m = new MethodOverloadingDemo();
        System.out.println(m.add(1,6));
        System.out.println(m.add(1,6, 7));
        System.out.println(m.add(10.0,60.0));
        System.out.println(m.add("Goat ","Java"));
        System.out.println(m.add(5,7.6));
        System.out.println(m.add(3,4,5,6,7,8,912));
    }
}

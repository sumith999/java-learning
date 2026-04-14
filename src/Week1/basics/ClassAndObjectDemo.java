package Week1.basics;

class Calculator{
    public int add(int n1,int n2){
        return n1 + n2;
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        int result = obj.add(4,7);
        System.out.println(result);

    }
}

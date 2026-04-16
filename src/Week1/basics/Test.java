package Week1.basics;
// passing the current object as argument
public class Test {
    void display(Test obj){
        System.out.println("Method called "+ obj);
    }
    void show(){
        display(this);
    }
    public static void  main(String[] args){
        Test t1 = new Test();
        Test t2 = new Test();
        t1.show();
        t2.display(t1);
    }
}

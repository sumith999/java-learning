package Week1.basics;

class AA{
    public void display(){
        System.out.println("I am A");
    }
}
class BB extends AA{
    @Override
    public void display(){
        System.out.println("I am B");
        super.display();
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        BB obj = new BB();
        obj.display();
    }
}

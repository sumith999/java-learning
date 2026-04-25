package Week2.exceptions;

class MyResource implements AutoCloseable{
    MyResource() {
        System.out.println("Resource opened");
    }
        public void dowork(){
            System.out.println("Do some work man");
        }
        public void close(){
        System.out.println("Resource closed");
        }
    }

public class TryWithResourcesDemo {
    public static void main(String [] args){
        try(MyResource r1 = new MyResource()){
            r1.dowork();
        }
        System.out.println("The work is done");
    }
}

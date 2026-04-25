package Week2.multithreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            t.join();  // main thread waits until MyThread finishes execution
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Main thread done"); // this runs only after MyThread completes
    }
}

package Week2.multithreading;

class SleepThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("SleepThread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

class YieldThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("YieldThread: " + i);
            Thread.yield();
        }
    }
}

public class SleepYieldDemo {
    public static void main(String[] args) {
        SleepThread t1 = new SleepThread();
        YieldThread t2 = new YieldThread();
        t1.start();
        t2.start();
    }
}

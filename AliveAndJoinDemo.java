class MyThread implements Runnable{
    Thread t;
    String name;

    MyThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);

        System.out.println("Child Thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread " + this.name + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread" + this.name);
    }
}


 class MultiThreadDemo {
    public static void 
    main(String[] args) {
        new MyThread("One");
        new MyThread("Two");
        new MyThread("Three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}

public class AliveAndJoinDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("One");
        MyThread mt2 = new MyThread("Two");
        MyThread mt3 = new MyThread("Three");

        System.out.println("Thread One is alive: " + mt1.t.isAlive());
        System.out.println("Thread Two is alive: " + mt2.t.isAlive());
        System.out.println("Thread Three is alive: " + mt3.t.isAlive());

        try {
            System.out.println("Waiting for threads to finish.");
            mt1.t.join();
            mt2.t.join();
            mt3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Thread One is alive: " + mt1.t.isAlive());
        System.out.println("Thread Two is alive: " + mt2.t.isAlive());
        System.out.println("Thread Three is alive: " + mt3.t.isAlive());
    }
    
}

class NewThread implements Runnable { 
    Thread t;
    NewThread() {
        // Create a new thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread
    }   
    // This is the entry point for the thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }   
}

public class CreatingThread {
    // This is the main method
    // It creates a new thread and starts it
    // It also prints the current thread's name and sleeps for 1 second
    public static void main(String args[]) {
         new NewThread(); // Create a new thread
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread");
    }
}


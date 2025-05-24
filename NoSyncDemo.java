class NoSynchThread extends Thread {
    String msg;

    public NoSynchThread(String s) {
        msg = s;
    }

    public static void DisplayMessage(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("]");
    }

    public void run() {
        DisplayMessage(msg);
    }
}

public class NoSyncDemo {
    public static void main(String[] args) {
        NoSynchThread c1 = new NoSynchThread("1st task");
        c1.start();
        NoSynchThread c2 = new NoSynchThread("2nd task");
        c2.start();
    }
}

class SyncThread  extends Thread {
    String msg;
    public SyncThread(String s) {
        msg = s;
    }
    synchronized public static void DisplayMessage(String msg) {
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
public class SyncDemo {
    public static void main(String[] args) {
        SyncThread c1 = new SyncThread("1st task");
        c1.start();
        SyncThread c2 = new SyncThread("2nd task");
        c2.start();
    }
}

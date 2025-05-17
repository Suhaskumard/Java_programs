public class CurrentThreadDemo {
    public static void main(String[] args) {
        // Get the current thread
        Thread t = Thread.currentThread();
        // Print the name of the current thread
        System.out.println("Current thread name: " + t );
        t.setName("MyThread");
        System.out.println("Current thread name: " + t );
         try {
             
          for(int n=5;n>0;n--)  
         {
             System.out.println(n);
             Thread.sleep(1000);
         }
         }
         catch(InterruptedException e) {
             System.out.println("Thread interrupted: " + e);
         }
}
}
package Basic;

public class VolatileMemoryDemo {
    /**
     * This keyword is useful in Multithreaded Environments.
     * The volatile keyword ensures that the value of the variable is always read from main memory.
     * Updated value is visible to all threads if modified.
     */

    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void run() {
        while (running) {
            
        }
        System.out.println("Stopped.");
    }

    public static void main(String[] args) {
        VolatileMemoryDemo demo = new VolatileMemoryDemo();

        Thread thread = new Thread(demo::run);
        thread.start();

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        demo.stop(); 
    }
}

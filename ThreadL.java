// Thread Life Cycle

public class ThreadL extends Thread {
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ThreadL jv = new ThreadL();
        jv.start();

        // # New -> Instance of thtread created which is not yet started by invoking start()
        // # Runnable -> After invocation of start() and before it is selected to be run by the scheduler
        // # Running -> After thread scheduler has selected it
        // # Nonrunnable -> Thread alive, not eligible to run
        // # Terminated -> new() method has exited
    }
}

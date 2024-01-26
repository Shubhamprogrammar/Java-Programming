// Creating a java thread using runnable interface

class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 51; i++) {
            System.out.println("I am Thread implemented from runnable interface");
        }
    }
    
}
class ThreadRunnable2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 51; i++) {
            System.out.println("Shubham implemented the runnable interface");
        }
    }
    
}
public class ThreadR {
    public static void main(String[] args) {
        ThreadRunnable bullet1 = new ThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        ThreadRunnable2 bullet2 = new ThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}

// Thread Methods

class ThreadMeth extends Thread{
    public ThreadMeth(String name){
        super(name);
        System.out.println("Your Name is: "+name);
    }

    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello Everyone!!! "+i+" "+this.getName());
            // try {
            //     Thread.sleep(500);
            // } catch (Exception e) {
            //     System.out.println(e);
            // }
        }
    }
}
class ThreadMeth2 extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello Everyone!!! ");
        }
    }
}

public class ThreadMt {
    public static void main(String[] args) {
        ThreadMeth th = new ThreadMeth("Shaan");
        ThreadMeth2 th2 = new ThreadMeth2();
        // th.setDaemon(true);
        th.start();        
        // try {
        //     th.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }        
        th2.start();
    }
}

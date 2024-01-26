// Thread Priorities

class ThreadConstruct1 extends Thread{
    public ThreadConstruct1(String name){
        super(name);
        System.out.println("Your Name is: "+name);
    }

    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello Everyone!!! "+i+" "+this.getName());
        }
    }
}
public class ThreadP {
    public static void main(String[] args) {
        ThreadConstruct1 th = new ThreadConstruct1("Shubham");
        ThreadConstruct1 th2 = new ThreadConstruct1("Ram");
        ThreadConstruct1 th3 = new ThreadConstruct1("Krishn");
        ThreadConstruct1 th4 = new ThreadConstruct1("Sita");
        ThreadConstruct1 th5 = new ThreadConstruct1("Radhe");
        th5.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}

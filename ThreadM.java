// Creating thread by extending thread class

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i = 51; i < 101; i++) {
            System.out.println(i);
        }
    }
}
 
public class ThreadM {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}

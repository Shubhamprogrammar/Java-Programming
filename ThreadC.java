// Thread constructors

class ThreadConstruct extends Thread{
    // public ThreadConstruct(String name){
    //     super(name);
    //     System.out.println("Your Name is: "+name);
    // }
    public ThreadConstruct(Runnable r, String name){
        super(r,name);
    }

    public void run(){
        // for (int i = 0; i < 20; i++) {
        //     System.out.println("I am Thread ");
        // }
        System.out.println("Hello Everyone!!!");
    }
    public void shubh(){
        System.out.println("Good Morning...");
    }
}
class MyTh1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Shubham Maurya");
    }
    
}
public class ThreadC {
    public static void main(String args[]) {
       /*  ThreadConstruct th = new ThreadConstruct("Shubham");
        ThreadConstruct th2 = new ThreadConstruct("Ram");
        th.start();
        th2.start();
        System.out.println("The id of the thread is: "+ th.getId());
        System.out.println("The name of the thread is: "+ th.getName());
        System.out.println("The class of the thread is: "+ th.getClass());
        System.out.println("The State of the thread is: "+ th.getState());
        System.out.println("The id of the thread is: "+ th2.getId());
        System.out.println("The name of the thread is: "+ th2.getName());
        System.out.println("The State of the thread is: "+ th2.getState());*/
        MyTh1 mt = new MyTh1();
        ThreadConstruct th = new ThreadConstruct(mt, "Shubham");
        th.start();
        System.out.println("The id of the thread is: "+ th.getId());
        System.out.println("The name of the thread is: "+ th.getName());
        th.shubh();
    }
}

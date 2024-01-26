// import java.util.Scanner;
import learner.Javatut65;

class using extends Javatut65{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
        // System.out.println(a);
    }
}
public class Modifiers {
    public static void main(String[] args) {
        
        Javatut65 j = new Javatut65();
             
        // Global Error
        System.out.println(j.x);
        // System.out.println(j.y);
        // System.out.println(j.z);
        // System.out.println(j.a); 
        

        // Subclass
        using u = new using();
        u.meth2();
    }
}

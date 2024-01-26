// import java.util.Scanner;
import learner.AccessSpecifier1;

class using extends AccessSpecifier1{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
        // System.out.println(a);
    }
}
public class Modifiers {
    public static void main(String[] args) {
        
        AccessSpecifier1 j = new AccessSpecifier1();
             
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

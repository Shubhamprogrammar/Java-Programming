// Packages

package learner;
import java.util.Scanner;
// import java.util.*;

public class AccessSpecifier1 {
    public int x = 5;
    protected int y = 52;
    int z = 18;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my Scanner and taking input as "+a);
        AccessSpecifier1 j =new AccessSpecifier1();
    }
}

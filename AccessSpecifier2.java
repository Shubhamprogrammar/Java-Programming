// Access Modifiers
// Some part of code is done through the help of Javatut65 and Modifiers file
class C1{
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
}

public class AccessSpecifier2 {
    public static void main(String[] args) {
        C1 c = new C1();
        // Class Error
        c.meth1();

        // Package Error
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}

// this and super keyword

class oneclass{
    int a;
    public oneclass(int a) {
        this.a = a;
        System.out.println("The Value is: "+a);
    }
    public int getA() {
        return a;
    }  
}
class twoClass  extends oneclass{
    public String name;
    public twoClass(){
        super(52);
        System.out.println("I am a twoClass class constructor");
    }  
}
public class ThisSuper {
    public static void main(String[] args) {
        oneclass c1 = new oneclass(52);   // this keyword - It is a reference to the current object
        System.out.println(c1.getA());

        // super keyword - Used to refer immediate parent class instance variable
        twoClass two = new twoClass();
    }
}

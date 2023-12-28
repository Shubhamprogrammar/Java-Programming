// Constructor Inheritance

class Construct{
    public int roll_no;
    public Construct(){
        System.out.println("I am a constructor");
    }
    public Construct(int roll_no){
        System.out.println("I am constructor with roll no is "+roll_no);
    }
}
class Derive  extends Construct{
    public String name;
    public Derive(){
        // super(52);
        System.out.println("I am a derive class constructor");
    }
    public Derive(int x, String name){
        super(53);
        System.out.printf("I am overloaded constructor of derived class with name %s and having marks %d\n",name,x);
    }   
}
class ChildOfDerived extends Derive{
    ChildOfDerived(){
        System.out.println("I am childOfDerived Constructor");
    }
    ChildOfDerived(int x,String name,String subject){
        super(x, name);
        System.out.printf("I am overloaded constructor of class with name %s and having marks %d in the subject %s\n",name,x,subject);
    }
}
public class ConstructorInheritance {
    public static void main(String[] args) {
        Derive der = new Derive(99,"Krsna");
        Derive der1 = new Derive();
        ChildOfDerived cod = new ChildOfDerived(95, "Apurv", "History");
        ChildOfDerived cod1 = new ChildOfDerived();
    }
}

// Practice
// Q.1. Create a class circle and use inheritance to create another class cylinder from it
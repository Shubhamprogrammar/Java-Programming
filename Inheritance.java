// Inheritance

// Single Inheritance
class Base{
    int x;
    
    public Base() {
        System.out.println("I am a constructor");
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }    
}
class Derived extends Base{
    int y;
    
    public Derived() {
        System.out.println("I am Derived Constructor");
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }    
}

// Multi-Level Inheritance
class Animal{
    String name;
    public Animal(String n){
        name = n;
    }
    public void speak(){
        System.out.println("Animal Speaks... "+name);
    }
}
class Dog extends Animal{
    String breed;    
    public Dog(String n, String breed) {
        super(n);
        this.breed = breed;
    }
    public void bark(){
        System.out.println("Dog Barks... "+breed);
    }
}
class Puppy extends Dog{

    public Puppy(String n, String breed) {
        super(n, breed);
    }
    
    public void care(){
        System.out.println("The cute little Puppy");
    }
}

// Mutiple inheritance is only possible in interfaces
public class Inheritance {
    public static void main(String[] args) {
        // Base myBase = new Base();
        Derived myDerive = new Derived();
        myDerive.setX(52);
        System.out.println(myDerive.getX());

        Dog mypet = new Dog("Tapu", "Labrador");
        mypet.speak();
        mypet.bark();

        Puppy puppy = new Puppy("Munna", "Stray");
        puppy.care();
        puppy.bark();
    }
}


// Practice
// Q.1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
// Q.2. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
// Q.3. Write a program for the hierarchical Inheritance (A <-- B, A <-- C A <-- D)
// Abstract classes and Abstract Methods

abstract class Based{
    public Based(){
        System.out.println("This is the Constructor of Based");
    }
    public void sayHello(){
        System.out.println("Hello Shubham!!!");
    }
    abstract public void greet();
}
class child extends Based{

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
    
}
public class Abstract {
    public static void main(String[] args) {
        child obj = new child();
        obj.greet();
        obj.sayHello();
    }
}

// Practice
// Q.1. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
// Q.2. We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.
// Q.3. We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.
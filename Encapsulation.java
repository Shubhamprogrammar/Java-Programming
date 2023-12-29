class Person {
    // Encapsulating the name and age only approachable and used using methods
    // defined
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Driver Class
public class Encapsulation {
    // main function
    public static void main(String[] args) {
        // person object created
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        // Using methods to get the values from the variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

// Practice
// Q.1. Do the encapsulation using the constructor by taking above reference
// Q.2. Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.
// Q.3. Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
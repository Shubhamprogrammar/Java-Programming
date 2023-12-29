// Interfaces
// Interface can refer to more than one classes using implement
interface Bicycle{
    int a = 52;
    public void applyBrake(int num);
    public void speedUp();
}
interface HornBicycle{
    void blowHorn();
    void blowed();
}
class AvonCycle implements Bicycle,HornBicycle{
    // int a = 18;
    @Override
    public void applyBrake(int num) {
        System.out.println("Brake is applied "+num+" times");
    }

    @Override
    public void speedUp() {
        System.out.println("Speed Braker");
    }

    @Override
    public void blowHorn() {
        System.out.println("Blowing Horn!!!");
    }

    @Override
    public void blowed() {
        System.out.println("Horn is blowed");
    }
    
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle av = new AvonCycle();
        av.applyBrake(5);
        av.speedUp();
        // You can create properties in interface
        System.out.println(av.a);
        // av.a = 425;  You cannot modify properties in interface as they are final
        av.blowed();
        av.blowHorn();
    }
}

// Practice
// Q.1. Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.
// Q.2. Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in an array. Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method.
// Q.3. Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array of integers. Create class Sort that implement the Sortable interface and provide own implementations of the sort() method.
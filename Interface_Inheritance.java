// Inheritance in Interfaces

interface sampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class MySampleClass implements childSampleInterface {

    @Override
    public void meth1() {
        System.out.println("This is the method one of the interface SampleInterface");
    }

    @Override
    public void meth2() {
        System.out.println("This is the method two of the interface SampleInterface");
    }

    @Override
    public void meth3() {
        System.out.println("This is the method three of the interface ChildSampleInterface");
    }

    @Override
    public void meth4() {
        System.out.println("This is the method four of the interface ChildSampleInterface");
    }

}

public class Interface_Inheritance {
    public static void main(String[] args) {
         MySampleClass obj = new MySampleClass();
         obj.meth1();
         obj.meth2();
         obj.meth3();
         obj.meth4();
    }
}

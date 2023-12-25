// Custom Class

class Employees{
    int id=52;      // Attributes
    String name;
 
    public void output(){
        System.out.println("ID is "+id);
    }
}

public class ClassObjects {
    public static void main(String[] args) {
        Employees empshu = new Employees();   // Instantiating a new object
        Employees empapu = new Employees();
        empshu.id = 106149;   
        empshu.name ="Shubham";
        System.out.println("The Name of the Employee is "+empshu.name);
        System.out.println("The ID of the Employee is "+empshu.id);
        empshu.output();
        empapu.output();
    }
}

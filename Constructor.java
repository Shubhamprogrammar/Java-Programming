// Constructors

class MymainEmployee{
    private int id;
    private String name;

    public MymainEmployee(){
        id = 106149;
        name = "Shaan";
    }
    public MymainEmployee(String myname){
        id = 106149;
        name = myname;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setname(String nam){
        name = nam;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        MymainEmployee emp = new MymainEmployee();
        MymainEmployee emp1 = new MymainEmployee("Radhe");
        // emp.setname("Shubham");
        // emp.setid(52);
        System.out.println(emp1.getname());
        System.out.println(emp.getid());
    }
}


// Practice
// Q.1. Try to do the constructor overloading with the above example
// Q.2. Write a program to pass the object into the constructor
// Q.3. Create 5 objects of parameterised constructor in the class car so how many times the constructor get called
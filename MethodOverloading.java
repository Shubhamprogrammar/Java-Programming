// Method Overloading in java

public class MethodOverloading {
    int sum(int a,int b){
        return a+b;
    }
    static void change(int a){
        a=45;
    }
    static void change2(int [] arr){
        arr[0]=45;
    }
    float sum(float a,float b){
        return a+b;
    }
    // You cannot perform method overloading by changing return type
    static void sum(){
        System.out.println("Answer for the float sum is:");
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        int a = 32;
        int b = 52;
        int c = obj.sum(a,b);
        System.out.println("The sum is "+c);

        float p = 32.5f;
        float q = 52.514f;
        float r = obj.sum(p,q);
        sum();
        System.out.println(r);
        int x = 90;
        change(x);
        System.out.println("The value after the change is: "+x);

        int [] marks = {52,48,72,83,92,94};   // In case of arrays, the reference is passed. Same is the case for objects passing to methods
        change2(marks);
        System.out.println("The value x after running change is "+marks[0]);   //45      
    }
}

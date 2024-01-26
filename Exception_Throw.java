// Exception Class

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "This is My Exception";
    }
    public String getMessage() {
        return "I am getMessage";
    }
}
class NegativeException extends Exception{
    public String toString(){
        return "Radius can't be negative";
    }
    public String getMessage() {
        return "Radius can't be negative";
    }
}

public class Exception_Throw {
    public static double area(int r) throws NegativeException{
        if (r<0) {
            throw new NegativeException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        if (b<0) {
            throw new ArithmeticException();
        }
        int result = a / b;
        return result;
    }
    public static void main(String[] args) {
        // The Exception class has important methods:
        // 1. String toString();   -- executed when sout(e) is run
        // 2. Void printStackTrace();  -- prints stack trace
        // 3. String getMessage();     -- prints the Exception message
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        a = sc.nextInt();
        if (a<99) {
            try {
                // throw keyword is used to throw an exception explicitly by the user
                throw new MyException();
                // throw new ArithmeticException("This is an Exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // System.out.println(e);  // Same output as toString
                e.printStackTrace();
                System.out.println("Finished");
            }           
        }
        try {
            int c = divide(6, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(area(-5));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Exception Handling

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        try {
            System.out.println("Enter a number to divide with array index number:");
            int number = sc.nextInt();
            System.out.println("The element on the Index number "+n+" is "+num[n]);
            System.out.println("The Division result is: "+n/number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Occured");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception error Occured");
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println("You have entered wrong input");
        }
        catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}


// Practice
// Q.1. Write a java program that prints 'haha' during arithmetic exception and 'hehe' during an illegal argument exception
// Q.2. Write a program that allows you to keep accessing array until a valid index is given. If max retries exceed 5 print 'error'
// Q.3. Write a program to handle the zero-division error
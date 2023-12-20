import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=2;
        if (num%2==0) {
            System.out.println("Even number");
        }    
        else {
            System.out.println("Odd number");
        }
        int age = 20;
        if (age>18) {
            System.out.println("You can Drive");
        } 
        else {
            System.out.println("No, you can't drive");
        }

        System.out.println("Enter Your Gender(0,1,2):");
        int gender = sc.nextInt();
        switch (gender) {
            case 0:
                System.out.println("You are a female");
                break;
            case 1:
                System.out.println("You are a male");
                break;
            case 2:
                System.out.println("You are a transgender");
                break;
            default:
                System.out.println("You have entered wrong number");
                break;
        }
        System.out.println("Your program run successfully!");
        sc.close();

        System.out.println("Enter a number for the day");
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Wrong input");
        }
    }
}


// Practice
// Q.1. Write a program to check whether the input number is positive integer or negative integer
// Q.2. Write a program to take integer input as n, 
//      If n is odd, print Weird
//      If n is even and in the inclusive range of 2 to 5, print Not Weird
//      If n is even and in the inclusive range of 6 to 20, print Weird
//      If n is even and greater than 20, print Not Weird
// Q.3. Write a program to find the year entered by the user is leap year or not

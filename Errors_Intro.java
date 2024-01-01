// Types of Errors

import java.util.Scanner;

public class Errors_Intro {
    public static void main(String[] args) {
        // Syntax Errors Demo
        int a = 5;
        // int b = 9   // no semicolon
        // c = 52;  // not declare datatype
        System.out.println(a);

        // Logical Errors Demo
        // Program to print prime numbers between 1 to 10
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2*i+1);  // Actually printing odd numbers
        }

        // Runtime Errors
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);
        sc.close();

        // Three types of Errors:
        // 1) Syntax Errors
        // 2) Logical Errors  -- when a program compiles and runs but does the wrong thing
        // 3) Runtime  Errors -- Sometimes encounter an error while the program is running. these are also called exceptions. e.g. bad inputs or resource constraints
        // Syntax errors and Logical errors are encountered by the programmars whereas runtime errors are encountered by the users.
    }
}

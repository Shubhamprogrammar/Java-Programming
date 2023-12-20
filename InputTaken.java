import java.util.*;

public class InputTaken {
    public static void main(String[] args) {
        System.out.println("Taking input from the user:");
        Scanner sc = new Scanner(System.in);    // Read data from the keyboard
        int num1 = sc.nextInt();
        // System.out.println(num1);
        int num2 = sc.nextInt();
        // System.out.println(num2);
        int sum = num1 + num2;
        System.out.print("The sum of the number is:  ");
        System.out.println(sum);
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        float f = sc.nextFloat();
        System.out.println(f);
        System.out.print("Enter your Good Name:  ");
        String name = sc.next();
        System.out.println("Hello "+name+", have a great day");

        sc.close();
    }
}

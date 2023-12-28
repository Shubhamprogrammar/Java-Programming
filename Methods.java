// Methods in java

import java.util.Scanner;

public class Methods {
    int square(int n){
        int res = n*n;
        return res;
    }
    static void name(String str){        
        System.out.println("The name is "+str);     
    }
    public static void main(String[] args) {
        // This object creation will be used when the function is not static 
        Methods obj = new Methods();
        int a = obj.square(10);
        System.out.println(obj.square(5));
        System.out.println("The Square of the Number 10 is "+ a);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String str = sc.next();
        name(str);
        sc.close();
    }
}

// Practice
// Q.1. Write a program to count the number of vowels in the string and string will be taken by input
// Q.2. Write a program to compute the sum of digits in integer
// Q.3. Write a java program to calulate the area of triangle
// Q.4. Write a program to break the string into substring with only two characters(Shubham-->sh,hu,ub,bh...)

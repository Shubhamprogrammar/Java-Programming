// Methods in java

import java.util.Scanner;

public class Methods {
    int square(int n){
        int res = n*n;
        return res;
    }
    static void name(String str){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        str = sc.next();
        System.out.println("The name is "+str);
        sc.close();
    }
    public static void main(String[] args) {
        // This object creation will be used when the function is not static 
        Methods obj = new Methods();
        int a = obj.square(10);
        System.out.println(obj.square(5));
        System.out.println("The Square of the Number 10 is "+ a);
        name("str");
        
    }
}

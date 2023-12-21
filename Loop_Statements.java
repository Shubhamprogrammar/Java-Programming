public class Loop_Statements {
    public static void main(String[] args) {
        // While Loop
        int a=1;
        while (a<=10) {
            System.out.println(a+" Shubham");
            a=a+1;
        }
        System.out.println("While Loop Ended successfully!!");

        // Do-while Loop
        int i=100;
        do {
            System.out.println(i);
            i +=1;
        } while (i<10);

        // For Loop
        for(int b=5;b>0;b--){
            System.out.println(b);
        }

        // For- Each Loop
        String[] friends = { "Shubham", "Apurv", "Bhavesh", "suraj", "Jitendra", "Omkaar", "lokesh" };
        // Displaying an array (Array traversal)
        for (int k = 0; i < friends.length; k++) {
            System.out.println(friends[k]);
        }
        // In reverse order printing
        for (int j = friends.length - 1; j >= 0; j--) {
            System.out.println(friends[j]);
        }

        // for each loop
        for (String str : friends) {
            System.out.println(str);
        }

        // Break and Continue
        int n=1;
        do {
            System.out.println(n);
            if (n==5) {
                System.out.println("Loop ends here");
                break;
            }n++;
        } while (n<10);

        for(int c=0;c<10;c++){
            if (c>=5 && c<8) {
                continue;
            }
            System.out.println(c);
        }
    }
}


// Practice
// Q.1. Write a program to sum first n natural numbers (n taken from input)
// Q.2. Write a program to print multiplication table of given numbers using while loop(n=13)
// Q.3. Write a program to print the factorial of given number using for loop

public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[1] = 52;
        System.out.println(marks[1]);

        String arr[];
        arr = new String[5];
        arr[0]="Ram";

        int[] roll_no = { 10, 20, 30, 40, 50 };
        // Array Traversal
        for (int i = 0; i < 5; i++) {
            System.out.println(roll_no[i]);
        }
        // for each loop
        for (int i : roll_no) {
            System.out.println(i);
        }
    }
}

// Practice
// Q.1. Write a program to get the smaller element in array for the general case
// Q.2. Write a program to get the larger element in array for the general case
// Q.3. Write a program to reverse the array and store it into another array
// Q.4. Write a program to search the element in array return index if present otherwise not found

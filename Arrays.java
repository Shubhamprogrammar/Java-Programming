public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[1] = 52;
        System.out.println(marks[1]);

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

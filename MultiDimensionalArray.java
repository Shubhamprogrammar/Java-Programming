// Multi-dimensional Array

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [][]num = new int[2][2];
        num[0][0] = 12;
        num[0][1] = 24;
        num[1][0]= 13;
        num[1][1] = 26;
        System.out.println(num.length);
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        String [][]names = {{"Ram","Siya","Laxman","Bharat","Urmila"},{"Krishna","Balram","Radha","Rukmani"}};
        for(int i=0;i<names.length;i++){
            for(int j=0;j<names[i].length;j++){
                System.out.println(names[i][j]);
            }
        }
    }
}

// Practice
// Q.1. Create an array of 5 floats and calculate the sum
// Q.2. Write a program to find that the element is present in an array or not
// Q.3. Calculate average marks of an array containing marks of all students using for each loop
// Q.4. Add two matrices of size 2X3 and form new matrix
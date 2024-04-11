// File Handling

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        // Code to create a new file
        File myFile = new File("Example111.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create a file");
        }
          

        // Code to write in file
        try {
            FileWriter fw = new FileWriter("Example111.txt");
            fw.write("This is Shubham writing code from Disha Computer Institute\nBye Good Night\n");
            fw.append("Jay Shree Krishna");
            fw.close();
        } catch (IOException e) {
            System.out.println("Unable to write into a file");
        }
        
        // Code to read the file
        File f = new File("Example112.txt");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found to read");
        }
        
        // Deletion of File
       if (f.delete()) {
            System.out.println("I have deleted the file: "+f.getName());
        }
        else{
            System.out.println("Some problem has occured while deleting the file");
        }
          
    }
}

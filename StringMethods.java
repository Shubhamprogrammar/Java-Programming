// String methods

public class StringMethods {
    public static void main(String[] args) {
        String name="Shubham";
        System.out.println(name);
        System.out.println(name.toUpperCase()); // convert string to upper case string
        System.out.println(name.length());  // Returns length of the string
        String lstring = name.toLowerCase();  // convert string to lower case string 
        System.out.println(lstring);

        String course = "     computer science    ";
        System.out.println(course);
        System.out.println(course.trim());   // Removes trailing and leading spaces

        System.out.println(name.substring(3));  // returns a substring from 2 to end
        System.out.println(name.substring(2,5));  // returns a sustring from 2 to 5

        System.out.println(course.replace(" ","*"));  // returns a string after replacing a old char with new char

        System.out.println(name.startsWith("Sh"));  // Returns a boolean value if the string starts with char
        System.out.println(name.endsWith("a"));  // Returns a boolean value if the string ends with char

        System.out.println(name.charAt(2));  // Returns a character present at that index position

        System.out.println(name.indexOf("bh")); // Returns the index of the given string
        System.out.println(name.indexOf("b", 4));  // Returns the index of the given string from the given index(starts reading from the given index)

        System.out.println(course.lastIndexOf("e")); // Returns the last index of the given string
        System.out.println(course.lastIndexOf("e",10));  // Returns the last index of the given string before given index(starts reading before the given index)

        System.out.println(name.equals("Shubham")); // Returns true if the string is matched with var value (case sensitive)
        System.out.println(name.equalsIgnoreCase("shubHam"));  // Returns true if the string is matched with var value irrespective of case sensitive

     }    
}

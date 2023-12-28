// Online library

import java.util.Scanner;

class Library {
    String[] availbooks = new String[100];
    String[] issuedbooks = new String[100];
    int no_of_books=0;
    int no_of_issued_books=0;

    public void addBook(String book) {
        this.availbooks[no_of_books] = book;
        this.no_of_books += 1;
        System.out.println(book + " has been added in the library");
    }

    public void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (int i = 0; i < this.availbooks.length; i++) {
            if (this.availbooks[i] == null) {
                continue;
            } else {
                System.out.println("# " + this.availbooks[i]);
            }
        }
    }

    public void showIssuedbooks() {
        System.out.println("The Issued books are:");
        for (int i = 0; i < this.issuedbooks.length; i++) {
            if (this.issuedbooks[i] == null) {
                continue;
            } else {
                System.out.println("# " + this.issuedbooks[i]);
            }
        }
    }

    public void returnBook(String book) {
        for (int i = 0; i < this.issuedbooks.length; i++) {
            if (this.issuedbooks[i].equals(book)) {
                for (int j = i; j < this.issuedbooks.length-1; j++) {
                    this.issuedbooks[j] = this.issuedbooks[j + 1];
                }
                this.no_of_issued_books--;
                this.availbooks[this.no_of_books] = book;
                this.no_of_books++;
                System.out.println("The book "+book+" has been returned");
                break;
            }
        }
    }

    public void issueBook(String bookname) {
        for (int i = 0; i < this.availbooks.length; i++) {
            if (this.availbooks[i].equals(bookname)) {
                for (int j = i; j < this.availbooks.length-1; j++) {
                    this.availbooks[j] = this.availbooks[j + 1];
                }
                this.no_of_books--;
                this.issuedbooks[this.no_of_issued_books] = bookname;
                no_of_issued_books++;
                System.out.println("The book " + bookname + " has been issued successfully!!!");
                break;                
            }
        }        
    }
}

public class Library_Management_System {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int num;
        String bookname;
        while (true) {
            System.out.println(
                    "Enter 1 if you want to display Available Books\nEnter 2 if you want to display the Issued books\nEnter 3 if you want to Add Books\nEnter 4 if you want to Issue books\nEnter 5 if you want to Return book");
            num = sc.nextInt();
            if (num == 1) {
                lib.showAvailableBooks();
            } else if (num == 2) {
                lib.showIssuedbooks();
            } else if (num == 3) {
                System.out.println("Enter Book name which you want to Add");
                sc.nextLine();
                bookname = sc.nextLine();
                lib.addBook(bookname.toLowerCase());
            } else if (num == 4) {
                System.out.println("Enter Book name which you want to Issue");
                sc.nextLine();
                bookname = sc.nextLine();
                lib.issueBook(bookname.toLowerCase());
            } else if (num == 5) {
                System.out.println("Enter Book name which you want to Return");
                sc.nextLine();
                bookname = sc.nextLine();
                lib.returnBook(bookname.toLowerCase());
            } else {
                System.out.println("You have given wrong input");
                break;
            }
        }
    }
}

import DOA.BookDOA;
import DOA.IssueDOA;
import DOA.UserDOA;
import model.DBsetup;
import utils.PrintResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Testmain {

    private static final Scanner scanner = new Scanner(System.in);
    private static final BookDOA bookDAO = new BookDOA();
    private static final UserDOA userDAO = new UserDOA();
    private static final IssueDOA issueDAO = new IssueDOA();
    private static final DBsetup setup = new DBsetup();

    public static void main(String[] args) 
    {
        setup.initialize();
        runMenuLoop();
    }

    private static void runMenuLoop() {
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Enter choice: ");
            System.out.println();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewAllBooks();
                    break;
                case 3:
                    updateBookCopies();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    addUser();
                    break;
                case 6:
                    viewAllUsers();
                    break;
                case 7:
                    deleteUser();
                    break;
                case 8:
                    issueBook();
                    break;
                case 9:
                    returnBook();
                    break;
                case 10:
                    viewActiveIssues();
                    break;
                case 11:
                    viewIssuesByUser();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting Library Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("===== Library Management Menu =====");
        System.out.println("1. Add Book");
        System.out.println("2. View All Books");
        System.out.println("3. Update Book Copies");
        System.out.println("4. Delete Book");
        System.out.println("5. Add User");
        System.out.println("6. View All Users");
        System.out.println("7. Delete User");
        System.out.println("8. Issue Book");
        System.out.println("9. Return Book");
        System.out.println("10. View Active Issues");
        System.out.println("11. View Issues By User");
        System.out.println("0. Exit");
    }

    private static void addBook() {
        String title = readLine("Enter title: ");
        String author = readLine("Enter author: ");
        int copies = readInt("Enter available copies: ");

        bookDAO.addBook(title, author, copies);
        System.out.println("Book added successfully.");
    }

    private static void viewAllBooks() {
        ResultSet rs = bookDAO.getAllBooks();
        PrintResultSet.printResultSet(rs);
    }

    private static void updateBookCopies() {
        int id = readInt("Enter book id: ");
        int copies = readInt("Enter new available copies: ");

        bookDAO.updateCopies(id, copies);
        System.out.println("Book copies updated successfully.");
    }

    private static void deleteBook() {
        int id = readInt("Enter book id to delete: ");
        bookDAO.deleteBook(id);
        System.out.println("Book deleted successfully.");
    }

    private static void addUser() {
        String name = readLine("Enter user name: ");
        String contact = readLine("Enter user contact: ");

        userDAO.addUser(name, contact);
        System.out.println("User added successfully.");
    }

    private static void viewAllUsers() {
        ResultSet rs = userDAO.getAllUsers();
        PrintResultSet.printResultSet(rs);
    }

    private static void deleteUser() {
        int id = readInt("Enter user id to delete: ");
        userDAO.deleteUsers(id);
        System.out.println("User deleted successfully.");
    }

    private static void issueBook() {
        int bookId = readInt("Enter book id: ");
        int userId = readInt("Enter user id: ");

        if (!bookExists(bookId)) {
            System.out.println("Book id not found.");
            return;
        }
        if (!userExists(userId)) {
            System.out.println("User id not found.");
            return;
        }

        issueDAO.createIssue(bookId, userId);
        System.out.println("Issue operation completed.");
    }

    private static void returnBook() {
        int bookId = readInt("Enter book id: ");
        int userId = readInt("Enter user id: ");

        issueDAO.returnBook(bookId, userId);
        System.out.println("Return operation completed.");
    }

    private static void viewActiveIssues() {
        ResultSet rs = issueDAO.getActiveissues();
        PrintResultSet.printResultSet(rs);
    }

    private static void viewIssuesByUser() {
        int userId = readInt("Enter user id: ");
        ResultSet rs = issueDAO.getIssuesByUser(userId);
        PrintResultSet.printResultSet(rs);
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer.");
                scanner.nextLine();
            }
        }
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static boolean bookExists(int id) {
        ResultSet rs = bookDAO.getBookByID(id);
        try {
            return rs != null && rs.next();
        } catch (SQLException e) {
            return false;
        }
    }

    private static boolean userExists(int id) {
        ResultSet rs = userDAO.getUserByID(id);
        try {
            return rs != null && rs.next();
        } catch (SQLException e) {
            return false;
        }
    }
}

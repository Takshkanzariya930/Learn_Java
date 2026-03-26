import DOA.BookDOA;
import DOA.IssueDOA;
import DOA.UserDOA;
import utils.DBConnection;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Testmain {

    private static final BookDOA bookDAO = new BookDOA();
    private static final UserDOA userDAO = new UserDOA();
    private static final IssueDOA issueDAO = new IssueDOA();
    private static final DBConnection db = new DBConnection();

    public static void main(String[] args) {
        createTablesIfNotExists();
        SwingUtilities.invokeLater(Testmain::createAndShowGUI);
    }

    private static void createTablesIfNotExists() {
        db.execute(
                "CREATE TABLE IF NOT EXISTS books (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "title TEXT NOT NULL, " +
                        "author TEXT NOT NULL, " +
                        "availableCopies INTEGER NOT NULL" +
                        ");"
        );

        db.execute(
                "CREATE TABLE IF NOT EXISTS users (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "name TEXT NOT NULL, " +
                        "contact TEXT NOT NULL" +
                        ");"
        );

        db.execute(
                "CREATE TABLE IF NOT EXISTS issues (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "book_id INTEGER, " +
                        "user_id INTEGER, " +
                        "issue_date DATE, " +
                        "return_date DATE, " +
                        "status TEXT, " +
                        "CHECK (status IN ('issued', 'returned')), " +
                        "FOREIGN KEY (book_id) REFERENCES books(id), " +
                        "FOREIGN KEY (user_id) REFERENCES users(id)" +
                        ");"
        );
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Library Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100, 650);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JTable table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(350, 20, 720, 560);
        panel.add(scrollPane);

        JButton addBookBtn = new JButton("Add Book");
        addBookBtn.setBounds(20, 20, 300, 35);
        addBookBtn.addActionListener(e -> addBookDialog(frame));
        panel.add(addBookBtn);

        JButton viewBooksBtn = new JButton("View All Books");
        viewBooksBtn.setBounds(20, 65, 300, 35);
        viewBooksBtn.addActionListener(e -> loadTable(table, bookDAO.getAllBooks()));
        panel.add(viewBooksBtn);

        JButton updateCopiesBtn = new JButton("Update Book Copies");
        updateCopiesBtn.setBounds(20, 110, 300, 35);
        updateCopiesBtn.addActionListener(e -> updateCopiesDialog(frame));
        panel.add(updateCopiesBtn);

        JButton deleteBookBtn = new JButton("Delete Book");
        deleteBookBtn.setBounds(20, 155, 300, 35);
        deleteBookBtn.addActionListener(e -> deleteBookDialog(frame));
        panel.add(deleteBookBtn);

        JButton addUserBtn = new JButton("Add User");
        addUserBtn.setBounds(20, 220, 300, 35);
        addUserBtn.addActionListener(e -> addUserDialog(frame));
        panel.add(addUserBtn);

        JButton viewUsersBtn = new JButton("View All Users");
        viewUsersBtn.setBounds(20, 265, 300, 35);
        viewUsersBtn.addActionListener(e -> loadTable(table, userDAO.getAllUsers()));
        panel.add(viewUsersBtn);

        JButton deleteUserBtn = new JButton("Delete User");
        deleteUserBtn.setBounds(20, 310, 300, 35);
        deleteUserBtn.addActionListener(e -> deleteUserDialog(frame));
        panel.add(deleteUserBtn);

        JButton issueBtn = new JButton("Issue Book");
        issueBtn.setBounds(20, 375, 300, 35);
        issueBtn.addActionListener(e -> issueBookDialog(frame));
        panel.add(issueBtn);

        JButton returnBtn = new JButton("Return Book");
        returnBtn.setBounds(20, 420, 300, 35);
        returnBtn.addActionListener(e -> returnBookDialog(frame));
        panel.add(returnBtn);

        JButton activeIssuesBtn = new JButton("View Active Issues");
        activeIssuesBtn.setBounds(20, 465, 300, 35);
        activeIssuesBtn.addActionListener(e -> loadTable(table, issueDAO.getActiveissues()));
        panel.add(activeIssuesBtn);

        JButton issuesByUserBtn = new JButton("View Issues By User");
        issuesByUserBtn.setBounds(20, 510, 300, 35);
        issuesByUserBtn.addActionListener(e -> issuesByUserDialog(frame, table));
        panel.add(issuesByUserBtn);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    private static void addBookDialog(JFrame frame) {
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField copiesField = new JTextField();

        Object[] fields = {
                new JLabel("Title:"), titleField,
                new JLabel("Author:"), authorField,
                new JLabel("Available Copies:"), copiesField
        };

        int result = JOptionPane.showConfirmDialog(frame, fields, "Add Book", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                int copies = Integer.parseInt(copiesField.getText().trim());
                bookDAO.addBook(titleField.getText().trim(), authorField.getText().trim(), copies);
                showMessage(frame, "Book added successfully.");
            } catch (NumberFormatException ex) {
                showMessage(frame, "Available copies must be a number.");
            }
        }
    }

    private static void updateCopiesDialog(JFrame frame) {
        JTextField idField = new JTextField();
        JTextField copiesField = new JTextField();

        Object[] fields = {
                new JLabel("Book ID:"), idField,
                new JLabel("New Available Copies:"), copiesField
        };

        int result = JOptionPane.showConfirmDialog(frame, fields, "Update Book Copies", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                int id = Integer.parseInt(idField.getText().trim());
                int copies = Integer.parseInt(copiesField.getText().trim());
                bookDAO.updateCopies(id, copies);
                showMessage(frame, "Book copies updated successfully.");
            } catch (NumberFormatException ex) {
                showMessage(frame, "Book ID and copies must be numbers.");
            }
        }
    }

    private static void deleteBookDialog(JFrame frame) {
        String input = JOptionPane.showInputDialog(frame, "Enter book ID to delete:");
        if (input == null) {
            return;
        }
        try {
            int id = Integer.parseInt(input.trim());
            bookDAO.deleteBook(id);
            showMessage(frame, "Book deleted successfully.");
        } catch (NumberFormatException ex) {
            showMessage(frame, "Book ID must be a number.");
        }
    }

    private static void addUserDialog(JFrame frame) {
        JTextField nameField = new JTextField();
        JTextField contactField = new JTextField();

        Object[] fields = {
                new JLabel("Name:"), nameField,
                new JLabel("Contact:"), contactField
        };

        int result = JOptionPane.showConfirmDialog(frame, fields, "Add User", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            userDAO.addUser(nameField.getText().trim(), contactField.getText().trim());
            showMessage(frame, "User added successfully.");
        }
    }

    private static void deleteUserDialog(JFrame frame) {
        String input = JOptionPane.showInputDialog(frame, "Enter user ID to delete:");
        if (input == null) {
            return;
        }
        try {
            int id = Integer.parseInt(input.trim());
            userDAO.deleteUsers(id);
            showMessage(frame, "User deleted successfully.");
        } catch (NumberFormatException ex) {
            showMessage(frame, "User ID must be a number.");
        }
    }

    private static void issueBookDialog(JFrame frame) {
        JTextField bookIdField = new JTextField();
        JTextField userIdField = new JTextField();

        Object[] fields = {
                new JLabel("Book ID:"), bookIdField,
                new JLabel("User ID:"), userIdField
        };

        int result = JOptionPane.showConfirmDialog(frame, fields, "Issue Book", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                int bookId = Integer.parseInt(bookIdField.getText().trim());
                int userId = Integer.parseInt(userIdField.getText().trim());

                if (!bookExists(bookId)) {
                    showMessage(frame, "Book ID not found.");
                    return;
                }
                if (!userExists(userId)) {
                    showMessage(frame, "User ID not found.");
                    return;
                }

                issueDAO.createIssue(bookId, userId);
                showMessage(frame, "Issue operation completed.");
            } catch (NumberFormatException ex) {
                showMessage(frame, "Book ID and User ID must be numbers.");
            }
        }
    }

    private static void returnBookDialog(JFrame frame) {
        JTextField bookIdField = new JTextField();
        JTextField userIdField = new JTextField();

        Object[] fields = {
                new JLabel("Book ID:"), bookIdField,
                new JLabel("User ID:"), userIdField
        };

        int result = JOptionPane.showConfirmDialog(frame, fields, "Return Book", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                int bookId = Integer.parseInt(bookIdField.getText().trim());
                int userId = Integer.parseInt(userIdField.getText().trim());
                issueDAO.returnBook(bookId, userId);
                showMessage(frame, "Return operation completed.");
            } catch (NumberFormatException ex) {
                showMessage(frame, "Book ID and User ID must be numbers.");
            }
        }
    }

    private static void issuesByUserDialog(JFrame frame, JTable table) {
        String input = JOptionPane.showInputDialog(frame, "Enter user ID:");
        if (input == null) {
            return;
        }
        try {
            int userId = Integer.parseInt(input.trim());
            loadTable(table, issueDAO.getIssuesByUser(userId));
        } catch (NumberFormatException ex) {
            showMessage(frame, "User ID must be a number.");
        }
    }

    private static void loadTable(JTable table, ResultSet rs) {
        DefaultTableModel model = resultSetToTableModel(rs);
        table.setModel(model);
    }

    private static DefaultTableModel resultSetToTableModel(ResultSet rs) {
        DefaultTableModel model = new DefaultTableModel();
        if (rs == null) {
            return model;
        }

        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            Vector<String> columns = new Vector<>();
            for (int i = 1; i <= columnCount; i++) {
                columns.add(metaData.getColumnName(i));
            }
            model.setColumnIdentifiers(columns);

            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.add(rs.getObject(i));
                }
                model.addRow(row);
            }
        } catch (SQLException e) {
            model.setColumnIdentifiers(new Object[]{"Error"});
            model.addRow(new Object[]{"Could not read data: " + e.getMessage()});
        }

        return model;
    }

    private static void showMessage(JFrame frame, String message) {
        JOptionPane.showMessageDialog(frame, message);
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

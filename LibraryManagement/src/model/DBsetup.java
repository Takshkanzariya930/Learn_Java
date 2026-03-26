package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBsetup {

    private Connection conn;

    public Connection getConnection() 
    {
        return conn;
    }

    public DBsetup(String url)
    {
        try
        {
            conn = DriverManager.getConnection(url);

            if(conn != null) 
            {
                System.out.println("Connection to SQLite has been established.");    
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void execute(String sql)
    {
        try 
        {
            if(conn != null)
            {
                java.sql.Statement stmt = conn.createStatement();

                stmt.execute(sql);
            }    
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       
    }

    public static void main(String[] args) {

        DBsetup conn = new DBsetup("jdbc:sqlite:library.db");

        // Creating books table
        conn.execute("CREATE TABLE IF NOT EXISTS books (id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL, author TEXT NOT NULL, availableCopies INTEGER NOT NULL);");

        // Creating users table
        conn.execute("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, contact TEXT NOT NULL);");

        // Creating issues table
        conn.execute("CREATE TABLE IF NOT EXISTS issues (id INTEGER PRIMARY KEY AUTOINCREMENT, book_id INTEGER, user_id INTEGER, issue_date DATE, return_date DATE, status TEXT, CHECK (status IN ('issued', 'returned')), FOREIGN KEY (book_id) REFERENCES books(id), FOREIGN KEY (user_id) REFERENCES users(id) );");
    }
}
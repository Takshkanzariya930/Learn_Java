package model;

import utils.DBConnection;

public class DBsetup {

    DBConnection db = new DBConnection();

    public void initialize() 
    {
        // Creating books table
        db.execute("CREATE TABLE IF NOT EXISTS books (id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL, author TEXT NOT NULL, availableCopies INTEGER NOT NULL);");

        // Creating users table
        db.execute("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, contact TEXT NOT NULL);");

        // Creating issues table
        db.execute("CREATE TABLE IF NOT EXISTS issues (id INTEGER PRIMARY KEY AUTOINCREMENT, book_id INTEGER, user_id INTEGER, issue_date DATE, return_date DATE, status TEXT, CHECK (status IN ('issued', 'returned')), FOREIGN KEY (book_id) REFERENCES books(id), FOREIGN KEY (user_id) REFERENCES users(id) );");
    }
}
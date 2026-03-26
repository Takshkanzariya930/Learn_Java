package DOA;

import utils.DBConnection;
import java.sql.ResultSet;

public class BookDOA {

    DBConnection db = new DBConnection();

    public void addBook(String title, String author, int availableCopies)
    {
        db.execute("INSERT INTO books(title, author, availableCopies) VALUES('"+title+"','"+author+"','"+availableCopies+"');");
    }

    public ResultSet getBookByID(int id)
    {
        ResultSet rs = db.executeQuery("SELECT * FROM books WHERE id="+id+";");
        return rs;
    }

    public ResultSet getAllBooks()
    {
        ResultSet rs = db.executeQuery("SELECT * FROM books;");
        return rs;
    }

    public void updateCopies(int id, int updatedCopies)
    {
        db.execute("UPDATE books SET availableCopies="+updatedCopies+" WHERE id="+id+";");
    }

    public void deleteBook(int id)
    {
        db.execute("DELETE FROM books WHERE id="+id+";");
    }
}

package DOA;

import utils.DBConnection;
import java.sql.ResultSet;

import java.sql.SQLException;

public class IssueDOA {

    DBConnection db = new DBConnection();
    BookDOA booktab = new BookDOA();

    public void createIssue(int book_id, int user_id)
    {

        ResultSet rs = booktab.getBookByID(book_id);

        try 
        {
            if(rs.getInt("availableCopies") > 0) 
            {
                db.execute("INSERT INTO issues(book_id, user_id, issue_date, return_date, status) VALUES('"+book_id+"','"+user_id+"', date('now'), date('now', '+3 days'), 'issued')");

                booktab.updateCopies(book_id, rs.getInt("availableCopies")-1);
            }
            else
            {
                System.out.println("Book is Unavailable");
            }
        }  
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void returnBook(int book_id,int user_id)
    {
        db.execute("UPDATE issues SET status='returned' WHERE book_id="+book_id+" AND user_id="+user_id);

        ResultSet rs = booktab.getBookByID(book_id);

        try 
        {
            booktab.updateCopies(book_id, rs.getInt("availableCopies")+1);
        }  
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ResultSet getActiveissues()
    {
        ResultSet rs = db.executeQuery("SELECT * FROM issues WHERE status='issued'");
        return rs;
    }

    public ResultSet getIssuesByUser(int user_id)
    {
        ResultSet rs = db.executeQuery("SELECT * FROM issues WHERE status='issued' AND user_id="+user_id);
        return rs;
    }
}

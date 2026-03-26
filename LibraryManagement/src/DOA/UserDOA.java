package DOA;

import utils.DBConnection;
import java.sql.ResultSet;

public class UserDOA {

    DBConnection db = new DBConnection();

    public void addUser(String name, String contact)
    {
        db.execute("INSERT INTO users(name, contact) VALUES('"+name+"','"+contact+"');");
    }

    public ResultSet getUserByID(int id)
    {
        ResultSet rs = db.executeQuery("SELECT * FROM users WHERE id="+id+";");
        return rs;
    }

    public ResultSet getAllUsers()
    {
        ResultSet rs = db.executeQuery("SELECT * FROM users;");
        return rs;
    }

    public void deleteUsers(int id)
    {
        db.execute("DELETE FROM users WHERE id="+id+";");
    }
}

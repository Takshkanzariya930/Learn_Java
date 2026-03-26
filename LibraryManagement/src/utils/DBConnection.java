package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

    private Connection conn;

    public Connection getConnection() 
    {
        return conn;
    }

    public DBConnection()
    {

        String url = "jdbc:sqlite:library.db";

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

    public DBConnection(String url)
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

    public ResultSet executeQuery(String sql)
    {
        try 
        {
            if(conn != null)
            {
                java.sql.Statement stmt = conn.createStatement();
                return stmt.executeQuery(sql);
            }    
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }


}

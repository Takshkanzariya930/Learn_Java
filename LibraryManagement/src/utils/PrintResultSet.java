package utils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class PrintResultSet 
{
    
public static void printResultSet(ResultSet rs) {
    if (rs == null) {
        System.out.println("ResultSet is null.");
        return;
    }

    try {
        // Get metadata to find out column names and count
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // 1. Print column headers
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(metaData.getColumnName(i) + "\t|\t");
        }
        System.out.println();
        
        // 2. Print a separator line
        for (int i = 1; i <= columnCount; i++) {
            System.out.print("------------------------");
        }
        System.out.println();

        // 3. Loop through the result set and print each row's values
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                // Using getString(index) works for smoothly printing mostly any data type
                System.out.print(rs.getString(i) + "\t|\t");
            }
            System.out.println(); // Next line for the next row
        }
    } catch (SQLException e) {
        System.err.println("SQL Exception occurred while printing ResultSet:");
        e.printStackTrace();
    }
}
  
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  
public class DatabaseConnection {
  
    private static Connection con = null;
  
    static
    {
    	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    	final String DB_URL = "jdbc:mysql://135.181.156.254:3306/voting_db";



    	 //  Database credentials
    	final String USER = "dogetomoon";
    	final String PASS = "D4jmd6r7h7MF2aUK";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }

}



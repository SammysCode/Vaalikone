package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	  private static DbConnection instance;
	  private Connection connection;
	  private String url = "jdbc:mysql://135.181.156.254:3306/voting_db";
	  private String username = "dogetomoon";
	  private String password = "D4jmd6r7h7MF2aUK";
	  private DbConnection() throws SQLException {
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      this.connection = DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException ex) {
	      System.out.println("Something is wrong with the DB connection String : " + ex.getMessage());
	    }
	  }
	  public Connection getConnection() {
	    return connection;
	  }
	  public static DbConnection getInstance() throws SQLException {
	    if (instance == null) {
	      instance = new DbConnection();
	    } else if (instance.getConnection().isClosed()) {
	      instance = new DbConnection();
	    }
	    return instance;
	  }

	}
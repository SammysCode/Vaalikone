import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import data.AllQuestions;

import java.sql.Statement;

public class SqlConn {
	
	private Connection conn;
	
	public SqlConn() {
		
	}
    
    
//    public Connection connect() {
//    	String driver = "com.mysql.jdbc.Driver";
//        String DBpath = "//localhost:3306/election";
//        String username = "electionUser";
//        String password = "password";
//        try {
//            Class.forName(driver).newInstance();
//        } catch (Exception ex) {
//            Logger.getLogger(SqlConn.class.getName()).log(Level.SEVERE, "Driver Error!", ex);
//        }
//        try {
//        	conn = DriverManager.getConnection("jdbc:mysql:" + DBpath, username, password);
//        } catch (Exception e) {
//        	Logger.getLogger(SqlConn.class.getName()).log(Level.SEVERE, "Connection Error!", e);
//        }
//        
//        return conn;
//    }
    //get all all questions from the db as arraylist of objects
    public ArrayList<AllQuestions> getQuestions(Connection conn){
    	ArrayList<AllQuestions> allQuestions = new ArrayList<>();
    	try {
    		Statement stmt = conn.createStatement();
    		ResultSet rs = stmt.executeQuery("SELECT * FROM questions");
    		while (rs.next()){
				AllQuestions q = new AllQuestions();
				q.setId(rs.getInt("questionID"));
				q.setQuestion(rs.getString("questionText"));
				allQuestions.add(q);
			}
    		return allQuestions;
    		
    	} catch (Exception e) {
    		return null;
    	}
		
    }
    
    
    
    
 
}



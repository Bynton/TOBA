
import business.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bento
 */
class UserDB {
    
    private static String URL = "jdbc:mysql://localhost:3306/userdb";
    private static String USERNAME = "root";
    private static String PASSWORD = "bynton";
    
    Connection connection = null;
    PreparedStatement actors = null;
    ResultSet resultSet = null;

    static void insert(User customer){
        
    }
    
}

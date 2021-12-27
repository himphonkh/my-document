/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reach
 */
public class myDB {
    Connection con;
    public Connection getConnection(){
    String url = "jdbc:mysql://localhost/learnEnglish";
        String root = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,root,pass);
            
//            Statement st = conne.createStatement();
//            st.executeUpdate("Insert into users values ('xya','123456','Hanoi')");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(myDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}

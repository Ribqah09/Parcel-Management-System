package smartparcelmanagement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Connection {
    java.sql.Connection c;
    Statement s;
    
    public Connection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/parcelmanagement","root","Ribqah123");
            s=c.createStatement();
        } 
        catch (Exception e) {            
            JOptionPane.showMessageDialog(null, "Connection:    "+e);
        }
    }
//    public PreparedStatement prepareStatement(String sql) {
//        try {
//            return c.prepareStatement(sql);
//        } 
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error in PreparedStatement: " + e);
//            return null;
//        }
//    }
}


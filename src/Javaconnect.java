/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sanduni
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Javaconnect {
    Connection conn;
    public static Connection ConnectDB(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
    Statement stmt=conn.createStatement();
    
    return conn;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
    }
}

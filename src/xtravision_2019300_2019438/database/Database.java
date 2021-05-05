/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Francisco Leite
 * @author Aline Rabelo
 */
public class Database {


//Class to create the connection with the data base

    
    String dbServer = "jdbc:mysql://apontejaj.com:3306/Francisco_2019300?useSSL=false";
    String dbUser = "Francisco_2019300";
    String dpPassword = "3002019";
    Connection conn;
    Statement stmt;
    ResultSet rs;
    
    //Execute queries
    public ResultSet executeQuery(String query) throws SQLException{
        // Get a connection to the database
        conn = DriverManager.getConnection(dbServer, dbUser, dpPassword);
        // Get a statement from the connection
        stmt = conn.createStatement();
        //Execute the query
        rs = stmt.executeQuery(query);
        
        return rs;
    }
    //execute comands to update or insert data into tables for example
    public boolean execute(String query) throws SQLException{
        // Get a connection to the database
        conn = DriverManager.getConnection(dbServer, dbUser, dpPassword);
        // Get a statement from the connection
        stmt = conn.createStatement();
        //Execute the query
        boolean result = stmt.execute(query);
        
        return result;
    }
     //execute comands to update or insert data into tables for example
     //if return id == true the function will return the last id inserted, else will return the number of affect
    //rows
    public int execute(String query, boolean returnId) throws SQLException{
       
        // Get a connection to the database
        conn = DriverManager.getConnection(dbServer, dbUser, dpPassword);
        // Get a statement from the connection
        stmt = conn.createStatement();
        //Execute the query
        if (returnId == false){
            return stmt.executeUpdate(query);
        }
        int result = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs= stmt.getGeneratedKeys();
            if (rs.next()) 
            {
              result = rs.getInt(1);
            }    
        
        return result;
    }
    
    //Close the result set, statement and the connection
    public void close() throws SQLException{
        
            
        if(stmt != null){
            stmt.close();
        }
        if(conn != null){
            conn.close();
        }
        if(rs != null){
            rs.close();
        }
    }
}


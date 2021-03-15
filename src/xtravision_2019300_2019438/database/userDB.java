/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import xtravision_2019300_2019438.models.User;

/**
 *
 * @author aline
 */
public class userDB {
    
    User userEmail;
    
    
    public  void userDB(User userEmail){
           
            try {
                    
                String dbServer = "jdbc:mysql://apontejaj.com:3306/Francisco_2019300?useSSL=false";
                String user = "Francisco_2019300";
                String password = "2019300";
                String query = "INSERT INTO emails(email) VALUES ('" + userEmail.getEmail();

               Connection conn = DriverManager.getConnection(dbServer, user, password);

               Statement stmt = conn.createStatement();
               stmt.execute(query);
              
                stmt.close();
                conn.close();

                } catch (SQLException se) {
                System.out.println("SQL Exception:");

                while (se != null) {
                    System.out.println("State  : " + se.getSQLState());
                    System.out.println("Message: " + se.getMessage());
                    System.out.println("Error  : " + se.getErrorCode());

                    se = se.getNextException();
                }
            } catch (Exception e) {
                System.out.println(e);     
        }
          
        }
    
}

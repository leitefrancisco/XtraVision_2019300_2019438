/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import xtravision_2019300_2019438.database.Database;
import xtravision_2019300_2019438.models.Movie;

/**
 *
 * @author aline
 */
public class CardController {
    
     public boolean isCardInDatabase(String cardNumber){
        String query = "SELECT * FROM Francisco_2019300.xtra_card\n" +
                        "WHERE card_number = '"+cardNumber+"';";
        try{
            Database db = new Database();
            ResultSet rs = db.executeQuery(query);
            
            if(rs.next())
            {
               return true;
            }
           
            db.close();
        }
        catch (SQLException se) {
            System.out.println("SQL Exception:");
            
            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());
                
                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.controllers;
import java.sql.ResultSet;
import java.sql.SQLException;
import xtravision_2019300_2019438.database.Database;
import xtravision_2019300_2019438.models.Card;

/**
 *
 * @author aline
 */
public class CardController extends BaseController{
    
    public boolean isCardInDatabase(String cardNumber) throws SQLException{
        return exists("card_number = '"+cardNumber+"'" );
    }
    
    public void createCardInDatabase(Card card) throws SQLException{
        
        String query = "INSERT into xtra_card (card_number, card_security_number, card_name, card_exp_month, card_exp_year)\n" +
                "values ('" +card.getCardNumber()+ "', '"+
                card.getCardSecurityNumber()+ "', '"+
                card.getCardName()+"', '"+
                card.getCardExpMonth()+"', '"+
                card.getCardExpYear()+"');";
        executeInsert(query);
    }
    
    private int getCardID(Card card) {
        String query = "SELECT * FROM xtra_card\n" +
                "WHERE card_number = '"+card.getCardNumber()+"';";
        try{
            Database db = new Database();
            ResultSet rs = db.executeQuery(query);
            
            if(rs.next())
            {
                return rs.getInt(1);
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
        return 0;
    }
    
    public int getOrCreateCard(Card card) throws SQLException{
        if(isCardInDatabase(card.getCardNumber())) {
            return getCardID(card);
        }
        else{
            createCardInDatabase(card);
            return getCardID(card);
        }
        
    }
    
    @Override
    protected String GetTableName() {
        return "xtra_card";
    }
    

    
    
}

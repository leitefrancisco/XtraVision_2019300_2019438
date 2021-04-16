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
    
    public int createCardInDatabase(Card card) throws SQLException{
        
        String query = "INSERT into xtra_card (card_number, card_security_number, card_name, card_exp_month, card_exp_year)\n" +
                "values ('" +card.getCardNumber()+ "', '"+
                card.getCardSecurityNumber()+ "', '"+
                card.getCardName()+"', '"+
                card.getCardExpMonth()+"', '"+
                card.getCardExpYear()+"');";
        int id = executeInsert(query);
        return id;
    }
    
    private int getCardID(Card card) throws SQLException {
       
        return getIdValue("card_number = '"+card.getCardNumber()+"';");
       
    }
    
    
    public int getOrCreateCard(Card card) throws SQLException{
        if(isCardInDatabase(card.getCardNumber())) {
            return getCardID(card);
        }
        else{
            return createCardInDatabase(card);
        }
        
    }
    
    @Override
    protected String GetTableName() {
        return "xtra_card";
    }
    
    
    
    
}

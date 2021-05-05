/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.controllers;
import java.sql.SQLException;
import xtravision_2019300_2019438.models.Card;

/**
 *
 * @author Aline Rabelo
 * @author Francisco Leite
 * 
 */
public class CardController extends BaseController{
    //check if the card is in the database
    public boolean isCardInDatabase(String cardNumber) throws SQLException{
        return exists("card_number = '"+cardNumber+"'" );
    }
    // create a card in the database
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
    //get the id of a card based on its number
    private int getCardID(Card card) throws SQLException {
       
        return getIdValue("card_number = '"+card.getCardNumber()+"';");
       
    }
    
    //checks if the card is in the database and returns its id, if it is not in the database, adds it there and return its id
    public int getOrCreateCard(Card card) throws SQLException{
        if(isCardInDatabase(card.getCardNumber())) {
            return getCardID(card);
        }
        else{
            return createCardInDatabase(card);
        }
        
    }
   //to be used by the basecontroller methods 
    @Override
    protected String GetTableName() {
        return "xtra_card";
    }
    
    
    
    
}

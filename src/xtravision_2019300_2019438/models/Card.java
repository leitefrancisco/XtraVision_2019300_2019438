/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.models;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author aline
 */
public class Card {
    
    private int id;
    private String cardNumber;
    private String cardSecurityNumber;
    private String cardName;
    private int cardExpMonth;
    private int cardExpYear;
    
    public Card(){
        
    }
    
    public Card(String cardNumber, String cardSecurityNumber, String cardName, int cardExpMonth, int cardExpYear) {
        this.cardNumber = cardNumber;
        this.cardSecurityNumber = cardSecurityNumber;
        this.cardName = cardName;
        this.cardExpMonth = cardExpMonth;
        this.cardExpYear = cardExpYear;
    }
    
    public Card(int id,String cardNumber, String cardSecurityNumber, String cardName, int cardExpMonth, int cardExpYear) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardSecurityNumber = cardSecurityNumber;
        this.cardName = cardName;
        this.cardExpMonth = cardExpMonth;
        this.cardExpYear = cardExpYear;
    }
    
    public int getId() {
        return id;
    }
    
    public String getCardSecurityNumber() {
        return cardSecurityNumber;
    }
    
    public String getCardNumber() {
        return cardNumber;
    }
    
    public String getCardName() {
        return cardName;
    }
    
    public int getCardExpMonth() {
        return cardExpMonth;
    }
    
    
    public int getCardExpYear() {
        return cardExpYear;
    }
    
    public boolean checkCardDetails(Card card) throws InvalidCardException{
//        try{
//            return card.isValid();
//        }catch(Exception ex){
//            JOptionPane.showMessageDialog(this, ex.getMessage());
//        }
        
        if(!card.getCardNumber().matches("[0-9]+")){
            throw new InvalidCardException("a data esta no passado");
        }
        
        if(card.getCardNumber().length() != 16){
            throw new InvalidCardException("Must be 16 digits!");
        }
        
        if(!card.getCardName().matches("^[a-zA-Z ]+$")){
            throw new InvalidCardException("You can only use letters!");
        }
        if(!card.getCardSecurityNumber().matches("[0-9]+")){
            throw new InvalidCardException("You can only use security numbers!");
        }
        if(card.getCardSecurityNumber().length() != 3){
            throw new InvalidCardException("Must be 3 digits!");
        }
        return false;
    }
    public void dateIsValid(){
        String date = "anocarto-meacartoa-01";
        LocalDate convertedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-mm-dd"));
        convertedDate = convertedDate.withDayOfMonth(
        convertedDate.getMonth().length(convertedDate.isLeapYear()));
        Date today = new Date();
        SimpleDateFormat dF = new SimpleDateFormat("yyyy/mm/dd");
        dF.format(today);
        Date cardDate;
        
//        if( cardDate < today){
//            throw new InvalidCardException("a data esta no passado");
//        }
    }
    
}

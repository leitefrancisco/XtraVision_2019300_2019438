/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Aline Rabelo
 * @author Francisco Leite
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
    //validates the card from the view
    public void checkCardDetails(Card card) throws InvalidCardException, ParseException{ 
        
          checkCardNumberMatches(card);
          checkCardNameMatches(card);
          checkCardNumberEmpty(card);
          checkCardNumberLength(card);
          checkCardSecurityNumberLength(card);
          checkCardSecurityNumberMatches(card);
          checkCardDateIsValid();
    }   
    
    public void checkCardNumberMatches(Card card)throws InvalidCardException{
         
        if(!card.getCardNumber().matches("[0-9]+")){
            throw new InvalidCardException("This use only numbers in the card number field");
        }
        
    }
    
     public void checkCardNumberEmpty(Card card)throws InvalidCardException{
         
        if(card.getCardNumber().isEmpty()){
            throw new InvalidCardException("Card number cannot be empty");
        }
        
    }
    
   
    public void checkCardNumberLength(Card card)throws InvalidCardException{
         
         if(card.getCardNumber().length() != 16){
            throw new InvalidCardException("Card number must have 16 digits!");
        }      
    }
    
    public void checkCardNameMatches(Card card)throws InvalidCardException{
         
         if(!card.getCardName().matches("^[a-zA-Z ]+$")){
            throw new InvalidCardException("Card name can only have letters!");
        }        
    }
    
    public void checkCardSecurityNumberMatches(Card card)throws InvalidCardException{
         
        if(!card.getCardSecurityNumber().matches("[0-9]+")){
            throw new InvalidCardException("Card security number can only have numbers!");
        }      
    }
    
    public void checkCardSecurityNumberLength(Card card)throws InvalidCardException{
         
        if(card.getCardSecurityNumber().length() != 3){
            throw new InvalidCardException("Card security number must have 3 digits!");
        }  
    }
    
    
    public void checkCardDateIsValid() throws InvalidCardException, ParseException{
        
        Date today = new Date();
        
        
        
        
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        
        Date card = format.parse("" + this.cardExpYear  + "-" + (this.cardExpMonth) + "-01");
        Calendar cal = Calendar.getInstance();
        cal.setTime(card);
        int res = cal.getActualMaximum(Calendar.DATE);
        Date lastDayofCard = format.parse("" + this.cardExpYear  + "-" + (this.cardExpMonth) + "-"+res);
        
        
        
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(Calendar.DATE, 15);
        Date autoCharge = c.getTime();
        
        // if(autoCharge > lastDayofCard)   )
        if(autoCharge.compareTo(lastDayofCard) > 0 ){
            throw new InvalidCardException("Card Expired");
        }

    }
    
}

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
    
    public void checkCardDetails(Card card) throws InvalidCardException{
//        try{
//            return card.isValid();
//        }catch(Exception ex){
//            JOptionPane.showMessageDialog(this, ex.getMessage());
//        }    
        
          checkCardNumberMatches(card);
          checkCardNameMatches(card);
          checkCardNumberEmpty(card);
          checkCardNumberLength(card);
          checkCardSecurityNumberLength(card);
          checkCardSecurityNumberMatches(card);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.models;

/**
 *
 * @author aline
 */
public class Card {

    private String cardNumber;
    private int cardSecurityNumber;
    private String cardName;
    private int cardExpMonth;
    private int cardExpYear;

    public Card(String cardNumber, int cardSecurityNumber, String cardName, int cardExpMonth, int cardExpYear) {

        this.cardNumber = cardNumber;
        this.cardSecurityNumber = cardSecurityNumber;
        this.cardName = cardName;
        this.cardExpMonth = cardExpMonth;
        this.cardExpYear = cardExpYear;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardSecurityNumber() {
        return cardSecurityNumber;
    }

    public void setCardSecurityNumber(int cardSecurityNumber) {
        this.cardSecurityNumber = cardSecurityNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardExpMonth() {
        return cardExpMonth;
    }

    public void setCardExpMonth(int cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    public int getCardExpYear() {
        return cardExpYear;
    }

    public void setCardExpYear(int cardExpYear) {
        this.cardExpYear = cardExpYear;
    }
    
    
}

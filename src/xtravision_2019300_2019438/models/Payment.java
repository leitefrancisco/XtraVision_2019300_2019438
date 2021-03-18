/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.models;

import javax.swing.ImageIcon;

/**
 *
 * @author aline
 */
public class Payment {
    
    private int cardNumber;
    private String cardName;
    private int month;
    private int year;
    private int securityNumber;
    private int loyaltyNumber;    

    public Payment() {
    }
    
    public Payment(int cardNumber, String cardName, int month, int year, int securityNumber, int loyaltyNumber) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.month = month;
        this.year = year;
        this.securityNumber = securityNumber;
        this.loyaltyNumber = loyaltyNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public int getLoyaltyNumber() {
        return loyaltyNumber;
    }
    
    
}

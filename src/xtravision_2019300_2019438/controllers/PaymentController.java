/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.controllers;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import xtravision_2019300_2019438.models.Payment;
import xtravision_2019300_2019438.views.PaymentFrame;

/**
 *
 * @author aline
 */
public class PaymentController  {
    
     PaymentFrame paymentFrame;
     
     public PaymentController(){
        this.paymentFrame = new PaymentFrame(paymentFrame);
    }
     
     
    private int cardNumber;
    private String cardName;
    private int month;
    private int year;
    private int securityNumber;

    public PaymentController(int cardNumber, String cardName, int month, int year, int securityNumber) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.month = month;
        this.year = year;
        this.securityNumber = securityNumber;
    }
   
 
       
    
         
    
     
   
}

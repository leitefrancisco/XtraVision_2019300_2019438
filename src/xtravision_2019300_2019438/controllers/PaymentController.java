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
     Payment paymentModel;
     
     public PaymentController(){
        this.paymentFrame = new PaymentFrame(paymentFrame);
        this.paymentModel = new Payment();
    }
     
     
    private int cardNumber = paymentModel.getCardNumber();
    private String cardName = paymentModel.getCardName();
    private int month = paymentModel.getMonth();
    private int year = paymentModel.getYear();
    private int securityNumber = paymentModel.getSecurityNumber();
    private int loyaltyNumber = paymentModel.getLoyaltyNumber();
    
    Payment pM = new Payment(cardNumber, cardName, month, year, securityNumber, loyaltyNumber);
       
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Pay")){
            
            if(paymentModel.equals(e)){
                JOptionPane.showMessageDialog(paymentFrame, "Please fill all the field with valid credencials");
            }
            
            else{
                JOptionPane.showMessageDialog(paymentFrame, "Payment Success!"); 
            }
           
        }
         
    }
     
   
}

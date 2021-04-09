/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.views;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import xtravision_2019300_2019438.controllers.CardController;
import xtravision_2019300_2019438.controllers.PaymentController;
import xtravision_2019300_2019438.models.Card;
import xtravision_2019300_2019438.models.Cart;
import xtravision_2019300_2019438.models.Movie;
import xtravision_2019300_2019438.models.Order;


/**
 *
 * @author Francisco Leite
 * @author Aline Rabelo
 */
public class PaymentFrame extends javax.swing.JInternalFrame {
    
    private MainFrame mF;
    
    /**
     * Creates new form PaymentFrame
     */
    public PaymentFrame(MainFrame mf) {
        this.mF = mf;
        initComponents();
    }
    
    public PaymentFrame(PaymentFrame paymentFrame) {
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCardNumber = new javax.swing.JLabel();
        labelCardName = new javax.swing.JLabel();
        labelValid = new javax.swing.JLabel();
        labelSecurityNumber = new javax.swing.JLabel();
        textFieldCardNumber = new javax.swing.JTextField();
        textFieldCardName = new javax.swing.JTextField();
        textFieldSecurityNumber = new javax.swing.JTextField();
        btnPayment = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        comboBoxMonth = new javax.swing.JComboBox<>();
        comboBoxYear = new javax.swing.JComboBox<>();
        labelCreditCard = new javax.swing.JLabel();

        labelCardNumber.setText("Card Number:");

        labelCardName.setText("Card Name:");

        labelValid.setText("Valid:");

        labelSecurityNumber.setText("Security Number:");

        textFieldCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCardNumberActionPerformed(evt);
            }
        });

        textFieldCardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCardNameActionPerformed(evt);
            }
        });

        textFieldSecurityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSecurityNumberActionPerformed(evt);
            }
        });

        btnPayment.setText("Pay");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        comboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        comboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        labelCreditCard.setText("Credit Card");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldCardName, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCardName)
                            .addComponent(labelCardNumber)
                            .addComponent(labelValid)
                            .addComponent(labelSecurityNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(comboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(comboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldSecurityNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCreditCard)
                .addGap(415, 415, 415))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelCreditCard)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCardNumber)
                    .addComponent(textFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCardName)
                    .addComponent(textFieldCardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValid)
                    .addComponent(comboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSecurityNumber)
                    .addComponent(textFieldSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void textFieldCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCardNumberActionPerformed
    
    private void textFieldCardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCardNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCardNameActionPerformed
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mF.showCartFrame();
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        if( checkCardDetails() && checkCart()){
            int n = JOptionPane.showConfirmDialog(this,
                    "Would you like to procced your Payment?" ,
                    "Payment",
                    JOptionPane.YES_NO_OPTION);
            if(n == 0){
                
                Movie[] movies = Cart.getCurrentCart().getCartMovies();
                int [] idMovies = new int[movies.length];
                for (int i = 0 ; i<movies.length;i++){
                    idMovies[i] = movies[i].getId();
                }
                Date date = new Date();
                SimpleDateFormat dF = new SimpleDateFormat("dd/mm/yyyy");
                dF.format(date);

                
                Card card = new Card(textFieldCardNumber.getText() , Integer.parseInt(textFieldSecurityNumber.getText()), textFieldCardName.getText(), Integer.parseInt(comboBoxMonth.getSelectedItem().toString()), Integer.parseInt(comboBoxYear.getSelectedItem().toString()));
                
                
//            JOptionPane.showMessageDialog(this, "Payment Success!");

            }else{
                //this.showClosableWindow();
                
            }
        }
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void textFieldSecurityNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSecurityNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSecurityNumberActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPayment;
    private javax.swing.JComboBox<String> comboBoxMonth;
    private javax.swing.JComboBox<String> comboBoxYear;
    private javax.swing.JLabel labelCardName;
    private javax.swing.JLabel labelCardNumber;
    private javax.swing.JLabel labelCreditCard;
    private javax.swing.JLabel labelSecurityNumber;
    private javax.swing.JLabel labelValid;
    private javax.swing.JTextField textFieldCardName;
    private javax.swing.JTextField textFieldCardNumber;
    private javax.swing.JTextField textFieldSecurityNumber;
    // End of variables declaration//GEN-END:variables
    
    private void showClosableWindow() {
        
    }
    
    
    public boolean checkCardDetails(){
        if(!textFieldCardNumber.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "You can only use card numbers!");
            return false;
        }
        
        if(textFieldCardNumber.getText().length() != 16){
            System.out.println(textFieldCardNumber.getText().length());
            JOptionPane.showMessageDialog(this, "Must be 16 digits!");
            return false;
        }
        
        if(!textFieldCardName.getText().matches("^[a-zA-Z ]+$")){
            JOptionPane.showMessageDialog(this, "You can only use letters!");
            return false;
        }
        
        //DATE
//        if(labelValid.getText().matches("[0-9]+")){
//            Date date = new Date();
//            JOptionPane.showMessageDialog(this, "Please fill a valid date!");
//            return false;
//        }

if(!textFieldSecurityNumber.getText().matches("[0-9]+")){
    JOptionPane.showMessageDialog(this, "You can only use security numbers!");
    return false;
}

if(textFieldSecurityNumber.getText().length() != 3){
    System.out.println(textFieldSecurityNumber.getText().length());
    JOptionPane.showMessageDialog(this, "Must be 3 digits!");
    return false;
}

return true;

    }

    private boolean checkCart() {
        
      if(!new CardController().isCardInDatabase(textFieldCardNumber.getText())){
           if(Cart.getCurrentCart().getCartMovies().length > 2){
               JOptionPane.showMessageDialog(this, "You can only rent 2 movies for the first time 'Based on Card'");
               return false;
           }
        }
    return true;
    }    
    
    
}

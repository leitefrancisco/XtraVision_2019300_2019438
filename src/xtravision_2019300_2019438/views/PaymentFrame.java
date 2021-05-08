/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.views;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import xtravision_2019300_2019438.controllers.CardController;
import xtravision_2019300_2019438.controllers.OrderController;
import xtravision_2019300_2019438.models.Card;
import xtravision_2019300_2019438.models.Cart;
import xtravision_2019300_2019438.models.InvalidCardException;
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
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 600));

        labelCardNumber.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelCardNumber.setText("Card Number:");

        labelCardName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelCardName.setText("Card Name:");

        labelValid.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelValid.setText("Valid:");

        labelSecurityNumber.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelSecurityNumber.setText("Security Number:");

        textFieldCardNumber.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textFieldCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCardNumberActionPerformed(evt);
            }
        });

        textFieldCardName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textFieldCardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCardNameActionPerformed(evt);
            }
        });

        textFieldSecurityNumber.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textFieldSecurityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSecurityNumberActionPerformed(evt);
            }
        });

        btnPayment.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnPayment.setText("Pay");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        comboBoxMonth.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        comboBoxYear.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        labelCreditCard.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelCreditCard.setText("Credit Card");

        emailLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        emailLabel.setText("Email:");

        emailTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Enter your email to receive your receipt");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCardName)
                                    .addComponent(labelCardNumber)
                                    .addComponent(labelValid)
                                    .addComponent(labelSecurityNumber))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(textFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(234, 234, 234)
                                        .addComponent(comboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(textFieldSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldCardName, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(labelCreditCard))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelCreditCard)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCardNumber)
                    .addComponent(textFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCardName)
                    .addComponent(textFieldCardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValid))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSecurityNumber)
                    .addComponent(textFieldSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(37, 37, 37)
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
    //button to go back to the cart frame
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mF.showCartFrame();
    }//GEN-LAST:event_btnBackActionPerformed
    
private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try{
            CardController cd = new CardController();
            OrderController oc = new OrderController();
            boolean cardExists = cd.isCardInDatabase(textFieldCardNumber.getText());
            String email = emailTextField.getText().trim();
//            Date cardDate = 
            Card card = new Card(textFieldCardNumber.getText() ,
                    textFieldSecurityNumber.getText(),
                    textFieldCardName.getText(),
                    Integer.parseInt(comboBoxMonth.getSelectedItem().toString()),
                    Integer.parseInt(comboBoxYear.getSelectedItem().toString()));
            card.checkCardDetails(card);
            
            if(!email.isEmpty()){
                oc.checkEmail(email);
            }
            
            if(checkCart(cardExists)){
                int n = JOptionPane.showConfirmDialog(this,
                        "Would you like to procced your Payment?" ,
                        "Payment",
                        JOptionPane.YES_NO_OPTION);
                if(n == 0){
                    int cardId;
                    
                    cardId = cd.getOrCreateCard(card);
                    
                    Date date = new Date();
                    
                    SimpleDateFormat dF = new SimpleDateFormat("yyyy-mm-dd");
                    
                    dF.format(date);
                    
                    Movie[] movies = Cart.getCurrentCart().getCartMovies();
                    
                    Order order = new Order(cardId, date);
                    
                    order.addMovies(movies);
                    
                    int orderId = oc.createOrderinDb(order);
                    
                    if (!email.isEmpty()){
                        
                        oc.createReceipt(email, orderId);
                    }
                    
                    Cart.getCurrentCart().clearCart();
                    
                    this.mF.refreshCache();
                    
                    this.dispose();
                    
                    this.mF.showFirstFrame();
                    
                    JOptionPane.showMessageDialog(this, "Succes! \n Your Order Number is:" + orderId + "\n You need this number to return your movies"
                            + "\n If you don't return your movie in 15 days you will be charged  €15 in your Card and you get to keep the movie with you" );
                }
            }
        }
        catch (InvalidCardException ex) {
            JOptionPane.showMessageDialog(this, "There is a problem with your card: " + ex.getMessage());
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
    private void textFieldSecurityNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSecurityNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSecurityNumberActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPayment;
    private javax.swing.JComboBox<String> comboBoxMonth;
    private javax.swing.JComboBox<String> comboBoxYear;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCardName;
    private javax.swing.JLabel labelCardNumber;
    private javax.swing.JLabel labelCreditCard;
    private javax.swing.JLabel labelSecurityNumber;
    private javax.swing.JLabel labelValid;
    private javax.swing.JTextField textFieldCardName;
    private javax.swing.JTextField textFieldCardNumber;
    private javax.swing.JTextField textFieldSecurityNumber;
    // End of variables declaration//GEN-END:variables
    //validation so that if the customer's card is new, only authorize him to rent 2 films 
    private boolean checkCart(boolean cardExists) {
        

        if(!cardExists){
            if(Cart.getCurrentCart().getCartMovies().length > 2){
                JOptionPane.showMessageDialog(this, "You can only rent 2 movies for the first time 'Based on Card'");
                return false;
            }

        

        }
        return true;
    }
    
    
}

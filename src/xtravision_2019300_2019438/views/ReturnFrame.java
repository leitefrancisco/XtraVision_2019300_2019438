/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.views;

import javax.swing.JOptionPane;
import xtravision_2019300_2019438.controllers.OrderController;

/**
 *
 * @author Francisco Leite
 * @author Aline Rabelo
 */
public class ReturnFrame extends javax.swing.JInternalFrame {
    
    private MainFrame mF;
    private int id;
    
    /**
     * Creates new form ReturnFrame
     */
    public ReturnFrame(MainFrame mf) {
        this.mF = mf;
        this.id = id;
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        labelReturnInstructions = new javax.swing.JLabel();
        textFieldRentNumber = new javax.swing.JTextField();
        btnReturnMovie = new javax.swing.JButton();

        btnBack.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        labelReturnInstructions.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelReturnInstructions.setText("Please Insert your Order Number to return the Movie");

        textFieldRentNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textFieldRentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldRentNumberActionPerformed(evt);
            }
        });

        btnReturnMovie.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnReturnMovie.setText("Return Movie");
        btnReturnMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(textFieldRentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnReturnMovie))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(labelReturnInstructions)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(labelReturnInstructions)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturnMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //button to go back to first frame
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mF.showFirstFrame();
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void btnReturnMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnMovieActionPerformed
        try{
            int orderId = Integer.parseInt(textFieldRentNumber.getText().trim());
            OrderController oc = new OrderController();
            if(oc.checkOrderExists(orderId)){
                oc.refreshOrderStatusInDb(orderId);
                mF.showReturnDetailFrame(orderId);
            }
            else{
                JOptionPane.showMessageDialog(this, "There is no Order number "+orderId);
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: Order needs to be a Number");
        }
    }//GEN-LAST:event_btnReturnMovieActionPerformed
    
    private void textFieldRentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldRentNumberActionPerformed
    }//GEN-LAST:event_textFieldRentNumberActionPerformed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReturnMovie;
    private javax.swing.JLabel labelReturnInstructions;
    private javax.swing.JTextField textFieldRentNumber;
    // End of variables declaration//GEN-END:variables
}

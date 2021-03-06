/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.views;

import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import xtravision_2019300_2019438.controllers.CacheMovieSource;
import xtravision_2019300_2019438.controllers.IMovieSource;
import xtravision_2019300_2019438.controllers.MovieController;
import xtravision_2019300_2019438.models.Cart;
import xtravision_2019300_2019438.models.Movie;

/**
 *
 * @author Francisco Leite
 * @author Aline Rabelo
 */
public class MainFrame extends javax.swing.JFrame {
    private IMovieSource movieSource;
    
    public IMovieSource getMovieSource() {
        return movieSource;
    }
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        //initializing the components and adding to get information from the Database and adding home buttons like Home, a greeting and the card button
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Cart cart = new Cart(new ArrayList<Movie>());
        Cart.setCart(cart);
        refreshCache();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCart = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setMaximumSize(new java.awt.Dimension(0, 0));
        desktopPane.setPreferredSize(new java.awt.Dimension(900, 600));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Welcome!");

        btnCart.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnCart.setText("Cart   /    Checkout");
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });

        btnHome.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(271, 271, 271)
                .addComponent(btnCart)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCart, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnHome)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //button to redirect to the cart frame
    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
        this.showCartFrame(true);
    }//GEN-LAST:event_btnCartActionPerformed
    
    //button to redirect to the the main frame(first frame)
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        desktopPane.removeAll();
        if(!btnCart.isVisible()){
            enableCartButton();
        }
        this.showFirstFrame();
    }//GEN-LAST:event_btnHomeActionPerformed
    private void showWindow(javax.swing.JInternalFrame window){
        this.desktopPane.removeAll();
        window.setVisible(true);
        window.setClosable(false);
        this.desktopPane.add(window);
        try {
            window.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void showClosableWindow(javax.swing.JInternalFrame window){
        //method for when you are in another frame and add a back button to the previous frame to continue with the information within the frame.
        window.setVisible(true);
        this.desktopPane.add(window);
        try {
            window.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //method to show the rent frame
    public void showRentFrame(){
        showWindow(new RentFrame(this));
    }
    
    //method to show the return frame
    public void showReturnFrame(){
        showWindow(new ReturnFrame(this));
    }
    
    //method to show the cart frame
    public void showCartFrame(boolean closable){
        CartFrame cf = new CartFrame(this);
        enableCartButton();
        disableCartButton();
        if(closable){
            showClosableWindow(cf);
        }else{
            showWindow(cf);
        }
        
    }
    
    public void enableCartButton(){
         btnCart.setVisible(true);
          
    }
    
    public void disableCartButton(){
        btnCart.setVisible(false);
    }
    
    //method to show the Payment frame
    public void showPaymentFrame(){    
        showWindow(new PaymentFrame(this));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame mf = new MainFrame();
                mf.showFirstFrame();
                mf.setVisible(true);
                
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnHome;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
    public void showFirstFrame() {
        showWindow(new FirstFrame(this));
        if(!btnCart.isVisible()){
            enableCartButton();
        }
    }
    
    void showCartFrame() {
        showWindow(new CartFrame(this));
    }
    
    
    void showMovieDetails(int id) {
        
        showClosableWindow(new MovieDetailFrame(this,id));
        
    }
    
    void showReturnDetailFrame(int orderId){
        showWindow(new ReturnDetailFrame(this,orderId));
    }
   
    
    
    //the movie source will be null at start and we can choose between going to the database all the time with movie controller or use
    //the cachemoviesource to make the process faster, just need to uncoment line 284, and coment line 285.... when using cachemovieSource, it will go the the data base only once
    void refreshCache() {
        if(this.movieSource == null){
//            this.movieSource = new MovieController();
            this.movieSource = new CacheMovieSource();
        }
        
        if(this.movieSource.isCached()){
            ((CacheMovieSource)this.movieSource).refreshCache(new MovieController());
        }
    }
    
    
    
}

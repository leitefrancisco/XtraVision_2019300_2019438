/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.views;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import xtravision_2019300_2019438.controllers.CartController;
import xtravision_2019300_2019438.controllers.MovieController;
import xtravision_2019300_2019438.models.Movie;

/**
 *
 * @author Francisco Leite
 */


public class MovieDetailFrame extends javax.swing.JInternalFrame {
    private MainFrame mf;
    private int id;
    /**
     * Creates new form MovieDetailFrame
     */
    public MovieDetailFrame() {
        initComponents();
       
    }

    public MovieDetailFrame(MainFrame mf, int id) {
        this.mf = mf;
        this.id = id;
        initComponents();
        setLabels(getMovieInfo());
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
        labelImg = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelDirector = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelSynopsis = new javax.swing.JTextArea();
        btnRent = new javax.swing.JButton();
        spinnerQnt = new javax.swing.JSpinner();
        labelPrice = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 600));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        labelImg.setMinimumSize(new java.awt.Dimension(180, 250));

        labelTitle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelTitle.setText("TITLE");

        labelDirector.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDirector.setText("Director");

        labelSynopsis.setBackground(new java.awt.Color(240, 240, 240));
        labelSynopsis.setColumns(7
        );
        labelSynopsis.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelSynopsis.setRows(5);
        labelSynopsis.setAlignmentX(0.1F);
        labelSynopsis.setAlignmentY(0.1F);
        jScrollPane1.setViewportView(labelSynopsis);

        btnRent.setText("Rent");
        btnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentActionPerformed(evt);
            }
        });

        spinnerQnt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spinnerQnt.setModel(new javax.swing.SpinnerNumberModel(1, 1, 2, 1));
        spinnerQnt.setValue(1);

        labelPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPrice.setText("2.99 €");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnRent, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelPrice)
                                                .addGap(18, 18, 18)
                                                .addComponent(spinnerQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(45, 45, 45))
                                    .addComponent(labelDirector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(labelTitle)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDirector)
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spinnerQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPrice))
                                .addGap(91, 91, 91)
                                .addComponent(btnRent, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentActionPerformed

        evt.getActionCommand().equals(btnRent);
        int n = JOptionPane.showConfirmDialog(this, 
                    "Movie added to the Cart \n Would you like to procced to Payment?" , 
                    "Rent Movie", 
                    JOptionPane.YES_NO_OPTION);
        if(n == 0){
            addmMovieToCart(getMovieInfo());
            mf.showCartFrame(true);
           
        }else{
            this.dispose();
           
        }
            
            
    }//GEN-LAST:event_btnRentActionPerformed
    private void addmMovieToCart(Movie movie){
        CartController cc = new CartController();
        cc.addMovie(movie);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDirector;
    private javax.swing.JLabel labelImg;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JTextArea labelSynopsis;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JSpinner spinnerQnt;
    // End of variables declaration//GEN-END:variables
   
    private Movie getMovieInfo(){
        MovieController mc = new MovieController();
        Movie movie = mc.getMovieById(this.id);
        
        return movie;
            
    }
    private void setLabels(Movie movie){
        
        movie = getMovieInfo();
        labelTitle.setText(movie.getTitle());
        labelDirector.setText(movie.getDirector());
        labelSynopsis.setText(movie.getSynopsis());
        ImageIcon image = new ImageIcon((byte[])movie.getImage());
        image.setImage(image.getImage().getScaledInstance(150,180,180));
        labelImg.setIcon(image);       
        labelSynopsis.setLineWrap(true);
        labelSynopsis.setWrapStyleWord(true);
        labelSynopsis.setEditable(false);
    }
    

  
}

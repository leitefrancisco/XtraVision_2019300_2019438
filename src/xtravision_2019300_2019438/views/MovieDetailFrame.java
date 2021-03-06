/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.views;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import xtravision_2019300_2019438.models.Cart;
import xtravision_2019300_2019438.models.Movie;

/**
 *
 * /**
 *
 * @author Francisco Leite
 * @author Aline Rabelo
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
        labelPrice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelMovieAmount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNotAvl = new javax.swing.JLabel();
        labelAmount = new javax.swing.JLabel();
        labelYear = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        btnBack.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        labelImg.setMaximumSize(new java.awt.Dimension(280, 420));
        labelImg.setMinimumSize(new java.awt.Dimension(280, 420));

        labelTitle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelTitle.setText("TITLE");

        labelDirector.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDirector.setText("Director");

        labelSynopsis.setBackground(new java.awt.Color(240, 240, 240));
        labelSynopsis.setColumns(7
        );
        labelSynopsis.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelSynopsis.setRows(5);
        labelSynopsis.setTabSize(10);
        labelSynopsis.setAlignmentX(0.1F);
        labelSynopsis.setAlignmentY(0.1F);
        jScrollPane1.setViewportView(labelSynopsis);

        btnRent.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnRent.setText("Rent");
        btnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentActionPerformed(evt);
            }
        });

        labelPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelPrice.setText("2.99 ???");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Synopsis");

        labelMovieAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelMovieAmount.setText("Movie Amount:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Director:");

        labelAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelAmount.setText("amt");

        labelYear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelYear.setText("year");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelMovieAmount)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblNotAvl, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRent, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPrice))
                                .addGap(80, 80, 80)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDirector)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelYear)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMovieAmount)
                                    .addComponent(labelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNotAvl)
                                .addGap(18, 18, 18)
                                .addComponent(labelPrice)
                                .addGap(72, 72, 72)
                                .addComponent(btnRent, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //button to go back to the previous frame
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void btnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentActionPerformed
        //confirmation button for renting the movie
        int n = JOptionPane.showConfirmDialog(this,
                "Confirm Renting? " ,
                "Rent Movie",
                JOptionPane.YES_NO_OPTION);
      
        //if the client wants to rent more than 4 films, the system does not authorize it.
     if(Cart.getCurrentCart().getCartMovies().length<4){
            if(n == 0){
                if(Cart.getCurrentCart().addMovie(getMovieInfo())){
                    JOptionPane.showMessageDialog(this, "Movie Added");
                    this.dispose();
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Movie not Added \n you can only rent one movie of each title"); 
                    this.dispose();
                }
                
            }else{
                this.dispose();
                
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "You cannot have more than 4 movies in your Cart\nPlease remove one movie or clear your cart ");
        }
        
        
        
        
        
        
        
//        evt.getActionCommand().equals(btnRent);
//        int n = JOptionPane.showConfirmDialog(this,
//                    "Movie added to the Cart \n Would you like to procced to Payment?" ,
//                    "Rent Movie",
//                    JOptionPane.YES_NO_OPTION);
//        if(n == 0){
//            addmMovieToCart(getMovieInfo());
//            mf.showCartFrame(true);
//
//        }else{
//            this.dispose();
//
//        }
        
        
    }//GEN-LAST:event_btnRentActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAmount;
    private javax.swing.JLabel labelDirector;
    private javax.swing.JLabel labelImg;
    private javax.swing.JLabel labelMovieAmount;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JTextArea labelSynopsis;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelYear;
    private javax.swing.JLabel lblNotAvl;
    // End of variables declaration//GEN-END:variables
    
    private Movie getMovieInfo(){

        Movie movie = this.mf.getMovieSource().getMovieById(this.id);
       

        //method to get all the informations about movies from the database, getting by the id

        return movie;
        
    }
    private void setLabels(Movie movie){
        //setting the labels that will show in the detail frame such as title, director etc...
        movie = getMovieInfo();
        labelTitle.setText(movie.getTitle());
        labelDirector.setText(movie.getDirector());
        labelSynopsis.setText(movie.getSynopsis());
        ImageIcon image = new ImageIcon((byte[])movie.getImage());
        image.setImage(image.getImage().getScaledInstance(280,420,Image.SCALE_SMOOTH));
        labelImg.setIcon(image);
        labelSynopsis.setLineWrap(true);
        labelSynopsis.setWrapStyleWord(true);
        labelSynopsis.setEditable(false);
        labelYear.setText(String.valueOf(movie.getYear()));
        labelAmount.setText(String.valueOf(movie.getAvlAmt()));
         if(labelAmount.getText().equals("0")){
             btnRent.setEnabled(false);
             lblNotAvl.setText("No copies available");
         }
    }
    
    
    
}

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.views;

import xtravision_2019300_2019438.controllers.GenreController;
import xtravision_2019300_2019438.controllers.MovieController;
import xtravision_2019300_2019438.models.Movie;

/**
 *
 * @author aline
 */
public class RentFrame extends javax.swing.JInternalFrame {
    
    private MainFrame mF;
    
    /**
     * Creates new form RentFrame
     */
    
    
    public RentFrame(MainFrame mf) {
        this.mF = mf;
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
        panelSeach = new javax.swing.JPanel();
        titleSearchTextBox = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        javax.swing.JLabel lblSearchTitle = new javax.swing.JLabel();
        comboBoxGenres = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();
        paneMovies = new javax.swing.JScrollPane();
        tableMovies = new javax.swing.JTable();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        titleSearchTextBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        titleSearchTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleSearchTextBoxActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblSearchTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSearchTitle.setText("Title:");

        comboBoxGenres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxGenres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGenresActionPerformed(evt);
            }
        });

        jLabel1.setText("Genre");

        btnClear.setText("Clear Filters");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSeachLayout = new javax.swing.GroupLayout(panelSeach);
        panelSeach.setLayout(panelSeachLayout);
        panelSeachLayout.setHorizontalGroup(
            panelSeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeachLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblSearchTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleSearchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxGenres, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addGap(31, 31, 31))
        );
        panelSeachLayout.setVerticalGroup(
            panelSeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(titleSearchTextBox)
                .addComponent(lblSearchTitle))
            .addGroup(panelSeachLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(panelSeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxGenres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnClear)))
        );

        btnCheckout.setText("Advance");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        tableMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableMovies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMoviesMouseClicked(evt);
            }
        });
        paneMovies.setViewportView(tableMovies);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneMovies, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelSeach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheckout)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSeach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneMovies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCheckout)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mF.showFirstFrame();
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void titleSearchTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleSearchTextBoxActionPerformed
        
    }//GEN-LAST:event_titleSearchTextBoxActionPerformed
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        comboBoxGenres.setSelectedIndex(0);
        showMoviesByTitle();
        
        
    }//GEN-LAST:event_btnSearchActionPerformed
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        showAllMovies(new MovieController().getMovies());
        showGenres();
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void comboBoxGenresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGenresActionPerformed
        String selectedGenre = (String) comboBoxGenres.getSelectedItem();
        if(selectedGenre.equals("Select Genre")){
            showAllMovies(new MovieController().getMovies());
        }else{
            showMoviesByGenre(selectedGenre);
        }
    }//GEN-LAST:event_comboBoxGenresActionPerformed
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        showAllMovies(new MovieController().getMovies());
        titleSearchTextBox.setText("");
        comboBoxGenres.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void tableMoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMoviesMouseClicked
        int row = tableMovies.getSelectedRow();
        Movie movie = (Movie) tableMovies.getValueAt(row, 0);
        mF.showMovieDetails(movie.getId());
    }//GEN-LAST:event_tableMoviesMouseClicked

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckoutActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox comboBoxGenres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane paneMovies;
    private javax.swing.JPanel panelSeach;
    private javax.swing.JTable tableMovies;
    private javax.swing.JTextField titleSearchTextBox;
    // End of variables declaration//GEN-END:variables
    
    public String getTitleSearchTextBox() {
        return titleSearchTextBox.getText();
    }
    private void setTableModel(MoviesTableModel model){
        tableMovies.setModel(model);
        tableMovies.setRowHeight(120);
        tableMovies.getColumnModel().getColumn(0).setPreferredWidth(10);
        tableMovies.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        tableMovies.repaint();
        
    }
    
    public void showGenres(){
        GenreController controller = new GenreController();
        String[] genresNameInDb = controller.getGenres();
        comboBoxGenres.setModel(new javax.swing.DefaultComboBoxModel(genresNameInDb));
    }
    public void showAllMovies(Movie[] movies){
        MoviesTableModel model = new MoviesTableModel(movies);
        setTableModel(model);
        
    }
    public void showMoviesByTitle (){
        MovieController controller = new MovieController();
        Movie[] movies = controller.getMoviesByTitle(getTitleSearchTextBox());
        MoviesTableModel model = new MoviesTableModel(movies);
        setTableModel(model);
    }
    public void showMoviesByGenre(String selectedGenre){
        MovieController controller = new MovieController();
        Movie[] movies = controller.getMoviesByGenre(selectedGenre);
        MoviesTableModel model = new MoviesTableModel(movies);
       setTableModel(model);
    }
    
//    private void filterMovies(){
//        String genre = this.getSelectedGenre();
//        String title = this.getFilterTitle();
//        MovieController c = new MovieController();
//         Movie[] movies = controller.getFilteredMovies(title, genre);
//        MoviesTableModel model = new MoviesTableModel(movies);
//        tableMovies.setModel(model);
//    }
    
    
    
}

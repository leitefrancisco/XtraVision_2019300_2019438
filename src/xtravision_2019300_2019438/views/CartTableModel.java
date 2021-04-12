/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.views;

import javax.swing.table.AbstractTableModel;
import xtravision_2019300_2019438.models.Movie;

/**
 *
 * @author Francisco Leite
 * @author Aline Rabelo
 */
public class CartTableModel extends AbstractTableModel {
    
    //cart table model to configure and the cart frame with an abstract class
    
    private String[] columnNames = {"Front","Title"};
    private Movie[] movies;
    
    public CartTableModel( Movie[] movies) {
        this.movies = movies;
    }
    
    
    
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
    @Override
    public int getRowCount() {
        return movies.length;
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //method to index the movie in the cart taking from the database
        
        Movie movie = movies[rowIndex];
        
        switch (columnIndex){
            case 0: {
                return movie;
            }
            case 1:{
                return movie.getTitle();
            }
            
        }
        return null;
    }
        
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.views;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import xtravision_2019300_2019438.models.Movie;

/**
 *
 * @author Francisco Leite
 */
public class ImageRenderer extends DefaultTableCellRenderer {
    //https://www.daniweb.com/programming/software-development/threads/447192/trying-to-show-image-from-mysql-to-jtable
 
    ImageRenderer() {
        
    }
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,boolean hasFocus, int row, int column)
        {  
            Movie movie = (Movie) value;
            JLabel label = new JLabel();
            try{
                if (value!=null) {
                    label.setHorizontalAlignment(JLabel.CENTER);
                    //value is parameter which filled by byteOfImage
                    label.setIcon(new ImageIcon((byte[])movie.getImage()));
                }       
            }
            catch(Exception ex){
                System.out.println(ex.toString());
            }
            return label;
        }
    
}

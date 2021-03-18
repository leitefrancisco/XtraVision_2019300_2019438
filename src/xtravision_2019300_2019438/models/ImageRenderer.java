/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.models;

import java.awt.Component;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Francisco Leite
 */
public class ImageRenderer extends DefaultTableCellRenderer {
    //https://www.daniweb.com/programming/software-development/threads/447192/trying-to-show-image-from-mysql-to-jtable
    ImageIcon format;
        ResultSet rs;
        public ImageRenderer(ResultSet rs1)
        {
            rs=rs1;
        }
        @Override
        public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected,boolean hasFocus, int row, int column)
        {  
            JLabel label = new JLabel();
            try{
                byte[] imagedata=rs.getBytes(4);
                format=new ImageIcon(imagedata);
                if (value!=null) {
                    label.setHorizontalAlignment(JLabel.CENTER);
                    //value is parameter which filled by byteOfImage
                    label.setIcon(format);
                }       
            }
            catch(Exception ex){}
            return label;
        }
    
}

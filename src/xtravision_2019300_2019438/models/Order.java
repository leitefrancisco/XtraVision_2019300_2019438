/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aline
 */
public class Order {
    
    
    private ArrayList<OrderLine> orderLines;
    private String creditCardID;
    private Date date;

    public Order(ArrayList<OrderLine> orderLines, String creditCardID, Date date) {
        this.orderLines = orderLines;
        this.creditCardID = creditCardID;
        this.date = date;
    }
    

    
    
    
            
}

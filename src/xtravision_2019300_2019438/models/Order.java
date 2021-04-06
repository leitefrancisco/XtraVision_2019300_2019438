/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.models;

import java.util.Date;

/**
 *
 * @author aline
 */
public class Order {
    
    
    private int id;
    private int[] moviesId;
    private String creditCardID;
    private Date date;

    public Order(int[] moviesId, String creditCardID, Date date) {
        this.moviesId = moviesId;
        this.creditCardID = creditCardID;
        this.date = date;
    }
    
    
            
}

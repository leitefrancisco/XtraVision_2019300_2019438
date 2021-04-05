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
    private int creditCardNumber;
    private Date date;

    public Order(int[] moviesId, int creditCardNumber, Date date) {
        this.moviesId = moviesId;
        this.creditCardNumber = creditCardNumber;
        this.date = date;
    }
    
    
            
}

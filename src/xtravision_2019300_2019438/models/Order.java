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
    
    //class created to create an order object
    private ArrayList<OrderLine> orderLines;
    private int creditCardID;
    private Date date;

//    public Order(ArrayList<OrderLine> orderLines, int creditCardID, Date date) {
//        this.orderLines = orderLines;
//        this.creditCardID = creditCardID;
//        this.date = date;
//    }

    public Order(int cardId, Date date) {
         this.creditCardID = cardId;
        this.date = date;
        this.orderLines = new ArrayList<>();
    }

    public ArrayList<OrderLine> getOrderLines() {
        return orderLines;
    }

    public int getCreditCardID() {
        return creditCardID;
    }

    public Date getDate() {
        return date;
    }

    public void addMovies(Movie[] movies) {
        for(Movie m : movies){
            OrderLine orderLine = new OrderLine(m.getId());
            this.orderLines.add(orderLine);
        }
    }
    

    
    
    
            
}

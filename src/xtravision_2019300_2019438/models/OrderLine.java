/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.models;

/**
 * class to create the items in a order
 * @author Francisco Leite
 * @author Aline Rabelo
 */
public class OrderLine {
    private int movieId;
    private int orderId;
    
    
    /*
    status: 0 to return
            1 returned
            2 not returned after 15 days from rent (impossible to return and card charged 15 Euro
    */   
    private int status;
    //an oder have various items, we named these like OrderLines.
    public OrderLine(int movieId, int orderId, int status) {
        this.movieId = movieId;
        this.orderId = orderId;
        this.status = status;
    }

    public OrderLine( int movieId) {
        this.movieId = movieId;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getStatus() {
        return status;
    }
    
    
    
    
}

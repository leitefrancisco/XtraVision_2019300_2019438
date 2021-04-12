/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.models;

/**
 *
 * @author Francisco Leite
 */
public class OrderLine {
    private int movieId;
    private int orderId;
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

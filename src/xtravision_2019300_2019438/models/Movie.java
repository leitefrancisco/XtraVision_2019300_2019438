/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.models;

import java.util.Date;

/**
 *
 * @author Francisco Leite
 */
public class Movie {
    
    private int id;
    private String title;
    private String genre;
    private String Director;
    private int year;
    private String synopsis;
    private byte[] image; //the image is stored in the database and is converted later into a label with image
    private int avlAmt;
    private Date date;
    private int status;
    private int orderLineId;
    
    
    public Movie() {
    }

    public Movie(int id, byte[] image, String title, Date date, int status,int orderLineId) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.date = date;
        this.status = status;
        this.orderLineId = orderLineId;
    }
    
    
    
    //Movie constructor with all the attibrutes from the movies in the database
    public Movie(int id, String title, String genre, String Director, int year, String synopsis,byte[] image, int avlAmt) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.Director = Director;
        this.year = year;
        this.synopsis = synopsis;
        this.image = image;
        this.avlAmt = avlAmt;
    }

    public Date getDate() {
        return date;
    }

    public int getStatus() {
        return status;
    }
    
    public int getAvlAmt() {
        return avlAmt;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String getDirector() {
        return Director;
    }
    
    
    public int getYear() {
        return year;
    }
    
    public String getSynopsis() {
        return synopsis;
    }
    
    public byte[] getImage() {
        return image;
    }

    public int getOrderLineId() {
        return orderLineId;
    }
    
    
}

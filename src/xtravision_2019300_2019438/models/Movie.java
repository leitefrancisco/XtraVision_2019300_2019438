/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.models;

import java.util.logging.Level;
import java.util.logging.Logger;



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
    private byte[] image;
    private int avlAmt;
   

    public Movie() {
    }

   
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

    public int getAvlAmt() {
        return avlAmt;
    }

    public void setAvlAmt(int avlAmt) {
        this.avlAmt = avlAmt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

   

   
    
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

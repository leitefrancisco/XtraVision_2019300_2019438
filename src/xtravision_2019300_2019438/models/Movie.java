/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import xtravision_2019300_2019438.database.Database;

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
    private ImageIcon image;    

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", title=" + title + ", genre=" + genre + ", Director=" + Director + ", year=" + year + ", synopsis=" + synopsis + ", image=" + image + '}';
    }
    public Movie(int id, String title, String genre, String Director, int year, String synopsis) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.Director = Director;
        this.year = year;
        this.synopsis = synopsis;
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

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    
    
    
    
 
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

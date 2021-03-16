/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.models;

import com.mysql.cj.protocol.Resultset;
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
    
    public Movie[] getMoviesFromDB(){
        ArrayList<Movie> movies = new ArrayList<>();
        try{
            Database db = new Database();
            String query = "select * from xtra_movie;";

            ResultSet rs = db.executeQuery(query);
            
            while(rs.next())
            {
               Movie movie = new Movie(rs.getInt(1),rs.getString(3),rs.getString(2),rs.getString(5),rs.getInt(4),rs.getString(6));
               movies.add(movie);
            }
            db.close();
        }
        catch (SQLException se) {
            System.out.println("SQL Exception:");
            
            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());
                
                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
            
        }
       
        
        
       return movies.toArray(new Movie[movies.size()]);
    }
    public Movie[] getMoviesByTitle(String title) {
       ArrayList<Movie> movies = new ArrayList<>();
        try{
            Database db = new Database();
            String query = "select * from xtra_movie where xtra_movie.title like'%" + title +" %'";

            ResultSet rs = db.executeQuery(query);
            
            while(rs.next())
            {
               Movie movie = new Movie(rs.getInt(1),rs.getString(3),rs.getString(2),rs.getString(5),rs.getInt(4),rs.getString(6));
               movies.add(movie);
            }
            db.close();
        }
        catch (SQLException se) {
            System.out.println("SQL Exception:");
            
            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());
                
                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
            
        }
       
        
        
       return movies.toArray(new Movie[movies.size()]);
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

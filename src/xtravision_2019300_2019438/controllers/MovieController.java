/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.controllers;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import xtravision_2019300_2019438.database.Database;
import xtravision_2019300_2019438.models.Movie;

/**
 *
 * @author Francisco Leite
 */
public class MovieController{
    
    private Movie[] getMoviesFromQuery(String query){
        ArrayList<Movie> movies = new ArrayList<>();
        try{
            Database db = new Database();
            ResultSet rs = db.executeQuery(query);
            
            while(rs.next())
            {
                JLabel image = new JLabel();
                image.setIcon(new ImageIcon(rs.getBytes(7)));
                
                Movie movie = new Movie(rs.getInt(1),rs.getString(3),rs.getString(2),rs.getString(5),rs.getInt(4), rs.getString(6),image);
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
    
    public Movie[] getMovies(){
        
        String query = "select m.id,g.genre, m.title, m.year, m.director,m.synopsis, m.image from xtra_movie m\n" +
                "join xtra_genre g \n" +
                "on m.genre_id = g.id\n" +
                "order by title;";
        
        return getMoviesFromQuery(query);
    }
    
    public Movie[] getMoviesByTitle(String title) {
        
        String query = "select m.id, g.genre, m.title, m.year, m.director,m.synopsis,m.image "
                + "from xtra_movie m \n"
                + "join xtra_genre g \n"
                + "on m.genre_id = g.id \n"
                + "where title like '%" + title+ "%'\n"
                + "order by title;";
        
        return getMoviesFromQuery(query);
    }

    public Movie[] getMoviesByGenre(String selectedGenre) {
        String query = "select m.id, g.genre, m.title, m.year, m.director,m.synopsis,m.image "
                + "from xtra_movie m \n"
                + "join xtra_genre g \n"
                + "on m.genre_id = g.id \n"
                + "where genre like '%" + selectedGenre+ "%'\n"
                + "order by title;";
        
        return getMoviesFromQuery(query);
    }
    
}

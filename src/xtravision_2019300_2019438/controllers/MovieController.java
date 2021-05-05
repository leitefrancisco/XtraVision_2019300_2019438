/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import xtravision_2019300_2019438.database.Database;
import xtravision_2019300_2019438.models.Movie;

/**
 *
 * @author Francisco Leite
 * @author Aline Rabelo
 */
public class MovieController extends BaseController implements IMovieSource {
    //method used inside the others from this class, it will handle the querie from the other methods and return the movies based on it.
    private Movie[] getMoviesFromQuery(String query){
        ArrayList<Movie> movies = new ArrayList<>();
        try{
            Database db = new Database();
            ResultSet rs = db.executeQuery(query);
            
            while(rs.next())
            {
                //int amt = rs.getInt()
                Movie movie = new Movie(rs.getInt(1),rs.getString(3),rs.getString(2),rs.getString(5),rs.getInt(4), rs.getString(6),rs.getBytes(7), rs.getInt(8));
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
    
    @Override
    public Movie[] getMovies(){
        
        String query = "select m.id,g.genre, m.title, m.year, m.director,m.synopsis, m.image,m.amount from xtra_movie m\n" +
                "join xtra_genre g \n" +
                "on m.genre_id = g.id\n" +
                "order by title;";
        
        return getMoviesFromQuery(query);
    }
    
    
    @Override
    public Movie[] getMoviesByTitle(String title) {
        
        String query = "select m.id, g.genre, m.title, m.year, m.director,m.synopsis,m.image, m.amount "
                + "from xtra_movie m \n"
                + "join xtra_genre g \n"
                + "on m.genre_id = g.id \n"
                + "where title like '%" + title+ "%'\n"
                + "order by title;";
        
        return getMoviesFromQuery(query);
    }
    
    @Override
    public Movie getMovieById(int id) {
        
        String query = "select m.id, g.genre, m.title, m.year, m.director,m.synopsis,m.image, m.amount "
                + "from xtra_movie m \n"
                + "join xtra_genre g \n"
                + "on m.genre_id = g.id \n"
                + "where m.id =" + id + "\n";
        
        return getMoviesFromQuery(query)[0];
        
    }
    
    @Override
    public Movie[] getMoviesByGenre(String selectedGenre) {
        String query = "select m.id, g.genre, m.title, m.year, m.director,m.synopsis,m.image, m.amount "
                
                + "from xtra_movie m \n"
                + "join xtra_genre g \n"
                + "on m.genre_id = g.id \n"
                + "where genre like '%" + selectedGenre+ "%'\n"
                + "order by title;";
        
        return getMoviesFromQuery(query);
    }
    //gets movies from a order 
    public Movie[] getMoviesFromOrderId(int orderId){
        String query = "select m.id, m.image, m.title, o.date, ol.status, ol.id as 'Order Line ID' from xtra_movie m\n" +
                "join xtra_order_line ol\n" +
                "on m.id = ol.movie_id\n" +
                "join xtra_order o\n" +
                "on o.id = ol.order_id\n" +
                "where o.id = " + orderId;
        ArrayList<Movie> movies = new ArrayList<>();
        try{
            Database db = new Database();
            ResultSet rs = db.executeQuery(query);
            
            while(rs.next())
            {
                //int amt = rs.getInt()
                Movie movie = new Movie(rs.getInt(1),rs.getBytes(2),rs.getString(3),rs.getDate(4),rs.getInt(5),rs.getInt(6));
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
    
    @Override
    protected String GetTableName() {
        return "xtra_movie";
    }
    
    @Override
    public boolean isCached() {
        return false;
    }
    //returs a movie
    public void returnMovie(int orderLineId,int movieId) throws SQLException {
        String queryStatus = "update xtra_order_line set status = 1  where id = " +orderLineId + " ;";
         String queryAddAmt = " update xtra_movie set amount = amount+1 where id = "+movieId;
        
        executeUpdate(queryStatus);
        executeUpdate(queryAddAmt);
        
        
    }
}

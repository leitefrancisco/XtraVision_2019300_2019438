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
import xtravision_2019300_2019438.models.MoviesInDb;

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
    
    public Movie[] getMoviesDb(){
        
        String query = "select m.id,g.genre, m.title, m.year, m.director,m.synopsis, m.image,m.amount from xtra_movie m\n" +
                "join xtra_genre g \n" +
                "on m.genre_id = g.id\n" +
                "order by title;";
        
        return getMoviesFromQuery(query);
    }
    
    public Movie[] getMovies(){
        return  MoviesInDb.getCurrentMoviesInDb().getMovies();
    }
    
    public Movie[] getMoviesByTitleDb(String title) {
        
        String query = "select m.id, g.genre, m.title, m.year, m.director,m.synopsis,m.image, m.amount "
                + "from xtra_movie m \n"
                + "join xtra_genre g \n"
                + "on m.genre_id = g.id \n"
                + "where title like '%" + title+ "%'\n"
                + "order by title;";
        
        return getMoviesFromQuery(query);
    }
    public Movie[] getMoviesByTitle(String title){
        ArrayList<Movie> movies = new ArrayList<>();
        Movie[] moviesInDb = MoviesInDb.getCurrentMoviesInDb().getMovies();
        for (int i = 0 ; i<moviesInDb.length ; i++){
            if(moviesInDb[i].getTitle().toLowerCase().contains(title.toLowerCase())){
                movies.add(moviesInDb[i]);
            }
        }
        return movies.toArray(new Movie[movies.size()]);
    }
    
    public Movie getMovieByIdDb(int id) {
        
        String query = "select m.id, g.genre, m.title, m.year, m.director,m.synopsis,m.image, m.amount "
                + "from xtra_movie m \n"
                + "join xtra_genre g \n"
                + "on m.genre_id = g.id \n"
                + "where m.id =" + id + "\n";
        
        return getMoviesFromQuery(query)[0];
       
    }
    public Movie getMovieById(int id){
        for (int i = 0;  i<MoviesInDb.getCurrentMoviesInDb().getMovies().length ; i++){
            if (MoviesInDb.getCurrentMoviesInDb().getMovies()[i].getId() == id){
                return MoviesInDb.getCurrentMoviesInDb().getMovies()[i];
            }
        }
        return null;
    }



    public Movie[] getMoviesByGenre(String selectedGenre) {
        String query = "select m.id, g.genre, m.title, m.year, m.director,m.synopsis,m.image, m.amount "

                + "from xtra_movie m \n"
                + "join xtra_genre g \n"
                + "on m.genre_id = g.id \n"
                + "where genre like '%" + selectedGenre+ "%'\n"
                + "order by title;";
        
        return getMoviesFromQuery(query);
    }
    public Movie[] getMoviesByGenre(String selectedGenre) {
        ArrayList<Movie> movies = new ArrayList<>();
        for (int i = 0;  i<MoviesInDb.getCurrentMoviesInDb().getMovies().length ; i++){
            if (MoviesInDb.getCurrentMoviesInDb().getMovies()[i].getGenre()== selectedGenre){
                 movies.add(MoviesInDb.getCurrentMoviesInDb().getMovies()[i]);
            }
        }
        return movies.toArray(new Movie[movies.size()]);
    }
    
   
    
}

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.models;

import xtravision_2019300_2019438.controllers.MovieController;

/**
 *
 * @author Francisco Leite
 */
public class MoviesInDb{
    
    private static MoviesInDb currentMoviesInDb;
    private Movie[] movies = new MovieController().getMoviesDb();
    
   
    
    public MoviesInDb() {
        this.movies = movies;
    }
    
     public static void setMoviesInDb(MoviesInDb moviesInDb){
        currentMoviesInDb = moviesInDb;
    }

    public static MoviesInDb getCurrentMoviesInDb() {
        return currentMoviesInDb;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }
    
    
    
    
    
    
    
    
    
    
}

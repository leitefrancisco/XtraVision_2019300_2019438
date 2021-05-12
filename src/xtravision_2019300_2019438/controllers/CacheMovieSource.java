/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.controllers;

import java.util.ArrayList;
import xtravision_2019300_2019438.models.Movie;

/**
 *class to store the movies in memory after check the database, it allows the program to run faster because it doesn't need to access the database all the time
 * @author Francisco Leite
 * @author Aline Rabelo
 */

public class CacheMovieSource implements IMovieSource {
    private Movie[] movies;
    //get the movies stored in the cache
    @Override
    public Movie[] getMovies() {
        return movies;
    }
    //refresh the cache , requeries the movie source (database or cache Movies)
    public void refreshCache(IMovieSource movieSource){
        movies = movieSource.getMovies();
    }
    //get the movies with by title
    @Override
     public Movie[] getMoviesByTitle(String title){
        
        ArrayList<Movie> resultMovies = new ArrayList<>();
        
                
        for (int i = 0 ; i<movies.length ; i++){
            
            Movie m = movies[i];
            
            if(m.getTitle().toLowerCase().contains(title.toLowerCase().trim())){
                
                resultMovies.add(m);
            }
        }
        return resultMovies.toArray(new Movie[resultMovies.size()]);
    }
    
    @Override
    public boolean isCached() {
        return true;
    }
    //filter the movies based on the ID
    @Override
    public Movie getMovieById(int id){
        
        for (int i = 0;  i<movies.length ; i++){
            if (movies[i].getId() == id){
                return movies[i];
            }
        }
        return null;
    }
    //filter the movies based on genres
    @Override
    public Movie[] getMoviesByGenre(String selectedGenre) {
        ArrayList<Movie> movies = new ArrayList<>();
        for (int i = 0;  i< this.movies.length ; i++){
            Movie m = this.movies[i];
            if (m.getGenre().equals(selectedGenre)){
                movies.add(m);
            }
        }
        return movies.toArray(new Movie[movies.size()]);
    }
}

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.controllers;

import xtravision_2019300_2019438.models.Movie;
import xtravision_2019300_2019438.views.RentFrame;

/**
 *
 * @author Francisco Leite
 */
public class MovieController{
    
    public Movie[] getMovies(){
        Movie [] movies = new Movie().getMoviesFromDB();
        return movies;
    }
    
    
//    public Movie[] getMoviesbyTitle(){
//        
//        Movie[] movies = new Movie().getMoviesByTitle();
//        
//        return movies;
//        
//    }
    
    
    
    
}

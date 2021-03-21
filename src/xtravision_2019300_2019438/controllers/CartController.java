/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.controllers;

import java.util.ArrayList;
import xtravision_2019300_2019438.models.Cart;
import xtravision_2019300_2019438.models.Movie;

public class CartController{
    
    ArrayList<Movie> movies = new ArrayList<>();
   
    public void addMovie(Movie movie){
        this.movies.add(movie);
    }
    public void removeMovie(Movie movie){
        this.movies.remove(movie);
    }
    
    public Cart getCart(ArrayList<Movie> movies){
        
       return new Cart(this.movies.toArray(new Movie[movies.size()]));
    }
    
    
}

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.models;

import java.util.ArrayList;

/**
 *
 * @author aline
 */
public class Cart {
    
    private static Cart currentCart;
    
    private ArrayList<Movie> movies = new ArrayList<>();
    
    public Cart(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    
    public static void setCart(Cart cart){
        currentCart = cart;
    }
    
    public static Cart getCurrentCart(){
        return currentCart;
    }
    
    public boolean movieAlreadyInCart(Movie movie){
        boolean movieIsThere = false;
        if(movies.size()>0){
            for (int i = 0; i<movies.size(); i++){
                if(movies.get(i).getId()==movie.getId()){
                    movieIsThere = true;
                }
            }
        }
        return movieIsThere;
    }
    
    public boolean addMovie(Movie movie){
        if(!movieAlreadyInCart(movie)&& movies.size()<4 ){  //&& movie.avlAmt()>0
            this.movies.add(movie);
            return true;
        }
        else{
            return false;
        }
    }
    public void removeMovie(Movie movie){
        movies.remove(movie);
    }
    public void clearCart(){
        movies.removeAll(movies);
    }
    public Movie[] getCartMovies(){
        return movies.toArray(new Movie[movies.size()]);
    }
    
    
    
    
}

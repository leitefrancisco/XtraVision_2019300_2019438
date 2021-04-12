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
 * @author Francisco Leite 
 */
public class Cart {
    //This cart is initialized at the beggining of the program, as there will be only one user at a time, the cart will remain the same
    private static Cart currentCart;
    
    
    private ArrayList<Movie> movies = new ArrayList<>();
    /*Constructor for the cart needs an array list of movies, it will Cart is basicaly a flexible array of movies where we
    *can add and remove movies as we need
    */
    public Cart(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    //setter for the static cart
    public static void setCart(Cart cart){
        currentCart = cart;
    }
    //getter to get the cart and then get the movies inside it
    public static Cart getCurrentCart(){
        return currentCart;
    }
    
    //check if a movie is in the cart
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
    //add a movie into the cart if the movie is not there
    public boolean addMovie(Movie movie){
        if(!movieAlreadyInCart(movie)&& movies.size()<4 ){ 
            this.movies.add(movie);
            return true;
        }
        else{
            return false;
        }
    }
    //remove a movie from the array list
    public void removeMovie(Movie movie){
        movies.remove(movie);
    }
    //clear the cart 
    public void clearCart(){
        movies.removeAll(movies);
    }
    //get the movies that exist in the cart
    public Movie[] getCartMovies(){
        return movies.toArray(new Movie[movies.size()]);
    }
    
    
    
    
}

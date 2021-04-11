/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision_2019300_2019438.controllers;

import xtravision_2019300_2019438.models.Movie;

/**
 *
 * @author Francisco Leite
 */
public interface IMovieSource {
    boolean isCached();
    Movie[] getMovies();
    Movie[] getMoviesByTitle(String title);
    Movie getMovieById(int id);
    Movie[] getMoviesByGenre(String selectedGenre);
}

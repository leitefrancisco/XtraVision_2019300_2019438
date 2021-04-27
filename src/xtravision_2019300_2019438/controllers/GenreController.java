/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.controllers;

import java.sql.SQLException;

/**
 *
 * @author Francisco Leite
 */
public class GenreController extends BaseController {
    
    //Get all the genres in the Db to be used in the genre filter in the RentFrame
    public String[] getGenres() throws SQLException{
        return getColumnValues( "genre", "Select Genre");
    }
    //to be used by the base controller methods
    @Override
    protected String GetTableName() {
        return "xtra_genre";
    }
}

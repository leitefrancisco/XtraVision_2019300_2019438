/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.models;

/**
 *
 * @author Francisco Leite
 */
public class Genre {
    // as the genre is a separate table in the data base this class was needed to get the genders from db and make them available in the genre filter in RentFrame
    private String name;
    private int id;
    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
        
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
    
    
    
    
    
}

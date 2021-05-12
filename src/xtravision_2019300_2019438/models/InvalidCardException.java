/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.models;

/**
 * exceptions for the card validation
 * @author Francisco Leite
 * @author Aline Rabelo
 */

//class to have an exception from the card validation
public class InvalidCardException extends Exception {
    
    
    public InvalidCardException(String msg){
        super(msg);
    }
   
    
}

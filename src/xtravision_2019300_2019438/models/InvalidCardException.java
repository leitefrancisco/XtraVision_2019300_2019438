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
public class InvalidCardException extends Exception {
    
    private String msg;
    public InvalidCardException(String msg){
        super(msg);
        this.msg = msg;
    }
    public String getMessage(){
        return msg;
    }
    
}

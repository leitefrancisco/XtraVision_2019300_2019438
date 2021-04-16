/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.controllers;

import java.sql.SQLException;
import java.text.ParseException;
import xtravision_2019300_2019438.models.Order;
import xtravision_2019300_2019438.models.OrderLine;

/**
 *
 * @author Francisco Leite
 */
public class OrderController extends BaseController {
    
    
    
    public int createOrderinDb(Order order) throws ParseException, SQLException{
        String query = "INSERT into xtra_order (id_card, date)\n" +
                "values (" +order.getCreditCardID()+ ", '"+ convertDateTimeToString(order.getDate()) +"'); ";
        
        int orderId = executeInsert(query);
        
        
        for(OrderLine line : order.getOrderLines()){
            String deductMovie = "UPDATE xtra_movie set amount = amount-1 where id = " +line.getMovieId() +";";
            String queryOrderLine = "INSERT into xtra_order_line (order_id,movie_id)\n" +
                    "values (" +orderId+ ", "+ line.getMovieId()+"); ";
            
            executeInsert(queryOrderLine);
            executeUpdate(deductMovie);
        }
          
        
      return orderId;  
    }

    @Override
    protected String GetTableName() {
       return "xtra_order";
    }
}

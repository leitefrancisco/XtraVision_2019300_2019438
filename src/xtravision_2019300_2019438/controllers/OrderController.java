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
 *class to control the requests to the database related to orders
 * @author Francisco Leite
 * @author Aline Rabelo
 */

public class OrderController extends BaseController {
    //create an order in the database
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
    //creates in the data base an row with the the email that required the receipt and the order, 
    //in this case it won't be used but if it was oging to be used we would just need to join the orderlines from the order id and add the total of the order
    public void createReceipt(String email, int orderId ) throws SQLException{
        String query = "INSERT into xtra_receipt (email, order_id)\n"
                + "values ('" + email + "', "+ orderId + "); " ;
        
        executeInsert(query);
    }
    //validate the email from the view
    public void checkEmail(String email) throws Exception{
        if(!email.trim().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")){
            throw new Exception ("Not a valid email");
        }
    }
    //to be used in the base controller's methods
    @Override
    protected String GetTableName() {
       return "xtra_order";
    }
    //when returning check if the order number is a valid one ( order is in the system)
    public boolean checkOrderExists(int orderId) throws SQLException {
        return exists("id =  " +String.valueOf(orderId));
    }

    public void refreshOrderStatusInDb(int orderId) throws SQLException {
        String query = "update xtra_order_line l join xtra_order o on l.order_id = o.id set status = 2 where o.id = "+orderId+" and DATEDIFF(CURDATE(), o.date) > 15 and status = 0;";
        executeUpdate(query);
        
    }
}

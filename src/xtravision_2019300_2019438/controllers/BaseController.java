/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package xtravision_2019300_2019438.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import xtravision_2019300_2019438.database.Database;

/**
 *Class to controll the queries, insertions and updates in the database where there is a pattern that can be used multiple times
 * @author Francisco Leite
 * @author Aline Rabelo
 */

public abstract class BaseController {
    //returns the name of the table to be used in the query ( each controller has the method that returns the most used table)
    protected abstract String GetTableName();
    //converts the date into string to be written in the database
    protected String convertDateTimeToString(Date datetime)throws ParseException{
        
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return format.format(datetime);
    }
    //executes insertions in the database and returns the last id inserted if the boolean in the execute method is true
    public int executeInsert(String query) throws SQLException{
        Database db = new Database();
        int id = db.execute(query, true);
        db.close();
        return id;
    }
    //execute updates in the database
    public void executeUpdate(String query) throws SQLException{
        Database db = new Database();
        db.execute(query);
        db.close();
    }
    //check if determined filter exists in the database
    public boolean exists(String filter) throws SQLException{
        boolean exists = false;
        String query = "select count(*) from " + GetTableName() + " where " + filter;
        Database db = new Database();
        ResultSet rs = db.executeQuery(query);
        
        if(rs.next())
        {
            exists = rs.getInt(1)>0;
        }
        db.close();
        return exists ;
    }
    //get the values in one column in the database
    public String[] getColumnValues(String column) throws SQLException{
        return getColumnValues(column, "");
        
    }
    //returns an object from a column in the database, returns an object so it can be used for multiple types of values.
    public Object getColumnValue(String column, String filter) throws SQLException{
        String query = "select " + column + " from " + GetTableName() + " where " + filter;
        Database db = new Database();
        db.executeQuery(query);
        ResultSet rs = db.executeQuery(query);
        Object value=null;
        if(rs.next())
        {
            value = rs.getObject(column);
        }
        db.close();
        return value;
    }
    //return an id from a item in the database, requires the name of the table in the filter
    public int getIdValue(String filter) throws SQLException{
        return (int) getColumnValue("id", filter);
    }
    //return values from a column, the difference is that the first value can be something else, for example, the first item 
    // in the rent frame genre filter is "select genre".
    public String[] getColumnValues(String column, String emptyValue) throws SQLException{
        String query = "select " + column + " from  "+ GetTableName() +";";
        Database db = new Database();
        ResultSet rs = db.executeQuery(query);
        ArrayList<String> values = new ArrayList<>();
        if(!emptyValue.isEmpty()){
            values.add(emptyValue);
        }
        
        while(rs.next())
        {
            values.add(rs.getString(1));
        }
        db.close();
        return values.toArray(new String[values.size()]);
    }
}

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
import xtravision_2019300_2019438.models.Movie;

/**
 *
 * @author Francisco Leite
 */
public abstract class BaseController {
    
    protected abstract String GetTableName();
    
    protected String convertDateTimeToString(Date datetime)throws ParseException{
        
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return format.format(datetime);
    }
    
    public int executeInsert(String query) throws SQLException{
        Database db = new Database();
        int id = db.execute(query, true);
        db.close();
        return id;
    }
    
    public void executeUpdate(String query) throws SQLException{
        Database db = new Database();
        db.execute(query);
        db.close();
    }
    
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
    
    public String[] getColumnValues(String column) throws SQLException{
        return getColumnValues(column, "");
        
    }
    
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
    
    public int getIdValue(String filter) throws SQLException{
        return (int) getColumnValue("id", filter);
    }
    
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
    
//    public Movie[] getMovies(String query) throws SQLException{
//        ArrayList<Movie> movies = new ArrayList<>();
//        Database db = new Database();
//        ResultSet rs = db.executeQuery(query);
//        while(rs.next())
//            {
//                //int amt = rs.getInt()
//                Movie movie = new Movie(rs.getInt(1),rs.getString(3),rs.getString(2),rs.getString(5),rs.getInt(4), rs.getString(6),rs.getBytes(7), rs.getInt(8));
//                movies.add(movie);
//            }
//            db.close();
//            return movies.toArray(new Movie[movies.size()]);
//    }
}

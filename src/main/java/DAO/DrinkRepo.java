package DAO;

import Model.Drinks;
import Util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DrinkRepo {
    Connection conn;
    public DrinkRepo(){
        conn = ConnectionUtil.getConnection();
    }
    public List<Drinks> getAllDrinks(){
        List<Drinks> allDrinks = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * From drinks");
            while(rs.next()){
                Drinks loadedDrink = new Drinks(rs.getString("drinkName"), rs.getInt("recipeID"));
                allDrinks.add(loadedDrink);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return allDrinks;
    }
    public List<Drinks> getAllCafeDrinks(){
        return null;
    }
    public List<Drinks> getAllAlcoholicBeverages(){
        return null;
    }
    public List<Drinks> getAllSmoothies(){
        return null;
    }
    public List<Drinks> getAllTeas(){
        return null;
    }
    public void addDrink(Drinks d){
        try{
            PreparedStatement statement = conn.prepareStatement("insert into Drinks(drinkName, category) " + "values (?, ?)");
            statement.setString(1, d.getDrinkName());
            statement.setInt(2, d.getRecipeID());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public Drinks getDrinkByName(String drinkName){
        try{
            PreparedStatement statement = conn.prepareStatement("select * from Painting where title = ?");
            statement.setString(1, drinkName);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Drinks d = new Drinks(rs.getString("drinkName"), rs.getInt("recipeID"));
                return d;
            }
        }catch(SQLException e){

        }
        return null;
    }

}

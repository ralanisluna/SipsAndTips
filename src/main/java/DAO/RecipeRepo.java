package DAO;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecipeRepo {
    Connection conn;
    public RecipeRepo() throws SQLException {
        conn = ConnectionUtil.getConnection();
    }

    //Get all the recipes of a certain drink utilizing the foreign key
    public int getRecipeIdFromName(String name){
        int id = -1;
        try{
            PreparedStatement statement = conn.prepareStatement("Select * from Recipe where name = ?");
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return id;
    }
}

package Service;

import DAO.RecipeRepo;

import java.sql.SQLException;

public class RecipeService {
    RecipeRepo rr;
    public RecipeService() throws SQLException {
        rr = new RecipeRepo();
    }
    public RecipeService(RecipeRepo rr){
        this.rr = rr;
    }
    public int getRecipeIDFromName(String name){
        return rr.getRecipeIdFromName(name);
    }
}

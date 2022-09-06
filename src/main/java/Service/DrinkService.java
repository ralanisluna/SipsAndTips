package Service;

import DAO.DrinkRepo;
import Model.Drinks;

import java.util.List;

public class DrinkService {
    DrinkRepo dr;
    //initialize dr
    public DrinkService(){
        dr = new DrinkRepo();
    }
    public List<Drinks> getAllDrinks(){
        return dr.getAllDrinks();
    }
    public List<Drinks> getAllCafeDrinks(){
        return dr.getAllCafeDrinks();
    }
    public List<Drinks> getAllAlcoholicBeverages(){
        return dr.getAllAlcoholicBeverages();
    }
    public List<Drinks> getAllSmoothies(){
        return dr.getAllSmoothies();
    }
    public List<Drinks> getAllTeas(){
        return dr.getAllTeas();
    }
    public void addDrink(String drinkName){

    }
}

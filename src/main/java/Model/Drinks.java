package Model;

public class Drinks {
    public String drinkName;
    public int recipeID;

    public Drinks(String drinkName, int recipeID) {
        this.drinkName = drinkName;
        this.recipeID = recipeID;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkName='" + drinkName + '\'' +
                ", recipeID=" + recipeID +
                '}';
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrink_name(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }
}

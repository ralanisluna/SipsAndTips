package Model;

public class Recipe {
    public int recipeID;
    public String ingredient; //substance
    public int quantity; //portions of the substance
    public String measurement; //measuring unit

    public Recipe(int recipeID, String ingredient, int quantity, String measurement){
        this.recipeID = recipeID;
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.measurement = measurement;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeID=" + recipeID +
                ", ingredient='" + ingredient + '\'' +
                ", quantity=" + quantity +
                ", measurement='" + measurement + '\'' +
                '}';
    }
}

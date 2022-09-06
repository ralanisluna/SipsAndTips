import Service.DrinkService;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.util.Scanner;

public class DrinksCategoryMenu {
    public static void main(String[] args){
        //Connection conn = ConnectionUtil.getConnection();
        DrinkService ds = new DrinkService();
        boolean visitingDrinksCategoryMenu = true;
        while(visitingDrinksCategoryMenu){
            System.out.println("Hello Welcome to Sips & Tips!");
            System.out.println("Select an option: \nAll Drinks \nCafe \nAlcoholic Beverages \nSmoothies \nTeas \nQuit");
            Scanner userInput = new Scanner(System.in);
            String line = userInput.nextLine();
            //quits the program
            while (!(line.equals("Quit"))){
                //routes to the Drinks tab to select the type of drink
                if (line.equals("All Drinks")){
                    System.out.println(ds.getAllDrinks());
                }
                else if (line.equals("Cafe")){
                    System.out.println("Select a drink: ");
                    System.out.println(ds.getAllCafeDrinks());
                    String name = userInput.nextLine();
                    System.out.println(name);
                }
                else if (line.equals("Alcoholic Beverages")){
                    System.out.println("Select a drink: ");
                    System.out.println(ds.getAllAlcoholicBeverages());
                    String name = userInput.nextLine();
                    System.out.println(name);
                }
                else if (line.equals("Smoothies")){
                    System.out.println("Select a drink: ");
                    System.out.println(ds.getAllSmoothies());
                    String name = userInput.nextLine();
                    System.out.println(name);
                }
                else if (line.equals("Teas")){
                    System.out.println("Select a drink: ");
                    System.out.println(ds.getAllTeas());
                    String name = userInput.nextLine();
                    System.out.println(name);
                }
                //User must select a given response
                else {
                    System.out.println("Incorrect input, please select one of the categories above:");
                    line = userInput.nextLine();
                }
            }
            System.out.println("Thank you for visiting, enjoy your drink(s)!");
            visitingDrinksCategoryMenu = false;
           }
        }
    }



import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        boolean validFile = false;

        while (!validFile) {
            System.out.print("File to read: ");
            String file = scanner.nextLine();
             
            try {
                recipes = readRecipesFromFile(file);
                validFile = true;
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Commands: "
                + "\n" + "list -list the recipes"
                + "\n" + "stop - stop the program"
                + "\n" + "find name - searches recipes by name"
                + "\n" + "find cooking time - searches recipes by cooking time"
                + "\n" + "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("Enter command: ");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("list")) {
                listRecipes(recipes);
            } else if (input.equalsIgnoreCase("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                searchRecipeName(recipes, word);
            } else if (input.equalsIgnoreCase("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                searchRecipeCookingTime(recipes, time);
            } else if (input.equalsIgnoreCase("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                searchRecipeIngredient(recipes, ingredient);
            } else if (input.equalsIgnoreCase("stop")) {
                System.exit(0);
            }
        }

    }

    public static ArrayList<Recipe> readRecipesFromFile(String file) throws IOException {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String name;
                int cookingTime;
                ArrayList<String> ingredients = new ArrayList<>();

                try {
                    name = scanner.nextLine();
                    cookingTime = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException | NoSuchElementException e) {
                    throw new IOException("Invalid format: Recipe name or cooking time not found.");
                }

                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipes.add(recipe);
            }

        } catch (IOException e) {
            throw new IOException("Error reading the file: " + e.getMessage());
        }

        return recipes;
    }

    public static void listRecipes(ArrayList<Recipe> recipes) {
        System.out.println("\nRecipes: ");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public static void searchRecipeName(ArrayList<Recipe> recipes, String word) {
        boolean foundRecipes = false;
        
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(word)) {
                foundRecipes = true;
                break;
            }
        }
        
        if (foundRecipes) {
            System.out.println("Recipes: ");
            for (Recipe recipe : recipes) {
                if (recipe.getName().contains(word)) {
                    System.out.println(recipe);
                }
            }
        }
    }
    
    public static void searchRecipeCookingTime(ArrayList<Recipe> recipes, int time) {
        boolean foundRecipes = false;
        
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= time) {
                foundRecipes = true;
                break;
            }
        }
        
        if (foundRecipes) {
            System.out.println("Recipes: ");
            for (Recipe recipe : recipes) {
                if (recipe.getTime() <= time) {
                    System.out.println(recipe);
                }
            }
        }
    }
    
    public static void searchRecipeIngredient(ArrayList<Recipe> recipes, String ingredient) {
        boolean foundRecipes = false;
        
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                foundRecipes = true;
                break;
            }
        }
        
        if (foundRecipes) {
            System.out.println("Recipes:");
            for (Recipe recipe : recipes) {
                if (recipe.getIngredients().contains(ingredient)) {
                    System.out.println(recipe);
                }
            }
        }
    }
}

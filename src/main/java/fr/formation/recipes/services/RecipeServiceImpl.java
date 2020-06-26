package fr.formation.recipes.services;

import fr.formation.recipes.dtos.RecipeDto;
import fr.formation.recipes.entities.Recipe;
import fr.formation.recipes.repositories.RecipeRepository;

public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public void create(RecipeDto recipeDto){
        Recipe recipe = new Recipe();
        populateAndSave(recipeDto,recipe);
    }

    private void populateAndSave(RecipeDto recipeDto, Recipe recipe) {
        recipe.setRecipeName(recipeDto.getRecipeName());
        recipe.setPrepartingTimeMinutes(recipeDto.getPrepartingTimeMinutes());
        recipe.setCookintTimeMinutes(recipeDto.getCookintTimeMinutes());
        recipe.setServings(recipeDto.getServings());
        recipe.setDishImageUrl(recipeDto.getDishImageUrl());
        recipe.setDifficulty(recipeDto.getDifficulty());
        recipeRepository.save(recipe);
    }
}

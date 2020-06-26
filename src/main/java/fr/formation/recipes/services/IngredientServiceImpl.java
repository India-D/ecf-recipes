package fr.formation.recipes.services;

import fr.formation.recipes.dtos.IngredientDto;
import fr.formation.recipes.entities.Ingredient;
import fr.formation.recipes.repositories.IngredientRepository;

public class IngredientServiceImpl implements IngredientService {
    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public void create(IngredientDto ingredientDto){
        Ingredient ingredient = new Ingredient();
        populateAndSave(ingredientDto,ingredient);
    }

    private void populateAndSave(IngredientDto dto,Ingredient ingredient){
        ingredient.setText(dto.getText());
        ingredientRepository.save(ingredient);
    }
}

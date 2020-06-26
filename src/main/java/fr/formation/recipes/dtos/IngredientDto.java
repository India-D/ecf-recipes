package fr.formation.recipes.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class IngredientDto {
    @NotNull
    private Long recipeId;

    @NotBlank
    @Size(min=50, max=255)
    private String ingredientWording;

    public IngredientDto() {
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public String getIngredientWording() {
        return ingredientWording;
    }

    public void setIngredientWording(String ingredientWording) {
        this.ingredientWording = ingredientWording;
    }
}

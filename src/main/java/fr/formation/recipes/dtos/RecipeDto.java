package fr.formation.recipes.dtos;

import fr.formation.recipes.entities.Difficulty;

import javax.validation.constraints.*;

public class RecipeDto {
    @NotBlank
    @Size(min=3, max = 100)
    private String recipeName;

    @NotNull
    @Min(1)
    @Max(120)
    private int prepartingTimeMinutes;

    @Min(1)
    @Max(240)
    private int cookintTimeMinutes;

    @NotNull
    @Min(1)
    @Max(10)
    private int servings;

    @NotNull
    private Difficulty difficulty;

    @NotBlank
    @Size(min = 7, max = 2500)
    private String dishImageUrl;

    public RecipeDto() {
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getPrepartingTimeMinutes() {
        return prepartingTimeMinutes;
    }

    public void setPrepartingTimeMinutes(int prepartingTimeMinutes) {
        this.prepartingTimeMinutes = prepartingTimeMinutes;
    }

    public int getCookintTimeMinutes() {
        return cookintTimeMinutes;
    }

    public void setCookintTimeMinutes(int cookintTimeMinutes) {
        this.cookintTimeMinutes = cookintTimeMinutes;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getDishImageUrl() {
        return dishImageUrl;
    }

    public void setDishImageUrl(String dishImageUrl) {
        this.dishImageUrl = dishImageUrl;
    }
}

package fr.formation.recipes.entities;

import javax.persistence.*;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recipe")
    private Long id;

    @Column(name = "recipe_name", unique = true, length = 100, nullable = false)
    private String recipeName;

    @Column(name = "preparing_time_minutes", nullable = false)
    private int prepartingTimeMinutes;

    @Column(name = "cooking_time_minutes")
    private int cookintTimeMinutes;

    @Column(name = "servings", nullable = false)
    private int servings;

    @Column(name = "difficulty")
    private Difficulty difficulty;

    @Column(name = "dish_image_url", length = 2500, nullable = false)
    private String dishImageUrl;

    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDishImageUrl() {
        return dishImageUrl;
    }

    public void setDishImageUrl(String dishImageUrl) {
        this.dishImageUrl = dishImageUrl;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}

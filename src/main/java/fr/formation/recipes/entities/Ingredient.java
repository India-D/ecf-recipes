package fr.formation.recipes.entities;

import javax.persistence.*;

@Entity
@Table( name = "ingredients", uniqueConstraints = { @UniqueConstraint( columnNames = { "ingredient_wording", "id_recipe" })})
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingredient")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_recipe", nullable = false, foreignKey = @ForeignKey(name="fk_ingredients_recipes"))
    private Recipe recipe;

    @Column(name = "ingredient_wording", unique = true, length = 255, nullable = false)
    private String ingredientWording;

    public Ingredient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getIngredientWording() {
        return ingredientWording;
    }

    public void setIngredientWording(String ingredientWording) {
        this.ingredientWording = ingredientWording;
    }
}

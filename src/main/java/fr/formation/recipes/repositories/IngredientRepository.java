package fr.formation.recipes.repositories;

import fr.formation.recipes.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository <Ingredient, Long> {
}

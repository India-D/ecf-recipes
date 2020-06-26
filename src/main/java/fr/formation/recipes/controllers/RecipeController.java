package fr.formation.recipes.controllers;

import fr.formation.recipes.dtos.RecipeDto;
import fr.formation.recipes.services.RecipeServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeServiceImpl recipeServiceImpl;

    public RecipeController(RecipeServiceImpl recipeServiceImpl) {
        this.recipeServiceImpl = recipeServiceImpl;
    }

    protected void create(@Valid @RequestBody RecipeDto recipeDto){
        recipeServiceImpl.create(recipeDto);
    }
}

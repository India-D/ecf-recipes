package fr.formation.recipes.controllers;

import fr.formation.recipes.dtos.IngredientDto;
import fr.formation.recipes.services.IngredientServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    private final IngredientServiceImpl ingredientServiceImpl;

    public IngredientController(IngredientServiceImpl ingredientServiceImpl) {
        this.ingredientServiceImpl = ingredientServiceImpl;
    }

    @PostMapping
    protected void create(@Valid @RequestBody IngredientDto ingredientDto){
        ingredientServiceImpl.create(ingredientDto);}
}

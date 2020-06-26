package fr.formation.recipes.controllers;

import fr.formation.recipes.dtos.StepDto;
import fr.formation.recipes.services.StepServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/steps")
public class StepController {
    private final StepServiceImpl stepServiceImpl;


    public StepController(StepServiceImpl stepServiceImpl) {
        this.stepServiceImpl = stepServiceImpl;
    }

    protected void create(@Valid @RequestBody StepDto stepDto){
        stepServiceImpl.create(stepDto);
    }
}

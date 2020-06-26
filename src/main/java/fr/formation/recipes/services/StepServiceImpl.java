package fr.formation.recipes.services;

import fr.formation.recipes.dtos.StepDto;
import fr.formation.recipes.entities.Step;
import fr.formation.recipes.repositories.StepRepository;

public class StepServiceImpl implements StepService {
    private final StepRepository stepRepository;

    public StepServiceImpl(StepRepository stepRepository) {
        this.stepRepository = stepRepository;
    }

    @Override
    public void create(StepDto stepDto) {
        Step step = new Step();
        populateAndSave(stepDto, step);
    }

    private void populateAndSave(StepDto stepDto, Step step) {
        step.setStepOrder(stepDto.getStepOrder());
        step.setStepWording(stepDto.getStepWording());
        stepRepository.save(step);
    }
}

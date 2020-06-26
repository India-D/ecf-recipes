package fr.formation.recipes.dtos;

import javax.validation.constraints.*;

public class StepDto {
    @NotEmpty
    @Size(min=50, max=255)

    @NotNull
    private Long recipeId;

    @NotNull
    @Min(1)
    @Max(20)
    private int stepOrder;

    @NotBlank
    @Size(min = 50, max = 255)
    private String stepWording;

    public StepDto() {
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public int getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(int stepOrder) {
        this.stepOrder = stepOrder;
    }

    public String getStepWording() {
        return stepWording;
    }

    public void setStepWording(String stepWording) {
        this.stepWording = stepWording;
    }
}

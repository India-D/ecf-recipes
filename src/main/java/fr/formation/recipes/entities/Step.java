package fr.formation.recipes.entities;

import javax.persistence.*;

@Entity
@Table( name = "steps", uniqueConstraints = { @UniqueConstraint( columnNames = { "step_order", "id_recipe" })})
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_step")
    private Long id;

    @Column(name = "step_order", unique = true)    private int stepOrder;

    @Column(name = "step_wording", length = 255, nullable = false)
    private String stepWording;

    @ManyToOne
    @JoinColumn(name = "id_recipe", nullable = false, foreignKey = @ForeignKey(name="fk_steps_recipes"))
    private Recipe recipe;

    public Step() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}

package fr.formation.recipes.repositories;

import fr.formation.recipes.entities.Step;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StepRepository extends JpaRepository <Step,Long> {
}

package aplicativo.treino.Gerador.de.treinos.bootstrap;

import aplicativo.treino.Gerador.de.treinos.domain.exercise.HybridExercise;
import aplicativo.treino.Gerador.de.treinos.domain.workout.HybridWorkout;
import aplicativo.treino.Gerador.de.treinos.service.HybridWorkoutService;

import aplicativo.treino.Gerador.de.treinos.domain.exercise.GymExercice;
import aplicativo.treino.Gerador.de.treinos.domain.workout.GymWorkout;
import aplicativo.treino.Gerador.de.treinos.service.GymWorkoutService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorkoutTemplateBootstrap implements CommandLineRunner {

    private final HybridWorkoutService hybridWorkoutService;
    private final GymWorkoutService gymWorkoutService;

    public WorkoutTemplateBootstrap(HybridWorkoutService hybridWorkoutService,GymWorkoutService gymWorkoutService){
        this.hybridWorkoutService=hybridWorkoutService;
        this.gymWorkoutService = gymWorkoutService;
    }
    @Override
    public void run(String... args) throws Exception {
        loadGymWorkouts();
        loadHybridWorkouts();
    }

    private void loadHybridWorkouts() {
    }


      private void loadGymWorkouts() {
    }
}

package aplicativo.treino.Gerador.de.treinos.repository;
import aplicativo.treino.Gerador.de.treinos.domain.workout.GymWorkout;

import java.util.List;

public interface GymWorkoutRepository {
    void save(GymWorkout gymWorkout);
    List<GymWorkout> list();

}

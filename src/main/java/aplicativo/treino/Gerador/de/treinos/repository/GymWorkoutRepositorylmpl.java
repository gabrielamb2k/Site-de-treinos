package aplicativo.treino.Gerador.de.treinos.repository;

import aplicativo.treino.Gerador.de.treinos.domain.workout.GymWorkout;
import aplicativo.treino.Gerador.de.treinos.repository.GymWorkoutRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GymWorkoutRepositorylmpl implements GymWorkoutRepository {

    private static final List<GymWorkout> gymWorkouts=new ArrayList<>();

    @Override
    public void save(GymWorkout gymWorkout){
        gymWorkouts.add(gymWorkout);
    }

    @Override
    public List<GymWorkout> list() {
        return gymWorkouts;
    }
}

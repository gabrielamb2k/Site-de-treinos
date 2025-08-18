import aplicativo.treino.Gerador.de.treinos.domain.workout.GymWorkout;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GymWorkoutRepositorylmpl implements GymWorkoutRepository{

    private static final List<GymWorkout> gymWorkouts=new ArrayList<>();

    @Override
    public void save(GymWorkout gymWorkout){
        gymWorkout.add(gymWorkout);
    }

    @Override
    public List<GymWorkout> list() {
        return gymWorkouts;
    }
}

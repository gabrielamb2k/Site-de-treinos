package aplicativo.treino.Gerador.de.treinos.repository;

import aplicativo.treino.Gerador.de.treinos.domain.workout.HybridWorkout;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementacao em classe da {@link HybridWorkoutRepository}
 * @version 1.0
 */
@Repository
public class HybridWorkoutRepositoryImpl implements HybridWorkoutRepository{

    private static final List<HybridWorkout> hybridWorkouts=new ArrayList<>();

    @Override
    public void save(HybridWorkout hybridWorkout){
        hybridWorkouts.add(hybridWorkout);
    }

    @Override
    public List<HybridWorkout> list() {
        return hybridWorkouts;
    }
}

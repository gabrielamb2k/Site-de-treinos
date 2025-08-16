package aplicativo.treino.Gerador.de.treinos.repository;

import aplicativo.treino.Gerador.de.treinos.domain.workout.HybridWorkout;

import java.util.List;

/**
 * Classe que define as operacoes que vamos fazer
 * para {@link HybridWorkout}
 * @version 1.0
 */
public interface HybridWorkoutRepository {

    void save(HybridWorkout hybridWorkout);
    List<HybridWorkout> list();
}

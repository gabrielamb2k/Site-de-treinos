package aplicativo.treino.Gerador.de.treinos.service;

import aplicativo.treino.Gerador.de.treinos.domain.workout.HybridWorkout;
import aplicativo.treino.Gerador.de.treinos.repository.HybridWorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Classe de serviço da {@link HybridWorkout}
 * @version 1.0
 */
@Service
public class HybridWorkoutService {

    private HybridWorkoutRepository hybridWorkoutRepository;

    public HybridWorkoutService(HybridWorkoutRepository hybridWorkoutRepository){
        this.hybridWorkoutRepository=hybridWorkoutRepository;
    }

    public void save(HybridWorkout hybridWorkout){
        hybridWorkoutRepository.save(hybridWorkout);
    }

    public List<HybridWorkout> hybridWorkoutList(){
        return hybridWorkoutRepository.list();
    }

}

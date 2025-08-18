package aplicativo.treino.Gerador.de.treinos.service;

import aplicativo.treino.Gerador.de.treinos.domain.workout.GymWorkout;
import aplicativo.treino.Gerador.de.treinos.repository.GymWorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymWorkoutService {

    private GymWorkoutRepository gymWorkoutRepository;

    public GymWorkoutService(GymWorkoutRepository gymWorkoutRepository){
        this.gymWorkoutRepository=gymWorkoutRepository;
    }

    public void save(GymWorkout gymWorkout){
        gymWorkoutRepository.save(gymWorkout);
    }

    public List<GymWorkout> gymWorkoutList(){
        return gymWorkoutRepository.list();
    }

}


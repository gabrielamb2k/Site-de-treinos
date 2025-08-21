package aplicativo.treino.Gerador.de.treinos.generator;

import aplicativo.treino.Gerador.de.treinos.domain.workout.HybridWorkout;
import aplicativo.treino.Gerador.de.treinos.domain.workout.Workout;
import aplicativo.treino.Gerador.de.treinos.dto.WorkoutDto;
import aplicativo.treino.Gerador.de.treinos.service.GymWorkoutService;
import aplicativo.treino.Gerador.de.treinos.service.HybridWorkoutService;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Classe que vai pegar a persistencia de dados dos treinos ja instanciados
 * e vai pegar as informacoes do usuario e retornar um treino
 * pela especificacoes do usuario
 * @version 1.0
 */
@Component
public class WorkoutGenerator {

    private HybridWorkoutService hybridWorkoutService;

    public WorkoutGenerator(HybridWorkoutService hybridWorkoutService) {
        this.hybridWorkoutService = hybridWorkoutService;
    }

    /**
     * Classe que vai pegar um treino que estao guardados na memoria das nossa service
     * Nesse metodo vamos pegar um treino hibrido
     * Pra começar, pega apenas um treino full body hibrido
     * @param informacoes, sao as informaceos que o usuario passou no formulario
     * @return retorna um treino com as informacoes que ele passou
     * @version 1.0
     */
    public Workout generate(WorkoutDto informacoes) {

        // Pega um treino hibrido e full body
        if(informacoes.getTipoDeTreino().equalsIgnoreCase("hibrido")){

            // busca no bootstrapTemplate um treino com as informacoes do user
            Optional<HybridWorkout> workoutOptional = hybridWorkoutService.hybridWorkoutList().stream()
                    .filter(w -> informacoes.getDivisaoDeTreino().equalsIgnoreCase(w.getDiv()))
                    .filter(w -> informacoes.getDuracaoDoTreino().equalsIgnoreCase(String.valueOf(w.getDuracao())))
                    .findFirst();

            return workoutOptional.orElse(null);
        }


        return null;
    }
}

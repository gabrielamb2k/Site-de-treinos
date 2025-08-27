package aplicativo.treino.Gerador.de.treinos.generator;

import aplicativo.treino.Gerador.de.treinos.domain.user.User;
import aplicativo.treino.Gerador.de.treinos.domain.workout.HybridWorkout;
import aplicativo.treino.Gerador.de.treinos.domain.workout.Workout;
import aplicativo.treino.Gerador.de.treinos.dto.WorkoutDto;
import aplicativo.treino.Gerador.de.treinos.service.GymWorkoutService;
import aplicativo.treino.Gerador.de.treinos.service.HybridWorkoutService;
import aplicativo.treino.Gerador.de.treinos.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Classe que vai pegar a persistencia de dados dos treinos ja instanciados
 * e vai pegar as informacoes do usuario e retornar um treino
 * pela especificacoes do usuario
 * @version 1.1
 */
@Component
public class WorkoutGenerator {

    private HybridWorkoutService hybridWorkoutService;
    private GymWorkoutService gymWorkoutService;
    private UserService userService;

    public WorkoutGenerator(HybridWorkoutService hybridWorkoutService, GymWorkoutService gymWorkoutService, UserService userService) {
        this.hybridWorkoutService = hybridWorkoutService;
        this.gymWorkoutService = gymWorkoutService;
        this.userService=userService;
    }

    /**
     * Metodo que vai filtrar um treino conforme as necessidades do usuario
     * @param informacoes dados do usuario para gerar o treino
     * @param user usado para salvarmos o treino gerado pelo usuario
     * @return retorna o treino gerado
     */
    public List<Workout> generate(WorkoutDto informacoes, User user) {

        // Pega um treino hibrido e o salva para o usuario da sessao
        if (informacoes.getTipoDeTreino().equalsIgnoreCase("hibrido")) {

            List<Workout> hybridWorkoutList =hybridWorkoutService.hybridWorkoutList().stream()
                    .filter(w -> informacoes.getDivisaoDeTreino().equalsIgnoreCase(w.getDiv()))
                    .filter(w -> informacoes.getDuracaoDoTreino().equalsIgnoreCase(String.valueOf(w.getDuracao())))
                    .collect(Collectors.toList());
            // busca no bootstrapTemplate um treino com as informacoes do user
            userService.saveWorkoutToUser(hybridWorkoutList, user);
            return hybridWorkoutList;

        }
        //Pega um treino somente academia e salva para o usuario da sessao
        if ("academia".equalsIgnoreCase(informacoes.getTipoDeTreino())) {
            List<Workout> workoutList =gymWorkoutService.gymWorkoutList().stream()
                    .filter(w -> informacoes.getDivisaoDeTreino().equalsIgnoreCase(w.getDiv()))
                    .filter(w -> informacoes.getDuracaoDoTreino().equalsIgnoreCase(String.valueOf(w.getDuracao())))
                    .collect(Collectors.toList());

            userService.saveWorkoutToUser(workoutList,user);
            return workoutList;
        }
        return null;
    }
}

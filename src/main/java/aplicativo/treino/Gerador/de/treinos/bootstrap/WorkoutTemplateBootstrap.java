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
        System.out.println("Carregando templates de treinos híbridos...");

        // --- Template de Treino 1: Hipertrofia com Resistência ---
        List<HybridExercise> exercisesHipertrofia = new ArrayList<>();
        exercisesHipertrofia.add(new HybridExercise("Agachamento Livre", 12, 4, "Foco na execução lenta e controlada", "Aquecimento: 5 min de corrida leve"));
        exercisesHipertrofia.add(new HybridExercise("Supino Reto", 12, 4, "Pegada um pouco mais aberta que a largura dos ombros", "N/A"));
        exercisesHipertrofia.add(new HybridExercise("Remada Curvada", 12, 4, "Manter a coluna ereta durante todo o movimento", "N/A"));
        exercisesHipertrofia.add(new HybridExercise("Desenvolvimento Militar", 15, 3, "Executar em pé para maior ativação do core", "N/A"));
        exercisesHipertrofia.add(new HybridExercise("Prancha Abdominal", 60, 3, "Segurar por 60 segundos", "Finalizador: 10 min de corrida moderada"));

        HybridWorkout treinoHipertrofia = new HybridWorkout(
                "Full Body",
                60,
                exercisesHipertrofia,
                "Hipertrofia e Resistência"
        );

        // --- Template de Treino 2: Condicionamento Metabólico ---
        List<HybridExercise> exercisesCondicionamento = new ArrayList<>();
        exercisesCondicionamento.add(new HybridExercise("Levantamento Terra", 8, 5, "Técnica é prioridade. Use carga moderada.", "Aquecimento: 5 min de polichinelos e agachamentos sem peso"));
        exercisesCondicionamento.add(new HybridExercise("Flexão de Braço", 20, 4, "Máximo de repetições se conseguir mais de 20", "N/A"));
        exercisesCondicionamento.add(new HybridExercise("Afundo com Halteres", 15, 3, "15 repetições para cada perna", "N/A"));
        exercisesCondicionamento.add(new HybridExercise("Puxada na Barra (Pull-up)", 10, 4, "Use elástico de ajuda se necessário", "N/A"));
        exercisesCondicionamento.add(new HybridExercise("Burpees", 15, 3, "Execução rápida e explosiva", "Finalizador: 10 min de HIIT na esteira (1 min intenso / 1 min leve)"));

        HybridWorkout treinoCondicionamento = new HybridWorkout(
                "Full Body",
                50,
                exercisesCondicionamento,
                "Condicionamento Metabólico"
        );

        // Salvando os treinos no repositório em memória
        hybridWorkoutService.save(treinoHipertrofia);
        hybridWorkoutService.save(treinoCondicionamento);

        System.out.println(hybridWorkoutService.hybridWorkoutList().size() + " templates de treinos híbridos carregados.");

        // --- Carregando templates de treinos não híbridos ---
        System.out.println("Carregando templates de treinos não híbridos...");

         // --- Template de Treino 1: Hipertrofia ---
        List<GymExercice> exercisesHipertrofia = new ArrayList<>();
        exercisesHipertrofia.add(new GymExercice("Supino Reto", 15, 3, "Somente com a barra", true));
        exercisesHipertrofia.add(new GymExercice("Agachamento Livre", 12, 4, "Foco na execução lenta e controlada", false));
        exercisesHipertrofia.add(new GymExercice("Supino Reto", 12, 4, "Pegada um pouco mais aberta que a largura dos ombros", false));
        exercisesHipertrofia.add(new GymExercice("Remada Curvada", 12, 4, "Manter a coluna ereta durante todo o movimento", false));
        exercisesHipertrofia.add(new GymExercice("Desenvolvimento Militar", 15, 3, "Executar em pé para maior ativação do core", false));
        exercisesHipertrofia.add(new GymExercice("Abdominal infra", 60, 3, "Com as mão no Glúteo", false));

        GymWorkout treinoHipertrofia = new GymWorkout(
                "Full Body",
                60,
                exercisesHipertrofia
        );

        // --- Template de Treino 2: Potencia ---
        List<GymExercice> exercisesPotencia = new ArrayList<>();
        exercisesPotencia.add(new GymExercice("Afundo ", 15, 3, "15 repetições para cada perna, sem peso", true));
        exercisesPotencia.add(new GymExercice("Levantamento Terra", 8, 5, "Carga moderada e velocidade acelerada", false));
        exercisesPotencia.add(new GymExercice("Flexão de Braço", 20, 4, "Flexões saltando", false));
        exercisesPotencia.add(new GymExercice("Afundo com Halteres", 15, 3, "15 repetições para cada perna", false));
        exercisesPotencia.add(new GymExercice("Agachamento Saltando", 10, 4, "Carga Moderada", false));
    

        GymWorkout treinoPotencia = new GymWorkout(
                "Full Body",
                50,
                exercisesPotencia
        );

        // Salvando os treinos no repositório em memória
        gymWorkoutService.save(treinoHipertrofia);
        gymWorkoutService.save(treinoPotencia);

        System.out.println(gymWorkoutService.gymWorkoutList().size() + " templates de treinos não híbridos carregados.");
    }
}

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
        loadGymWorkouts();
        loadHybridWorkouts();
    }

    private void loadHybridWorkouts() {
        System.out.println("--- Carregando templates de treinos HÍBRIDOS ---");

        // --- Divisão: ABC ---
        List<HybridExercise> exercisesAbc45 = new ArrayList<>();
        exercisesAbc45.add(new HybridExercise("Supino Reto", 12, 3, "Foco na contração", "Aquecimento: 5 min esteira"));
        hybridWorkoutService.save(new HybridWorkout("ABC", 45, exercisesAbc45, "Peito, Ombro e Tríceps - Rápido"));

        List<HybridExercise> exercisesAbc60 = new ArrayList<>();
        exercisesAbc60.add(new HybridExercise("Supino Inclinado com Halteres", 12, 4, "Amplitude máxima", "Aquecimento: 5 min de polichinelos"));
        exercisesAbc60.add(new HybridExercise("Desenvolvimento Militar", 10, 4, "Cuidado com a lombar", "N/A"));
        exercisesAbc60.add(new HybridExercise("Tríceps na Polia", 15, 3, "Espremendo o músculo no final", "Finalizador: 15 min de bike"));
        hybridWorkoutService.save(new HybridWorkout("ABC", 60, exercisesAbc60, "Peito, Ombro e Tríceps - Padrão"));

        List<HybridExercise> exercisesAbc90 = new ArrayList<>();
        exercisesAbc90.add(new HybridExercise("Supino Reto com Barra", 8, 5, "Foco em progressão de carga", "Aquecimento: 10 min de elíptico"));
        hybridWorkoutService.save(new HybridWorkout("ABC", 90, exercisesAbc90, "Peito, Ombro e Tríceps - Volumoso"));

        // --- Divisão: ABCD ---
        List<HybridExercise> exercisesAbcd45 = new ArrayList<>();
        exercisesAbcd45.add(new HybridExercise("Agachamento Livre", 15, 3, "Foco na técnica", "Aquecimento: 5 min agachando sem peso"));
        hybridWorkoutService.save(new HybridWorkout("ABCD", 45, exercisesAbcd45, "Quadríceps e Panturrilha - Rápido"));

        List<HybridExercise> exercisesAbcd60 = new ArrayList<>();
        exercisesAbcd60.add(new HybridExercise("Leg Press 45", 12, 4, "Pés na largura dos ombros", "Aquecimento: 5 min de bike"));
        hybridWorkoutService.save(new HybridWorkout("ABCD", 60, exercisesAbcd60, "Quadríceps e Panturrilha - Padrão"));

        List<HybridExercise> exercisesAbcd90 = new ArrayList<>();
        exercisesAbcd90.add(new HybridExercise("Agachamento Hack", 10, 5, "Descida controlada", "Aquecimento: 10 min de escada"));
        hybridWorkoutService.save(new HybridWorkout("ABCD", 90, exercisesAbcd90, "Quadríceps e Panturrilha - Volumoso"));

        // --- Divisão: ABCDE ---
        List<HybridExercise> exercisesAbcde45 = new ArrayList<>();
        exercisesAbcde45.add(new HybridExercise("Remada Curvada", 12, 4, "Puxando com as costas", "Aquecimento: 5 min de remo"));
        hybridWorkoutService.save(new HybridWorkout("ABCDE", 45, exercisesAbcde45, "Costas - Foco em Largura"));

        List<HybridExercise> exercisesAbcde60 = new ArrayList<>();
        exercisesAbcde60.add(new HybridExercise("Puxada Frontal", 12, 4, "Alongar bem as dorsais", "Aquecimento: 5 min de pulos"));
        hybridWorkoutService.save(new HybridWorkout("ABCDE", 60, exercisesAbcde60, "Costas - Foco em Espessura"));

        List<HybridExercise> exercisesAbcde90 = new ArrayList<>();
        exercisesAbcde90.add(new HybridExercise("Levantamento Terra", 5, 5, "Técnica perfeita é obrigatória", "Aquecimento: 10 min de mobilidade"));
        hybridWorkoutService.save(new HybridWorkout("ABCDE", 90, exercisesAbcde90, "Costas - Treino Completo"));

        // --- Divisão: Upper-Lower ---
        List<HybridExercise> exercisesUpperLower45 = new ArrayList<>();
        exercisesUpperLower45.add(new HybridExercise("Supino Reto", 15, 3, "Execução rápida", "Aquecimento: 5 min de polichinelos"));
        hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 45, exercisesUpperLower45, "Superior - Rápido"));

        List<HybridExercise> exercisesUpperLower60 = new ArrayList<>();
        exercisesUpperLower60.add(new HybridExercise("Remada Cavalinho", 12, 4, "Foco na pegada", "Aquecimento: 5 min de remo"));
        hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 60, exercisesUpperLower60, "Superior - Padrão"));

        List<HybridExercise> exercisesUpperLower90 = new ArrayList<>();
        exercisesUpperLower90.add(new HybridExercise("Supino Inclinado", 10, 4, "Carga moderada", "Aquecimento: 10 min de bike"));
        exercisesUpperLower90.add(new HybridExercise("Puxada Frontal", 10, 4, "Pegada aberta", "N/A"));
        exercisesUpperLower90.add(new HybridExercise("Elevação Lateral", 15, 4, "Pouco peso, muita técnica", "N/A"));
        exercisesUpperLower90.add(new HybridExercise("Rosca Direta", 12, 3, "Sem balançar o corpo", "Finalizador: 20 min de trote"));
        hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 90, exercisesUpperLower90, "Superior - Volumoso"));

        // --- Divisão: Full Body ---
        List<HybridExercise> exercisesFullBody45 = new ArrayList<>();
        exercisesFullBody45.add(new HybridExercise("Agachamento Taça", 15, 3, "Manter o peito aberto", "Aquecimento: 5 min de mobilidade articular"));
        exercisesFullBody45.add(new HybridExercise("Flexão de Braço", 15, 3, "Máximo de repetições", "N/A"));
        exercisesFullBody45.add(new HybridExercise("Prancha", 45, 3, "Segurar por 45 segundos", "Finalizador: 10 min de HIIT"));
        hybridWorkoutService.save(new HybridWorkout("Full-Body", 45, exercisesFullBody45, "Condicionamento Geral"));

        List<HybridExercise> exercisesFullBody60 = new ArrayList<>();
        exercisesFullBody60.add(new HybridExercise("Levantamento Terra", 10, 4, "Foco na técnica", "Aquecimento: 5 min de remo"));
        hybridWorkoutService.save(new HybridWorkout("Full-Body", 60, exercisesFullBody60, "Força e Condicionamento"));

        List<HybridExercise> exercisesFullBody90 = new ArrayList<>();
        exercisesFullBody90.add(new HybridExercise("Agachamento Livre", 8, 5, "Progressão de carga", "Aquecimento: 10 min de bike e mobilidade"));
        hybridWorkoutService.save(new HybridWorkout("Full-Body", 90, exercisesFullBody90, "Hipertrofia Total"));

        System.out.println(hybridWorkoutService.hybridWorkoutList().size() + " templates de treinos HÍBRIDOS carregados.");
    }

    private void loadGymWorkouts() {
        System.out.println("--- Carregando templates de treinos de ACADEMIA ---");
        // --- Template de Treino 1: Hipertrofia ---
        List<GymExercice> exercisesHipertrofia2 = new ArrayList<>();
        exercisesHipertrofia2.add(new GymExercice("Supino Reto", 15, 3, "Somente com a barra", true));
        exercisesHipertrofia2.add(new GymExercice("Agachamento Livre", 12, 4, "Foco na execução lenta e controlada", false));
        exercisesHipertrofia2.add(new GymExercice("Supino Reto", 12, 4, "Pegada um pouco mais aberta que a largura dos ombros", false));
        exercisesHipertrofia2.add(new GymExercice("Remada Curvada", 12, 4, "Manter a coluna ereta durante todo o movimento", false));
        exercisesHipertrofia2.add(new GymExercice("Desenvolvimento Militar", 15, 3, "Executar em pé para maior ativação do core", false));
        exercisesHipertrofia2.add(new GymExercice("Abdominal infra", 60, 3, "Com as mão no Glúteo", false));

        GymWorkout treinoHipertrofia2 = new GymWorkout("Full-Body", 60, exercisesHipertrofia2);

        // --- Template de Treino 2: Potencia ---
        List<GymExercice> exercisesPotencia = new ArrayList<>();
        exercisesPotencia.add(new GymExercice("Afundo ", 15, 3, "15 repetições para cada perna, sem peso", true));
        exercisesPotencia.add(new GymExercice("Levantamento Terra", 8, 5, "Carga moderada e velocidade acelerada", false));
        exercisesPotencia.add(new GymExercice("Flexão de Braço", 20, 4, "Flexões saltando", false));
        exercisesPotencia.add(new GymExercice("Afundo com Halteres", 15, 3, "15 repetições para cada perna", false));
        exercisesPotencia.add(new GymExercice("Agachamento Saltando", 10, 4, "Carga Moderada", false));

        GymWorkout treinoPotencia = new GymWorkout("Full-Body", 50, exercisesPotencia);

        // Salvando os treinos no repositório em memória
        gymWorkoutService.save(treinoHipertrofia2);
        gymWorkoutService.save(treinoPotencia);

        System.out.println(gymWorkoutService.gymWorkoutList().size() + " templates de treinos de ACADEMIA carregados.");
    }
}

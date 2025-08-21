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


        // ===============================
        // DIVISÃO ABC - TREINO A (Peito, Ombro, Tríceps)
        // ===============================

        // ABC - 45 minutos
        List<HybridExercise> exercisesAbc45 = new ArrayList<>();
        exercisesAbc45.add(new HybridExercise("Aquecimento Dinâmico", 5, 1, "Polichinelos + rotação de braços", "5 min contínuos"));
        exercisesAbc45.add(new HybridExercise("Supino Reto", 12, 3, "Cadência 2-0-1-0", "Descanso: 90s"));
        exercisesAbc45.add(new HybridExercise("Desenvolvimento com Halteres", 12, 3, "Amplitude completa", "Descanso: 90s"));
        exercisesAbc45.add(new HybridExercise("Tríceps Paralelas", 10, 3, "Até falha se necessário", "Descanso: 60s"));
        exercisesAbc45.add(new HybridExercise("HIIT Cardio", 15, 1, "30s intenso / 30s moderado", "Finalizador"));
        hybridWorkoutService.save(new HybridWorkout("ABC", 45, exercisesAbc45, "Peito, Ombro e Tríceps - Rápido e Eficiente"));

        // ABC - 60 minutos
        List<HybridExercise> exercisesAbc60 = new ArrayList<>();
        exercisesAbc60.add(new HybridExercise("Aquecimento Progressivo", 8, 1, "5 min bike + 3 min mobilidade articular", "Preparação completa"));
        exercisesAbc60.add(new HybridExercise("Supino Inclinado Halteres", 10, 4, "Foco na parte superior do peito", "Descanso: 2min"));
        exercisesAbc60.add(new HybridExercise("Supino Reto", 12, 4, "Controle excêntrico", "Descanso: 2min"));
        exercisesAbc60.add(new HybridExercise("Desenvolvimento Militar", 10, 4, "Pegada na largura dos ombros", "Descanso: 90s"));
        exercisesAbc60.add(new HybridExercise("Elevação Lateral", 12, 3, "Movimento controlado", "Descanso: 60s"));
        exercisesAbc60.add(new HybridExercise("Tríceps na Polia", 12, 3, "Cotovelos fixos", "Descanso: 60s"));
        exercisesAbc60.add(new HybridExercise("Cardio Moderado", 10, 1, "65-75% FCmax", "Cool down"));
        hybridWorkoutService.save(new HybridWorkout("ABC", 60, exercisesAbc60, "Peito, Ombro e Tríceps - Volume Moderado"));

        // ABC - 90 minutos
        List<HybridExercise> exercisesAbc90 = new ArrayList<>();
        exercisesAbc90.add(new HybridExercise("Aquecimento Completo", 12, 1, "10 min cardio + mobilidade específica", "Preparação total"));
        exercisesAbc90.add(new HybridExercise("Supino Reto", 8, 5, "Progressão de carga", "Descanso: 3min"));
        exercisesAbc90.add(new HybridExercise("Supino Inclinado Halteres", 10, 4, "Amplitude máxima", "Descanso: 2min"));
        exercisesAbc90.add(new HybridExercise("Supino Declinado", 12, 3, "Parte inferior do peito", "Descanso: 2min"));
        exercisesAbc90.add(new HybridExercise("Desenvolvimento Militar", 8, 4, "Força e potência", "Descanso: 2min"));
        exercisesAbc90.add(new HybridExercise("Desenvolvimento Lateral", 10, 4, "Isolamento lateral", "Descanso: 90s"));
        exercisesAbc90.add(new HybridExercise("Elevação Frontal", 12, 3, "Fibras anteriores", "Descanso: 60s"));
        exercisesAbc90.add(new HybridExercise("Tríceps Testa", 10, 4, "Cabeça longa", "Descanso: 90s"));
        exercisesAbc90.add(new HybridExercise("Tríceps Pulley", 12, 3, "Finalização", "Descanso: 60s"));
        exercisesAbc90.add(new HybridExercise("Cardio LISS", 15, 1, "Recuperação ativa", "60-65% FCmax"));
        hybridWorkoutService.save(new HybridWorkout("ABC", 90, exercisesAbc90, "Peito, Ombro e Tríceps - Volume Alto"));

        // ===============================
        // DIVISÃO ABCD - TREINO D (Pernas)
        // ===============================

        // ABCD - 45 minutos
        List<HybridExercise> exercisesAbcd45 = new ArrayList<>();
        exercisesAbcd45.add(new HybridExercise("Aquecimento Pernas", 5, 1, "Agachamento livre + lunges", "Mobilização articular"));
        exercisesAbcd45.add(new HybridExercise("Agachamento Livre", 12, 4, "Profundidade completa", "Descanso: 2min"));
        exercisesAbcd45.add(new HybridExercise("Leg Press 45°", 15, 3, "Pés na largura do quadril", "Descanso: 90s"));
        exercisesAbcd45.add(new HybridExercise("Stiff", 12, 3, "Posterior de coxa", "Descanso: 90s"));
        exercisesAbcd45.add(new HybridExercise("Panturrilha em Pé", 20, 3, "Amplitude completa", "Descanso: 60s"));
        hybridWorkoutService.save(new HybridWorkout("ABCD", 45, exercisesAbcd45, "Quadríceps e Posterior - Eficiente"));

        // ABCD - 60 minutos
        List<HybridExercise> exercisesAbcd60 = new ArrayList<>();
        exercisesAbcd60.add(new HybridExercise("Aquecimento Dinâmico", 8, 1, "5 min bike + mobilidade", "Preparação"));
        exercisesAbcd60.add(new HybridExercise("Agachamento Livre", 10, 4, "Técnica perfeita", "Descanso: 2min"));
        exercisesAbcd60.add(new HybridExercise("Leg Press 45°", 12, 4, "Variação de pés", "Descanso: 2min"));
        exercisesAbcd60.add(new HybridExercise("Afundo", 12, 3, "Cada perna alternadamente", "Descanso: 90s"));
        exercisesAbcd60.add(new HybridExercise("Stiff", 12, 4, "Posterior e glúteo", "Descanso: 90s"));
        exercisesAbcd60.add(new HybridExercise("Mesa Flexora", 12, 3, "Isquiotibiais", "Descanso: 60s"));
        exercisesAbcd60.add(new HybridExercise("Panturrilha", 15, 4, "Em pé + sentado", "Descanso: 60s"));
        exercisesAbcd60.add(new HybridExercise("Alongamento", 5, 1, "Posterior e quadríceps", "Relaxamento"));
        hybridWorkoutService.save(new HybridWorkout("ABCD", 60, exercisesAbcd60, "Pernas Completo - Volume Moderado"));

        // ABCD - 90 minutos
        List<HybridExercise> exercisesAbcd90 = new ArrayList<>();
        exercisesAbcd90.add(new HybridExercise("Aquecimento Completo", 10, 1, "Cardio + mobilidade específica", "Preparação total"));
        exercisesAbcd90.add(new HybridExercise("Agachamento Livre", 8, 5, "Carga progressiva", "Descanso: 3min"));
        exercisesAbcd90.add(new HybridExercise("Leg Press 45°", 10, 4, "Pés alto e baixo", "Descanso: 2min"));
        exercisesAbcd90.add(new HybridExercise("Agachamento Hack", 12, 4, "Controle da descida", "Descanso: 2min"));
        exercisesAbcd90.add(new HybridExercise("Afundo Caminhando", 15, 3, "Cada perna", "Descanso: 90s"));
        exercisesAbcd90.add(new HybridExercise("Stiff", 10, 4, "Carga moderada", "Descanso: 2min"));
        exercisesAbcd90.add(new HybridExercise("Mesa Flexora", 12, 4, "Unilateral", "Descanso: 90s"));
        exercisesAbcd90.add(new HybridExercise("Cadeira Extensora", 15, 3, "Drop set final", "Descanso: 60s"));
        exercisesAbcd90.add(new HybridExercise("Panturrilha em Pé", 20, 4, "3 posições de pé", "Descanso: 60s"));
        exercisesAbcd90.add(new HybridExercise("Panturrilha Sentado", 20, 3, "Sóleo", "Descanso: 60s"));
        hybridWorkoutService.save(new HybridWorkout("ABCD", 90, exercisesAbcd90, "Pernas - Volume Alto e Intensivo"));

        // ===============================
        // DIVISÃO ABCDE - TREINO B (Costas e Bíceps)
        // ===============================

        // ABCDE - 45 minutos
        List<HybridExercise> exercisesAbcde45 = new ArrayList<>();
        exercisesAbcde45.add(new HybridExercise("Aquecimento", 5, 1, "Remo + rotação de ombros", "Ativação"));
        exercisesAbcde45.add(new HybridExercise("Puxada Frontal", 12, 4, "Pegada média", "Descanso: 90s"));
        exercisesAbcde45.add(new HybridExercise("Remada Curvada", 10, 3, "Barra livre", "Descanso: 90s"));
        exercisesAbcde45.add(new HybridExercise("Rosca Direta", 12, 3, "Bíceps", "Descanso: 60s"));
        exercisesAbcde45.add(new HybridExercise("Cardio", 10, 1, "Remo ou elíptico", "Cool down"));
        hybridWorkoutService.save(new HybridWorkout("ABCDE", 45, exercisesAbcde45, "Costas e Bíceps - Foco em Largura"));

        // ABCDE - 60 minutos
        List<HybridExercise> exercisesAbcde60 = new ArrayList<>();
        exercisesAbcde60.add(new HybridExercise("Aquecimento", 8, 1, "5 min cardio + mobilidade", "Preparação"));
        exercisesAbcde60.add(new HybridExercise("Puxada Frontal", 10, 4, "Pegada aberta", "Descanso: 2min"));
        exercisesAbcde60.add(new HybridExercise("Remada Curvada", 10, 4, "Pegada supinada", "Descanso: 2min"));
        exercisesAbcde60.add(new HybridExercise("Remada Cavalinho", 12, 3, "Unilateral", "Descanso: 90s"));
        exercisesAbcde60.add(new HybridExercise("Pullover", 12, 3, "Expansão torácica", "Descanso: 90s"));
        exercisesAbcde60.add(new HybridExercise("Rosca Direta", 12, 3, "Barra reta", "Descanso: 60s"));
        exercisesAbcde60.add(new HybridExercise("Rosca Martelo", 12, 3, "Braquial", "Descanso: 60s"));
        hybridWorkoutService.save(new HybridWorkout("ABCDE", 60, exercisesAbcde60, "Costas e Bíceps - Espessura e Definição"));

        // ABCDE - 90 minutos
        List<HybridExercise> exercisesAbcde90 = new ArrayList<>();
        exercisesAbcde90.add(new HybridExercise("Aquecimento Completo", 10, 1, "Mobilidade específica", "Preparação total"));
        exercisesAbcde90.add(new HybridExercise("Levantamento Terra", 6, 5, "Técnica perfeita", "Descanso: 3min"));
        exercisesAbcde90.add(new HybridExercise("Puxada Frontal", 8, 4, "Pegada aberta", "Descanso: 2min"));
        exercisesAbcde90.add(new HybridExercise("Remada Curvada", 8, 4, "Barra livre", "Descanso: 2min"));
        exercisesAbcde90.add(new HybridExercise("Remada Cavalinho", 10, 4, "Unilateral", "Descanso: 90s"));
        exercisesAbcde90.add(new HybridExercise("Puxada Triângulo", 12, 3, "Pegada fechada", "Descanso: 90s"));
        exercisesAbcde90.add(new HybridExercise("Pullover", 12, 3, "Halteres", "Descanso: 90s"));
        exercisesAbcde90.add(new HybridExercise("Rosca Direta", 10, 4, "Barra W", "Descanso: 90s"));
        exercisesAbcde90.add(new HybridExercise("Rosca Martelo", 12, 3, "Alternada", "Descanso: 60s"));
        exercisesAbcde90.add(new HybridExercise("Rosca Concentrada", 12, 3, "Pico de contração", "Descanso: 60s"));
        hybridWorkoutService.save(new HybridWorkout("ABCDE", 90, exercisesAbcde90, "Costas e Bíceps - Treino Completo e Intensivo"));

        // ===============================
        // DIVISÃO UPPER-LOWER
        // ===============================

        // Upper-Lower - 45 minutos (Upper)
        List<HybridExercise> exercisesUpperLower45 = new ArrayList<>();
        exercisesUpperLower45.add(new HybridExercise("Aquecimento", 5, 1, "Mobilidade articular", "Ativação"));
        exercisesUpperLower45.add(new HybridExercise("Supino Reto", 12, 3, "Composto principal", "Descanso: 2min"));
        exercisesUpperLower45.add(new HybridExercise("Puxada Frontal", 12, 3, "Antagonista", "Descanso: 90s"));
        exercisesUpperLower45.add(new HybridExercise("Desenvolvimento", 10, 3, "Ombros", "Descanso: 90s"));
        exercisesUpperLower45.add(new HybridExercise("Rosca + Tríceps", 12, 2, "Bi-set", "Descanso: 60s"));
        exercisesUpperLower45.add(new HybridExercise("HIIT", 10, 1, "Finalização", "Alta intensidade"));
        hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 45, exercisesUpperLower45, "Superior - Rápido e Eficiente"));

        // Upper-Lower - 60 minutos (Upper)
        List<HybridExercise> exercisesUpperLower60 = new ArrayList<>();
        exercisesUpperLower60.add(new HybridExercise("Aquecimento", 8, 1, "5 min cardio + mobilidade", "Preparação"));
        exercisesUpperLower60.add(new HybridExercise("Supino Inclinado", 10, 4, "Peito superior", "Descanso: 2min"));
        exercisesUpperLower60.add(new HybridExercise("Remada Curvada", 10, 4, "Costas", "Descanso: 2min"));
        exercisesUpperLower60.add(new HybridExercise("Desenvolvimento", 10, 3, "Ombro anterior", "Descanso: 90s"));
        exercisesUpperLower60.add(new HybridExercise("Puxada Triângulo", 12, 3, "Dorsal", "Descanso: 90s"));
        exercisesUpperLower60.add(new HybridExercise("Elevação Lateral", 12, 3, "Ombro medial", "Descanso: 60s"));
        exercisesUpperLower60.add(new HybridExercise("Rosca Direta", 12, 3, "Bíceps", "Descanso: 60s"));
        exercisesUpperLower60.add(new HybridExercise("Tríceps Pulley", 12, 3, "Tríceps", "Descanso: 60s"));
        hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 60, exercisesUpperLower60, "Superior - Volume Moderado"));

        // Upper-Lower - 90 minutos (Upper)
        List<HybridExercise> exercisesUpperLower90 = new ArrayList<>();
        exercisesUpperLower90.add(new HybridExercise("Aquecimento", 10, 1, "Preparação completa", "Cardio + mobilidade"));
        exercisesUpperLower90.add(new HybridExercise("Supino Reto", 8, 4, "Força", "Descanso: 2min"));
        exercisesUpperLower90.add(new HybridExercise("Puxada Frontal", 8, 4, "Largura", "Descanso: 2min"));
        exercisesUpperLower90.add(new HybridExercise("Supino Inclinado", 10, 4, "Peito superior", "Descanso: 2min"));
        exercisesUpperLower90.add(new HybridExercise("Remada Cavalinho", 10, 4, "Espessura", "Descanso: 2min"));
        exercisesUpperLower90.add(new HybridExercise("Desenvolvimento", 10, 3, "Ombros", "Descanso: 90s"));
        exercisesUpperLower90.add(new HybridExercise("Elevação Lateral", 12, 3, "Medial", "Descanso: 60s"));
        exercisesUpperLower90.add(new HybridExercise("Elevação Posterior", 12, 3, "Posterior", "Descanso: 60s"));
        exercisesUpperLower90.add(new HybridExercise("Rosca Direta", 10, 3, "Bíceps", "Descanso: 90s"));
        exercisesUpperLower90.add(new HybridExercise("Rosca Martelo", 12, 3, "Braquial", "Descanso: 60s"));
        exercisesUpperLower90.add(new HybridExercise("Tríceps Testa", 10, 3, "Cabeça longa", "Descanso: 90s"));
        exercisesUpperLower90.add(new HybridExercise("Tríceps Pulley", 12, 3, "Definição", "Descanso: 60s"));
        hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 90, exercisesUpperLower90, "Superior - Volume Alto Completo"));

        // ===============================
        // DIVISÃO FULL-BODY
        // ===============================

        // Full-Body - 45 minutos
        List<HybridExercise> exercisesFullBody45 = new ArrayList<>();
        exercisesFullBody45.add(new HybridExercise("Aquecimento Dinâmico", 5, 1, "Mobilidade geral", "Corpo todo"));
        exercisesFullBody45.add(new HybridExercise("Agachamento Livre", 12, 3, "Composto principal", "Descanso: 2min"));
        exercisesFullBody45.add(new HybridExercise("Supino ou Flexão", 12, 3, "Empurrar", "Descanso: 90s"));
        exercisesFullBody45.add(new HybridExercise("Remada Curvada", 12, 3, "Puxar", "Descanso: 90s"));
        exercisesFullBody45.add(new HybridExercise("Prancha", 45, 3, "Core", "45s por série"));
        exercisesFullBody45.add(new HybridExercise("Burpees", 10, 2, "Condicionamento", "Finalização"));
        hybridWorkoutService.save(new HybridWorkout("Full-Body", 45, exercisesFullBody45, "Condicionamento Geral - Eficiente"));

        // Full-Body - 60 minutos
        List<HybridExercise> exercisesFullBody60 = new ArrayList<>();
        exercisesFullBody60.add(new HybridExercise("Aquecimento", 8, 1, "Cardio + mobilidade", "Preparação"));
        exercisesFullBody60.add(new HybridExercise("Levantamento Terra", 8, 4, "Composto principal", "Descanso: 2min"));
        exercisesFullBody60.add(new HybridExercise("Supino Inclinado", 10, 3, "Empurrar superior", "Descanso: 2min"));
        exercisesFullBody60.add(new HybridExercise("Agachamento", 12, 3, "Empurrar inferior", "Descanso: 2min"));
        exercisesFullBody60.add(new HybridExercise("Remada", 10, 3, "Puxar", "Descanso: 90s"));
        exercisesFullBody60.add(new HybridExercise("Desenvolvimento", 10, 3, "Ombros", "Descanso: 90s"));
        exercisesFullBody60.add(new HybridExercise("Abdominais", 15, 3, "Core", "Variados"));
        exercisesFullBody60.add(new HybridExercise("Cardio", 10, 1, "Cool down", "Moderado"));
        hybridWorkoutService.save(new HybridWorkout("Full-Body", 60, exercisesFullBody60, "Força e Condicionamento Equilibrado"));

        // Full-Body - 90 minutos
        List<HybridExercise> exercisesFullBody90 = new ArrayList<>();
        exercisesFullBody90.add(new HybridExercise("Aquecimento Completo", 10, 1, "Preparação total", "Cardio + mobilidade específica"));
        exercisesFullBody90.add(new HybridExercise("Levantamento Terra", 6, 5, "Força máxima", "Descanso: 3min"));
        exercisesFullBody90.add(new HybridExercise("Agachamento Livre", 8, 4, "Força pernas", "Descanso: 2min"));
        exercisesFullBody90.add(new HybridExercise("Supino Reto", 8, 4, "Força peito", "Descanso: 2min"));
        exercisesFullBody90.add(new HybridExercise("Remada Curvada", 8, 4, "Força costas", "Descanso: 2min"));
        exercisesFullBody90.add(new HybridExercise("Desenvolvimento", 10, 3, "Ombros", "Descanso: 90s"));
        exercisesFullBody90.add(new HybridExercise("Afundo", 12, 3, "Unilateral", "Descanso: 90s"));
        exercisesFullBody90.add(new HybridExercise("Rosca + Tríceps", 12, 3, "Braços", "Superset"));
        exercisesFullBody90.add(new HybridExercise("Core Circuit", 20, 3, "Abdominais variados", "Circuit training"));
        exercisesFullBody90.add(new HybridExercise("Cardio LISS", 15, 1, "Recuperação", "65% FCmax"));
        hybridWorkoutService.save(new HybridWorkout("Full-Body", 90, exercisesFullBody90, "Hipertrofia Total - Volume Alto"));

        System.out.println(hybridWorkoutService.hybridWorkoutList().size() + " templates de treinos HÍBRIDOS carregados.");
    }


      private void loadGymWorkouts() {
        System.out.println("--- Carregando templates de treinos de ACADEMIA ---");
        /*TREINOS div==Full-Body */
        // --- Template de Treino 1: FUll BODY,60 min ---
        List<GymExercice> exercisesFB60 = new ArrayList<>();
        exercisesFB60.add(new GymExercice("Supino Reto", 15, 3, "Somente com a barra", true));
        exercisesFB60.add(new GymExercice("Agachamento Livre", 12, 4, "Foco na execução lenta e controlada", false));
        exercisesFB60.add(new GymExercice("Supino Reto", 12, 4, "Pegada um pouco mais aberta que a largura dos ombros", false));
        exercisesFB60.add(new GymExercice("Remada Curvada", 12, 4, "Manter a coluna ereta durante todo o movimento", false));
        exercisesFB60.add(new GymExercice("Desenvolvimento Militar", 15, 3, "Executar em pé para maior ativação do core", false));
        exercisesFB60.add(new GymExercice("Abdominal infra", 60, 3, "Com as mão no Glúteo", false));

        GymWorkout treinoFB60 = new GymWorkout("Full-Body", 60, exercisesFB60);

        // --- Template de Treino 2: FULL BODY, 45 min ---
        List<GymExercice> exercisesFB45 = new ArrayList<>();
        exercisesFB45.add(new GymExercice("Afundo ", 15, 3, "15 repetições para cada perna, sem peso", true));
        exercisesFB45.add(new GymExercice("Levantamento Terra", 8, 5, "Carga moderada e velocidade acelerada", false));
        exercisesFB45.add(new GymExercice("Flexão de Braço", 20, 4, "Flexões saltando", false));
        exercisesFB45.add(new GymExercice("Afundo com Halteres", 15, 3, "15 repetições para cada perna", false));
        exercisesFB45.add(new GymExercice("Agachamento Saltando", 10, 4, "Carga Moderada", false));

        GymWorkout treinoFB45 = new GymWorkout("Full-Body", 45, exercisesFB45);
        
        // --- Template de Treino: FULL BODY, 90 min ---
        List<GymExercice> exercisesFB90 = new ArrayList<>();

        
        exercisesFB90.add(new GymExercice("Mobilidade Dinâmica", 10, 1, "Rotação de quadris, joelhos, ombros, pass-through com elástico", true));
        exercisesFB90.add(new GymExercice("Aquecimento com Barra", 10, 2, "2 séries leves de Agachamento, Supino e Terra (apenas a barra)", true));
        exercisesFB90.add(new GymExercice("Agachamento Livre (Back Squat)", 5, 5, "Carga progressiva, foco em força (70–80% 1RM)", false));
        exercisesFB90.add(new GymExercice("Supino Reto (Bench Press)", 5, 5, "Carga progressiva, pausa de 1s no peito", false));
        exercisesFB90.add(new GymExercice("Levantamento Terra (Deadlift)", 3, 5, "Carga moderada/alta, execução controlada", false));
        exercisesFB90.add(new GymExercice("Desenvolvimento Militar (OHP)", 8, 4, "Controle total, sem impulso de pernas", false));
        exercisesFB90.add(new GymExercice("Remada Curvada", 8, 4, "Segurar 1s no pico da contração", false));
        exercisesFB90.add(new GymExercice("Agachamento Frontal", 6, 3, "Foco em quadríceps e core", false));
        exercisesFB90.add(new GymExercice("Deficit Deadlift", 5, 3, "Força de arrancada no terra", false));
        exercisesFB90.add(new GymExercice("Pull-Ups (Barra Fixa)", 10, 3, "Se possível, com carga extra", false));
        exercisesFB90.add(new GymExercice("Ab Wheel / Prancha com carga", 12, 3, "Controle total, foco em core", false));
        exercisesFB90.add(new GymExercice("Face Pulls", 15, 3, "Fortalecer ombro posterior", false));

        GymWorkout treinoFB90 = new GymWorkout("Full-Body", 90, exercisesFB90);

        // Salvando os treinos no repositório em memória
        /*salvando TREINOS div==Full-Body */
        gymWorkoutService.save(treinoFB45);
        gymWorkoutService.save(treinoFB60);
        gymWorkoutService.save(treinoFB90);
        /*salvando TREINOS div==ABC */

        System.out.println(gymWorkoutService.gymWorkoutList().size() + " templates de treinos de ACADEMIA carregados.");
    }
}

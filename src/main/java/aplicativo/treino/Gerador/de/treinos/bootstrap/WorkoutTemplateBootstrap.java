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
    }


      private void loadGymWorkouts() {
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

/* TREINOS Upper/Lower */

// --- Upper 45 min ---
List<GymExercice> exercisesUP45 = new ArrayList<>();
exercisesUP45.add(new GymExercice("Aquecimento Ombros e Peito", 10, 2, "Flexões leves e mobilidade de ombros", true));
exercisesUP45.add(new GymExercice("Supino Reto", 12, 3, "Carga moderada, execução controlada", false));
exercisesUP45.add(new GymExercice("Supino Inclinado com Halteres", 12, 3, "Amplitude máxima", false));
exercisesUP45.add(new GymExercice("Desenvolvimento Militar", 12, 3, "Em pé, ativando core", false));
exercisesUP45.add(new GymExercice("Elevação Lateral", 15, 3, "Trabalhar ombro medial", false));

GymWorkout treinoUP45 = new GymWorkout("UP45", 45, exercisesUP45);


// --- Upper 60 min ---
List<GymExercice> exercisesUP60 = new ArrayList<>();
exercisesUP60.add(new GymExercice("Aquecimento Ombros e Costas", 10, 2, "Mobilidade e face pulls leves", true));
exercisesUP60.add(new GymExercice("Barra Fixa (Pull-Ups)", 8, 4, "Se possível, adicionar carga", false));
exercisesUP60.add(new GymExercice("Remada Curvada", 12, 4, "Coluna ereta", false));
exercisesUP60.add(new GymExercice("Puxada Aberta na Polia", 12, 3, "Controle total, foco em dorsais", false));
exercisesUP60.add(new GymExercice("Rosca Direta com Barra", 12, 3, "Execução controlada", false));
exercisesUP60.add(new GymExercice("Rosca Martelo", 12, 3, "Foco no braquiorradial", false));
exercisesUP60.add(new GymExercice("Face Pull", 15, 3, "Fortalecer ombro posterior", false));

GymWorkout treinoUP60 = new GymWorkout("UP60", 60, exercisesUP60);


// --- Upper 90 min ---
List<GymExercice> exercisesUP90 = new ArrayList<>();
exercisesUP90.add(new GymExercice("Aquecimento Dinâmico", 10, 1, "Mobilidade de ombros, peito e costas", true));
exercisesUP90.add(new GymExercice("Supino Reto", 12, 4, "Controle total, execução lenta", false));
exercisesUP90.add(new GymExercice("Supino Inclinado com Halteres", 12, 4, "Amplitude máxima", false));
exercisesUP90.add(new GymExercice("Desenvolvimento Militar", 12, 4, "Foco em core", false));
exercisesUP90.add(new GymExercice("Remada Curvada", 12, 4, "Segurar 1s na contração máxima", false));
exercisesUP90.add(new GymExercice("Barra Fixa com Peso", 8, 4, "Se possível, carga extra", false));
exercisesUP90.add(new GymExercice("Face Pull", 15, 3, "Fortalecer ombro posterior", false));
exercisesUP90.add(new GymExercice("Rosca Direta com Barra", 12, 3, "Execução controlada", false));
exercisesUP90.add(new GymExercice("Rosca Martelo", 12, 3, "Foco no braquiorradial", false));

GymWorkout treinoUP90 = new GymWorkout("UP90", 90, exercisesUP90);


// --- Lower 45 min → agora LW45 ---
List<GymExercice> exercisesLW45 = new ArrayList<>();
exercisesLW45.add(new GymExercice("Aquecimento Pernas", 10, 2, "Mobilidade e agachamento leve", true));
exercisesLW45.add(new GymExercice("Agachamento com Halteres", 12, 3, "Amplitude máxima", false));
exercisesLW45.add(new GymExercice("Avanço (Afundo com Halteres)", 12, 3, "12 repetições por perna", false));
exercisesLW45.add(new GymExercice("Elevação de Panturrilhas", 15, 3, "Em pé ou sentado", false));
exercisesLW45.add(new GymExercice("Abdominal Infra", 15, 3, "Com as mãos sob o glúteo", false));

GymWorkout treinoLW45 = new GymWorkout("LW45", 45, exercisesLW45);


// --- Lower 60 min → LW60 ---
List<GymExercice> exercisesLW60 = new ArrayList<>();
exercisesLW60.add(new GymExercice("Aquecimento Dinâmico", 10, 2, "Mobilidade geral e agachamentos leves", true));
exercisesLW60.add(new GymExercice("Agachamento Livre", 12, 4, "Foco em técnica e amplitude", false));
exercisesLW60.add(new GymExercice("Levantamento Terra Romeno", 10, 4, "Posteriores e glúteos", false));
exercisesLW60.add(new GymExercice("Cadeira Extensora", 15, 3, "Quadríceps", false));
exercisesLW60.add(new GymExercice("Cadeira Flexora", 12, 3, "Posteriores", false));
exercisesLW60.add(new GymExercice("Elevação de Panturrilhas", 20, 3, "Em pé ou sentado", false));

GymWorkout treinoLW60 = new GymWorkout("LW60", 60, exercisesLW60);


// --- Lower 90 min → LW90 ---
List<GymExercice> exercisesLW90 = new ArrayList<>();
exercisesLW90.add(new GymExercice("Aquecimento Dinâmico", 10, 1, "Mobilidade de quadris e joelhos", true));
exercisesLW90.add(new GymExercice("Agachamento Livre", 12, 5, "Foco em técnica e amplitude", false));
exercisesLW90.add(new GymExercice("Levantamento Terra Romeno", 12, 4, "Posteriores e glúteos", false));
exercisesLW90.add(new GymExercice("Avanço (Afundo com Halteres)", 12, 4, "12 repetições por perna", false));
exercisesLW90.add(new GymExercice("Cadeira Extensora", 15, 4, "Quadríceps", false));
exercisesLW90.add(new GymExercice("Cadeira Flexora", 12, 4, "Posteriores", false));
exercisesLW90.add(new GymExercice("Elevação de Panturrilhas", 20, 4, "Em pé ou sentado", false));
exercisesLW90.add(new GymExercice("Abdominal Infra", 20, 3, "Com as mãos sob o glúteo", false));
exercisesLW90.add(new GymExercice("Prancha", 60, 3, "Segurar 60 segundos", false));
exercisesLW90.add(new GymExercice("Abdominal com Peso", 15, 3, "Foco em core", false));

GymWorkout treinoLW90 = new GymWorkout("LW90", 90, exercisesLW90);

        // Salvando os treinos no repositório em memória
        /*salvando TREINOS div==Full-Body */
        gymWorkoutService.save(treinoFB45);
        gymWorkoutService.save(treinoFB60);
        gymWorkoutService.save(treinoFB90);

        /*salvando TREINOS div==Upper/Lower */
        gymWorkoutService.save(treinoUP45);
        gymWorkoutService.save(treinoUP60);
        gymWorkoutService.save(treinoUP90);
        gymWorkoutService.save(treinoLW45);
        gymWorkoutService.save(treinoLW60);
        gymWorkoutService.save(treinoLW90);
              
        System.out.println(gymWorkoutService.gymWorkoutList().size() + " templates de treinos de ACADEMIA carregados.");
    }
    }
}

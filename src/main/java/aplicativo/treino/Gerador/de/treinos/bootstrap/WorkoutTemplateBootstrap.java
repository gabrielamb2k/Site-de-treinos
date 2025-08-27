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
import java.time.LocalDateTime;
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


    /* ============================
       UPPER (Superior) - Hybrid
       ============================ */

            // UPPER - 45 minutos (rápido, mistura força e condicionamento)
            List<HybridExercise> up45 = new ArrayList<>();
            up45.add(new HybridExercise("Aquecimento Dinâmico", 5, 1, "Mobilidade & Prep", "5 min - cardio leve + mobilidade"));
            up45.add(new HybridExercise("Supino Reto - Força", 6, 4, "Peito/Força", "Descanso 90-120s"));
            up45.add(new HybridExercise("Remada Curvada - Força", 6, 4, "Costas/Força", "Descanso 90-120s"));
            up45.add(new HybridExercise("Superset: Elevação Lateral + Face Pull", 12, 3, "Ombro/Posterior", "Bi-set, descanso 60s"));
            up45.add(new HybridExercise("Circuito Cond.: Burpees / Kettlebell Swing", 8, 3, "Condicionamento", "EMOM ou AMRAP 6-8min"));
            up45.add(new HybridExercise("Core - Prancha", 45, 1, "Estabilidade", "45s x 3 com 30s descanso"));
            hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 45,up45, "Upper"));


        // UPPER - 60 minutos (equilíbrio força/hypertrofia + conditioning)
            List<HybridExercise> up60 = new ArrayList<>();
            up60.add(new HybridExercise("Aquecimento", 7, 1, "Cardio + Mobilidade", "7 min"));
            up60.add(new HybridExercise("Supino Inclinado - Força/Volume", 6, 4, "Peito", "2 min descanso"));
            up60.add(new HybridExercise("Puxada Frontal / Remada - Potência", 8, 4, "Costas", "90s descanso"));
            up60.add(new HybridExercise("Desenvolvimento Militar", 8, 3, "Ombros", "90s descanso"));
            up60.add(new HybridExercise("Rosca Direta / Tríceps - Superset", 10, 3, "Arms", "Bi-set, 60s descanso"));
            up60.add(new HybridExercise("Circuito MetCon: Remos + Slam Ball", 10, 1, "Condicionamento", "AMRAP 10min"));
            up60.add(new HybridExercise("Core - L-Sit / Ab-wheel", 10, 2, "Core", "Técnica e resistência"));
            hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 60, up60, "Upper"));


        // UPPER - 90 minutos (volume maior, foco em força + hipertrofia + conditioning localizado)
            List<HybridExercise> up90 = new ArrayList<>();
            up90.add(new HybridExercise("Aquecimento Completo", 10, 1, "Cardio + Mobilidade", "10 min"));
            up90.add(new HybridExercise("Supino Reto - Força Pesada", 5, 5, "Peito/Força", "2-3 min descanso"));
            up90.add(new HybridExercise("Remada Unilateral - Volume", 10, 4, "Costas", "90s descanso"));
            up90.add(new HybridExercise("Press Arnold / Desenvolvimento", 8, 4, "Ombros", "90s descanso"));
            up90.add(new HybridExercise("Superset de Bíceps/Tríceps", 10, 4, "Braços", "60s descanso"));
            up90.add(new HybridExercise("MetCon Longo", 12, 1, "Condicionamento", "Intervalado 12-15 min (ex: 4x(250m remo + 12 cal bike))"));
            up90.add(new HybridExercise("Accessory & Mobilidade", 8, 2, "Alongamento/Recuperação", "Foam rolling + mobilidade"));
            hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 90, up90, "Upper"));

    /* ============================
       LOWER (Inferior) - Hybrid
       ============================ */

            // LOWER - 45 minutos (eficiente)
            List<HybridExercise> lw45 = new ArrayList<>();
            lw45.add(new HybridExercise("Aquecimento - Mobilidade de Quadril", 5, 1, "Pré-treino", "ATivação glúteo"));
            lw45.add(new HybridExercise("Agachamento Frontal - Força", 5, 4, "Quadríceps/Força", "90-120s descanso"));
            lw45.add(new HybridExercise("Hip Thrust - Potência de Quadril", 8, 3, "Glúteos", "90s descanso"));
            lw45.add(new HybridExercise("Peso Morto Romeno - Template", 8, 3, "Posterior de coxa", "90s descanso"));
            lw45.add(new HybridExercise("Sprint/Tabata - Condicionamento", 20, 1, "Explosão/Cond", "Tabata 4min ou sprints 6x20s"));
            lw45.add(new HybridExercise("Core - Pallof Press", 10, 2, "Estabilidade", "Controle"));
            // caso o construtor não aceite o comentário acima, remova a última linha acima
            // Para evitar compilação, vamos usar uma alternativa sem comentário:
            lw45.add(new HybridExercise("Core - Pallof Press", 10, 2, "Estabilidade", "Controle"));
            hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 45, lw45, "Lower"));

            // LOWER - 60 minutos (equilíbrio força/condicionamento)
            List<HybridExercise> lw60 = new ArrayList<>();
            lw60.add(new HybridExercise("Aquecimento Dinâmico", 8, 1, "Mobilidade", "8 min"));
            lw60.add(new HybridExercise("Agachamento Livre - Força/Volume", 6, 5, "Quadríceps", "2 min descanso"));
            lw60.add(new HybridExercise("Peso Morto Convencional - Força", 5, 4, "Posterior", "2 min descanso"));
            lw60.add(new HybridExercise("Lunge Caminhando - Volume", 10, 3, "Glúteo/Quadríceps", "60-90s descanso"));
            lw60.add(new HybridExercise("Kettlebell Swing / Sled Push", 12, 3, "Condicionamento/Explosão", "AMRAP curto"));
            lw60.add(new HybridExercise("Core - Elevação de Pernas", 12, 3, "Core", "Resistência"));
            hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 60, lw60, "Lower"));


        // LOWER - 90 minutos (volume e técnica)
            List<HybridExercise> lw90 = new ArrayList<>();
            lw90.add(new HybridExercise("Mobilidade & Ativação", 10, 1, "Prep", "10 min"));
            lw90.add(new HybridExercise("Agachamento Pesado - Força Máxima", 5, 5, "Quadríceps/Força", "3 min descanso"));
            lw90.add(new HybridExercise("Peso Morto Romeno - Volume", 8, 4, "Posterior", "90-120s"));
            lw90.add(new HybridExercise("Step-up / Bulgarian Split", 10, 4, "Unilateral", "Equilíbrio e força"));
            lw90.add(new HybridExercise("Circuito Condicional Longo", 15, 1, "Condicionamento", "EMOM/AMRAP 12-15min"));
            lw90.add(new HybridExercise("Recovery/Mobilidade", 10, 1, "Recuperação", "Foam roll + alongamento"));
            hybridWorkoutService.save(new HybridWorkout("Upper-Lower", 90, lw90, "Lower"));


    /* ============================
       FULL BODY - Hybrid
       ============================ */

            // FULL BODY - 45 minutos (condicionamento + força básica)
            List<HybridExercise> fb45 = new ArrayList<>();
            fb45.add(new HybridExercise("Aquecimento Geral", 5, 1, "Cardio + Mobilidade", "5 min"));
            fb45.add(new HybridExercise("Deadlift - Força", 5, 3, "Posterior/Força", "2 min descanso"));
            fb45.add(new HybridExercise("Push Press - Potência", 6, 3, "Ombro/Tríceps", "90s descanso"));
            fb45.add(new HybridExercise("Pull-ups / Ring Row", 8, 3, "Costas", "Progressão conforme nível"));
            fb45.add(new HybridExercise("Cond: Bike/Row Intervals", 10, 1, "Condicionamento", "AMRAP 10min"));
            fb45.add(new HybridExercise("Accessory & Core", 10, 2, "Core + Acessórios", "Finish"));
        hybridWorkoutService.save(new HybridWorkout("Full-Body", 45, fb45, "Condicionamento Geral - Rápido"));


        // FULL BODY - 60 minutos (equilíbrio e volume)
            List<HybridExercise> fb60 = new ArrayList<>();
            fb60.add(new HybridExercise("Aquecimento Específico", 8, 1, "Mob + Ativação", "8 min"));
            fb60.add(new HybridExercise("Back Squat / Front Squat", 6, 4, "Perna/Força", "2 min descanso"));
            fb60.add(new HybridExercise("Bench Press / Weighted Push-up", 6, 4, "Peito", "2 min descanso"));
            fb60.add(new HybridExercise("Barbell Row / Pull-up", 8, 4, "Costas", "90s descanso"));
            fb60.add(new HybridExercise("MetCon Médio", 12, 1, "Condicionamento", "Intervalado 12 min"));
            fb60.add(new HybridExercise("Core & Mobility", 10, 2, "Recuperação", "Cooldown"));
            hybridWorkoutService.save(new HybridWorkout("Full-Body", 60, fb60, "Força e Condicionamento"));


        // FULL BODY - 90 minutos (alto volume e trabalho técnico)
            List<HybridExercise> fb90 = new ArrayList<>();
            fb90.add(new HybridExercise("Aquecimento Longo", 12, 1, "Cardio + Mobilidade", "12 min"));
            fb90.add(new HybridExercise("Complexo Técnico: Clean + Front Squat + Press", 5, 5, "Potência/Técnica", "Trabalhar técnica e carga"));
            fb90.add(new HybridExercise("Deadlift Pesado / Variantes", 5, 5, "Força", "2-3 min descanso"));
            fb90.add(new HybridExercise("Bench Press - Volume", 8, 4, "Peito/Hipertrofia", "90s descanso"));
            fb90.add(new HybridExercise("Circuito Cond: Rown+Ski+Box", 15, 1, "Condicionamento", "Interval 15min"));
            fb90.add(new HybridExercise("Accessory + Mobilidade Profunda", 12, 2, "Recuperação", "Foam roll + alongamento longo"));
            hybridWorkoutService.save(new HybridWorkout("Full-Body", 90, fb90, "Hipertrofia Total - Volume Alto"));


        System.out.println(hybridWorkoutService.hybridWorkoutList().size() + " templates de treinos híbridos carregados.");



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

/* TREINOS Upper/Lower */

// --- Upper 45 min ---
List<GymExercice> exercisesUP45 = new ArrayList<>();
exercisesUP45.add(new GymExercice("Aquecimento Ombros e Peito", 10, 2, "Flexões leves e mobilidade de ombros", true));
exercisesUP45.add(new GymExercice("Supino Reto", 12, 3, "Carga moderada, execução controlada", false));
exercisesUP45.add(new GymExercice("Supino Inclinado com Halteres", 12, 3, "Amplitude máxima", false));
exercisesUP45.add(new GymExercice("Desenvolvimento Militar", 12, 3, "Em pé, ativando core", false));
exercisesUP45.add(new GymExercice("Elevação Lateral", 15, 3, "Trabalhar ombro medial", false));

GymWorkout treinoUP45 = new GymWorkout("Upper-Lower", 45, exercisesUP45);


// --- Upper 60 min ---
List<GymExercice> exercisesUP60 = new ArrayList<>();
exercisesUP60.add(new GymExercice("Aquecimento Ombros e Costas", 10, 2, "Mobilidade e face pulls leves", true));
exercisesUP60.add(new GymExercice("Barra Fixa (Pull-Ups)", 8, 4, "Se possível, adicionar carga", false));
exercisesUP60.add(new GymExercice("Remada Curvada", 12, 4, "Coluna ereta", false));
exercisesUP60.add(new GymExercice("Puxada Aberta na Polia", 12, 3, "Controle total, foco em dorsais", false));
exercisesUP60.add(new GymExercice("Rosca Direta com Barra", 12, 3, "Execução controlada", false));
exercisesUP60.add(new GymExercice("Rosca Martelo", 12, 3, "Foco no braquiorradial", false));
exercisesUP60.add(new GymExercice("Face Pull", 15, 3, "Fortalecer ombro posterior", false));

GymWorkout treinoUP60 = new GymWorkout("Upper-Lower", 60, exercisesUP60);


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

GymWorkout treinoUP90 = new GymWorkout("Upper-Lower", 90, exercisesUP90);


// --- Lower 45 min → agora LW45 ---
List<GymExercice> exercisesLW45 = new ArrayList<>();
exercisesLW45.add(new GymExercice("Aquecimento Pernas", 10, 2, "Mobilidade e agachamento leve", true));
exercisesLW45.add(new GymExercice("Agachamento com Halteres", 12, 3, "Amplitude máxima", false));
exercisesLW45.add(new GymExercice("Avanço (Afundo com Halteres)", 12, 3, "12 repetições por perna", false));
exercisesLW45.add(new GymExercice("Elevação de Panturrilhas", 15, 3, "Em pé ou sentado", false));
exercisesLW45.add(new GymExercice("Abdominal Infra", 15, 3, "Com as mãos sob o glúteo", false));

GymWorkout treinoLW45 = new GymWorkout("Upper-Lower", 45, exercisesLW45);


// --- Lower 60 min → LW60 ---
List<GymExercice> exercisesLW60 = new ArrayList<>();
exercisesLW60.add(new GymExercice("Aquecimento Dinâmico", 10, 2, "Mobilidade geral e agachamentos leves", true));
exercisesLW60.add(new GymExercice("Agachamento Livre", 12, 4, "Foco em técnica e amplitude", false));
exercisesLW60.add(new GymExercice("Levantamento Terra Romeno", 10, 4, "Posteriores e glúteos", false));
exercisesLW60.add(new GymExercice("Cadeira Extensora", 15, 3, "Quadríceps", false));
exercisesLW60.add(new GymExercice("Cadeira Flexora", 12, 3, "Posteriores", false));
exercisesLW60.add(new GymExercice("Elevação de Panturrilhas", 20, 3, "Em pé ou sentado", false));

GymWorkout treinoLW60 = new GymWorkout("Upper-Lower", 60, exercisesLW60);


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

GymWorkout treinoLW90 = new GymWorkout("Upper-Lower", 90, exercisesLW90);

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

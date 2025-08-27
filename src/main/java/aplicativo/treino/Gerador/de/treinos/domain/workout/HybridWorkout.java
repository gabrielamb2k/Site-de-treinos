package aplicativo.treino.Gerador.de.treinos.domain.workout;

import aplicativo.treino.Gerador.de.treinos.domain.exercise.HybridExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;

/**
 * Classe para treinos hibridos, nela teremos o tipo de treino e uma lista de
 * exercicios hibridos
 * @version 1.0
 */
public class HybridWorkout extends Workout {

    private String type;
    private List<HybridExercise> hybridExerciseList=new ArrayList<>();

    public HybridWorkout(String div, int duracao, List<HybridExercise> hybridExerciseList, String type) {
        super(div, duracao);
        this.hybridExerciseList=hybridExerciseList;
        this.type=type;
    }

    public String getType() {
        return type;
    }

    /**
     * Define como vai ser o treino do usuario
     */
    public void executarTreinoCompleto() {
        System.out.println("=================================================");
        System.out.println("INICIANDO TREINO: " + this.type.toUpperCase());
        System.out.println("DIVISÃO: " + this.getDiv() + " | DURAÇÃO ESTIMADA: " + this.getDuracao() + " min");
        System.out.println("=================================================");

        this.aquec();
        this.treino();
        this.along();

        System.out.println("=================================================");
    }

    /**
     * Implementa a fase de aquecimento do treino.
     * Procura por um exercício que contenha "Aquecimento" em sua descrição aeróbica.
     */
    @Override
    protected void aquec() {
        System.out.println("\n--- FASE 1: AQUECIMENTO ---");

        Optional<HybridExercise> aquecimentoExercicio = hybridExerciseList.stream()
                .filter(ex -> ex.getAerobic() != null && ex.getAerobic().toLowerCase().contains("aquecimento"))
                .findFirst();

        if (aquecimentoExercicio.isPresent()) {
            System.out.println(">> " + aquecimentoExercicio.get().getAerobic());
        } else {
            System.out.println(">> Realizar 5-10 minutos de cardio leve (bicicleta ou esteira).");
        }
    }

    /**
     * Implementa a fase principal do treino.
     * Lista todos os exercícios de força com suas séries, repetições e observações.
     */
    @Override
    protected void treino() {
        System.out.println("\n--- FASE 2: TREINO PRINCIPAL ---");
        for (HybridExercise ex : hybridExerciseList) {
            // Ignora os exercícios que são apenas para marcar aeróbicos, todos
            if (!ex.getNome().equalsIgnoreCase("N/A")) {
                System.out.printf(">> %s: %d séries de %d repetições. (Obs: %s)\n",
                        ex.getNome(), ex.getSeries(), ex.getReps(), ex.getObs());
            }
        }
    }

    /**
     * Implementa a fase de alongamento ou finalização.
     * Procura por um exercício que contenha "Alongamento"
     * em sua descrição aeróbica.
     */
    @Override
    protected void along() {
        System.out.println("\n--- FASE 3: FINALIZAÇÃO / ALONGAMENTO ---");

        Optional<HybridExercise> alongExercicio = hybridExerciseList.stream()
                .filter(ex -> ex.getAerobic() != null && (ex.getAerobic().toLowerCase().contains("finalizador") || ex.getAerobic().toLowerCase().contains("alongamento")))
                .findFirst();

        if (alongExercicio.isPresent()) {
            System.out.println(">> " + alongExercicio.get().getAerobic());
        } else {
            System.out.println(">> Não se esqueça de alongar os principais músculos trabalhados hoje.");
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<HybridExercise> getHybridExerciseList() {
        return hybridExerciseList;
    }

    public void setHybridExerciseList(List<HybridExercise> hybridExerciseList) {
        this.hybridExerciseList = hybridExerciseList;
    }
}

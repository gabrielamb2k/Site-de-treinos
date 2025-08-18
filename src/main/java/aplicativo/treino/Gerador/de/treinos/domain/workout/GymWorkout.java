package aplicativo.treino.Gerador.de.treinos.domain.workout;
import aplicativo.treino.Gerador.de.treinos.domain.exercise.GymExercice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GymWorkout extends Workout{
  //lista de exercicios para academia(puxar ferro)
    private List<GymExercice> gymExerciseList = new ArrayList<>();

    public GymWorkout(String div, int duracao, List<GymExercice> gymExerciseList) {
        super(div, duracao);
        this.gymExerciseList = gymExerciseList;
    }

    public List<GymExercice> getGymExerciseList() {
        return gymExerciseList;
    }

    public void setGymExerciseList(List<GymExercice> gymExerciseList) {
        this.gymExerciseList = gymExerciseList;
    }

    /**
     * Executa todas as etapas do treino completo:
     * Aquecimento, treino principal e alongamento.
     */
    public void executarTreinoCompleto() {
        System.out.println("=================================================");
        System.out.println("INICIANDO TREINO DE ACADEMIA... ";
        System.out.println("DIVISÃO: " + this.getDiv() + " | DURAÇÃO ESTIMADA: " + this.getDuracao() + " min");
        System.out.println("=================================================");

        this.aquec();
        this.treino();
        this.along();

        System.out.println("=================================================");
    }

    /**
     * Fase de aquecimento: mostra apenas exercícios marcados como aquecimento.
     */
    @Override
    protected void aquec() {
        System.out.println("\n--- FASE 1: AQUECIMENTO ---");
        boolean foundAquecimento = false;

        for (GymExercice ex : gymExerciseList) {
            if (ex.isAquecimento()) {
                System.out.printf(">> %s: %d séries de %d repetições. (Obs: %s)\n",
                        ex.getNome(), ex.getSeries(), ex.getReps(),
                        (ex.getObs() != null && !ex.getObs().isBlank()) ? ex.getObs() : "Sem observações.");
                foundAquecimento = true;
            }
        }

        if (!foundAquecimento) {
            System.out.println(">> Realizar 5-10 minutos de aquecimento articular.");
        }
    }

    /**
     * Fase principal do treino: mostra apenas exercícios principais (não aquecimento).
     */
    @Override
    protected void treino() {
        System.out.println("\n--- FASE 2: TREINO PRINCIPAL ---");
        boolean hasMainExercise = false;

        for (GymExercice ex : gymExerciseList) {
            if (!ex.isAquecimento()) { // só exercícios principais
                System.out.printf(">> %s: %d séries de %d repetições. (Obs: %s)\n",
                        ex.getNome(), ex.getSeries(), ex.getReps(),
                        (ex.getObs() != null && !ex.getObs().isBlank()) ? ex.getObs() : "Sem observações.");
                hasMainExercise = true;
            }
        }

        if (!hasMainExercise) {
            System.out.println(">> Nenhum exercício principal cadastrado para este treino.");
        }
    }

    /**
     * Fase de alongamento / desaquecimento.
     */
    @Override
    protected void along() {
        System.out.println("\n--- FASE 3: FINALIZAÇÃO / ALONGAMENTO ---");
        System.out.println(">> Realizar alongamento dos principais grupos musculares trabalhados hoje.");
    }
}

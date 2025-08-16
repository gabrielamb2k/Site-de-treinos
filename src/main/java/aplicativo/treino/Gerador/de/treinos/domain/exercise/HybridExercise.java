package aplicativo.treino.Gerador.de.treinos.domain.exercise;

/**
 * Classe para treinos hybridos o que vai diferencias da classe
 * exercicio é que nela temos um aerobico especifoc para o foco do usuario
 * @version 1.0
 */
public class HybridExercise extends Exercise {

    private String aerobic;

    public HybridExercise(String nome, int reps, int series, String obs, String aerobic) {
        super(nome, reps, series, obs);
        this.aerobic=aerobic;
    }

    public String getAerobic() {
        return aerobic;
    }

    public void setAerobic(String aerobic) {
        this.aerobic = aerobic;
    }
}

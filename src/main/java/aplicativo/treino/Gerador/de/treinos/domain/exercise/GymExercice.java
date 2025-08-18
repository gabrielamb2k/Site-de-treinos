package aplicativo.treino.Gerador.de.treinos.domain.exercise;
/* Classe para exercicios de academia, basicamente segue o padrão de exercise,add apenas o boolean isAquec para identificar se o exercicio
é de aquecimento ou não
*/
public class GymExercice extends Exercise{
    private boolean isAquec; // indica se é exercício de aquecimento

   public GymExercice(String nome, int reps, int series, String obs,boolean isAquec) {
        super(nome, reps, series, obs);
        this.isAquec = isAquec;
    }

    public boolean isAquec() {
        return isAquec;
    }

    public void setAquec(boolean aquec) {
        isAquec = aquec;
    }
}

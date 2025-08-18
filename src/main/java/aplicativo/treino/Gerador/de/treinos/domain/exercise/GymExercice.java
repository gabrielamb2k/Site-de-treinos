package aplicativo.treino.Gerador.de.treinos.domain.exercise;
/* Classe para exercicios de academia, basicamente segue o padrão de exercise, sem aérobico
*/
public class GymExercice extends Exercise{
   public GymExercice(String nome, int reps, int series, String obs) {
        super(nome, reps, series, obs);
    }
}

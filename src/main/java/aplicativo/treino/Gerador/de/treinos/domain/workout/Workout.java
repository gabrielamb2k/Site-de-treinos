package aplicativo.treino.Gerador.de.treinos.domain.workout;
import java.time.LocalDateTime;
import aplicativo.treino.Gerador.de.treinos.domain.exercise.Exercise;
import java.util.ArrayList;
import java.util.List;
//Herda de WorkoutTemplate
public abstract class Workout extends WorkoutTemplate {

  public Workout(String div, int duracao,LocalDateTime dataGer){
    super(div,duracao,dataGer);
  }

}

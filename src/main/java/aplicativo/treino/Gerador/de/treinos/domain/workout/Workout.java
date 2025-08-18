package aplicativo.treino.Gerador.de.treinos.domain.workout;
import aplicativo.treino.Gerador.de.treinos.domain.exercise.Exercise;

import java.util.ArrayList;
import java.util.List;

public abstract class Workout extends WorkoutTemplate {
  public Workout(String div, int duracao){
    super(div,duracao);
  }
}

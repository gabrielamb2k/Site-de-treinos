package aplicativo.treino.Gerador.de.treinos.domain.workout;
import java.time.LocalDate;
import aplicativo.treino.Gerador.de.treinos.domain.exercise.Exercise;
import java.util.ArrayList;
import java.util.List;
//Herda de WorkoutTemplate
public abstract class Workout extends WorkoutTemplate {
  //dataGer== data que o treino foi gerado, implementado para ajudar na criação do historico
    private LocalDateTime dataGer;
  
  public Workout(String div, int duracao){
    super(div,duracao);
    this.dataGer=LocalDateTime.now();
  }
  //somente o get pois o dataGer por padrão será setado por: LocalDateTime.now()
     public LocalDateTime getData() {
        return dataGer;
    }
}

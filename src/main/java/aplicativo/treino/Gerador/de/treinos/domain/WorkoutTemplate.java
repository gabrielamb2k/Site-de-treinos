package aplicativo.treino.Gerador.de.treinos.domain;
import java.util.ArrayList;
import java.util.List;

public abstract class WorkoutTemplate {
    private List<Exercise> exercises;
    //div == divisão de treinos (ex: upper/lower, fullbody etc... lembrando que a div define a quantidade de dias à ir na academia)
    private String div;
    

    public WorkoutTemplate(String div){
      this.div=div;
        this.exercises= new ArrayList<>();
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

}

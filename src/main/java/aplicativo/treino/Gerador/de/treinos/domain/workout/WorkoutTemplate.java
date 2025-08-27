package aplicativo.treino.Gerador.de.treinos.domain.workout;
import aplicativo.treino.Gerador.de.treinos.domain.exercise.Exercise;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class WorkoutTemplate {
    /*atributos*/
    private List<Exercise> exercises;
    /*div == divisão de treinos (ex: upper/lower, fullbody etc... lembrando que a div será escolhida conforme a resposta do usuario 
    no questionário)*/
    private String div;
    // duracao == duracao máxima do treino, de acordo com a resposta do usauario
    private int duracao;
    //dataGer== data que o treino foi gerado, implementado para ajudar na criação do historico
    private LocalDateTime dataGer;

    /*builder*/
    public WorkoutTemplate(String div, int duracao, LocalDateTime date){
      this.div=div;
      this.duracao=duracao;
      this.dataGer=date;
      this.exercises= new ArrayList<>();
    }

    public LocalDateTime getDataGer() {
        return dataGer;
    }

    public void setDataGer(LocalDateTime dataGer) {
        this.dataGer = dataGer;
    }

    /*get.set div*/
    public String getDiv() {
        return div;
    }
    public void setDiv(String div) {
        this.div = div;
    }
    /*get.set exercises*/
    public List<Exercise> getExercises() {
        return exercises;
    }
    /*get.set duracao*/
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getDuracao() {
        return duracao;
    }
    /*methods*/
    //adiciona exercicios à lista de exercicios
    public void addExercise(Exercise exercise){
        exercises.add(exercise);
    }
    //template method uso do final para fixar a sequencia de criação de treinos
    public final void criaWorkout(){
        //aquecimento
        aquec();
        //treino principal
        treino();
        //alongamento final
        along();
    }
    /*métodos que serão modificados para cada tipo de treino gym ou hybrid */
    protected abstract void aquec();
    protected abstract void treino();
    protected abstract void along();

}

package aplicativo.treino.Gerador.de.treinos.domain;

public abstract class Exercise {
   /*Atributos*/
  String nome;
  int reps;
  int series;
  String obs;
   /*builder*/
  public Exercise(String nome, int reps, int series, String obs){
    this.nome=nome;
    this.reps=reps;
    this.series=series;
    this.obs=obs;
  }
  /*get/set*/
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome=nome;
  }
  public int getReps(){
    return reps;
  }
  public void setReps(int reps){
    this.reps=reps;
  }
}

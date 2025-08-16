package aplicativo.treino.Gerador.de.treinos.domain.exercise;

public abstract class Exercise {
   /*Atributos*/
  private String nome;
  private int reps;
  private int series;
   //obs== possiveis observações sobre a execução do exercicio, se não houver deixar explicito o não uso de obs
  private String obs;
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
     public int getSeries(){
    return series;
  }
  public void setSeries(int series){
    this.series=series;
  }
   public String getObs(){
      return obs;
   }
   public void setObs(String obs){
      this.obs=obs;
   }
   
}

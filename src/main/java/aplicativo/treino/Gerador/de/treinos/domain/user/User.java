package aplicativo.treino.Gerador.de.treinos.domain.user;

import aplicativo.treino.Gerador.de.treinos.domain.workout.Workout;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String name;
    private String email;

    /*
    Relacionamento com a classe de Workout -> One to many,
    um usuario para muitos treinos, Composicao
     */
    private List<Workout> workoutList=new ArrayList<>();

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public List<Workout> getWorkoutList() {
        return workoutList;
    }

    public void setWorkoutList(List<Workout> workoutList) {
        this.workoutList = workoutList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

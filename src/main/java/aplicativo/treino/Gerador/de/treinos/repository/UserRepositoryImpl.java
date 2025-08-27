package aplicativo.treino.Gerador.de.treinos.repository;

import aplicativo.treino.Gerador.de.treinos.domain.user.User;
import aplicativo.treino.Gerador.de.treinos.domain.workout.Workout;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Implementação em memória da interface {@link UserRepository}
 * Utilizaremos para simular um banco de dados
 * Refatorada total na versao 1.1
 * @version 1.1
 */
@Repository
public class UserRepositoryImpl implements UserRepository{

    /**
     * No lugar dos maps, criei apenas uma lista para simplificar
     * o processo de retornar o treino gerado para o usuario
     */
    private static final List<User> userList=new ArrayList<>();

    private static Long contador=0L;

    /**
     * metodo para salvar um usuario
     * @param user
     * @return o usuario salvo com seu id
     */
    @Override
    public User save(User user) {
        if(user.getId() == null){
            user.setId(contador++);
        }
        user.setId(contador);
        user.setName(user.getName());
        user.setWorkoutList(user.getWorkoutList());
        user.setEmail(user.getEmail());
        userList.add(user);
        return user;
    }

    /**
     * metodo para buscar se existe um email passado pelo usuario
     * @param email
     * @return um optional contendo u usuario, caso o email estiver registrado
     */
    @Override
    public Optional<User> findEmail(String email) {
        /*
        Essa stream vai percorrer a lista de usuarios
        ate achar um usuario que contenha o email passado no parametro
         */
        return userList.stream()
                .filter(u -> u.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }

    /**
     * Metodo que vai salvar os treinos gerados la na classe WorkoutGenerator
     * @param newWorkouts
     * @param user
     */
    @Override
    public void saveWorkout(List<Workout> newWorkouts, User user) {
        for(int i=0;i<userList.size();i++){
            if(Objects.equals(userList.get(i).getId(), user.getId())){
                userList.get(i).getWorkoutList().addAll(newWorkouts);
            }
            break;
        }
    }


    /**
     * Metodo de listagem dos treinos para o usuario
     * verificar os treinos que ja foram gerados por ele
     * @param user
     * @return retorna a lista de treinos que o usuario gerou
     * se nao gerou nenhuma retorna uma lista vazia
     */
    @Override
    public List<Workout> listWorkout(User user) {
        for(int i=0;i<userList.size();i++){
            if(Objects.equals(userList.get(i).getId(), user.getId())){
                return userList.get(i).getWorkoutList();
            }
        }
        return new ArrayList<>();
    }

}

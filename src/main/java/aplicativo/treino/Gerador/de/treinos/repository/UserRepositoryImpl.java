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
     * Metodo para pegar a lista de usuarios, util para colocarmos a logica de negocio
     * para adicionar treinos a ele no user service
     * @return a lista de usuarios
     */
    @Override
    public List<User> findAll() {
        return userList;
    }

}

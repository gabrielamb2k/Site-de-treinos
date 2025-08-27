package aplicativo.treino.Gerador.de.treinos.repository;

import aplicativo.treino.Gerador.de.treinos.domain.user.User;
import aplicativo.treino.Gerador.de.treinos.domain.workout.Workout;

import java.util.List;
import java.util.Optional;

/**
 * Interface que define as operções que vamos fazer para
 * a entidade {@link User}
 * Implementacao da visualizacao do historico de treinos para o user
 * @version 1.1
 */
public interface UserRepository {

    User save(User user);
    Optional<User> findEmail(String email);
    List<User> findAll();
}

package aplicativo.treino.Gerador.de.treinos.repository;

import aplicativo.treino.Gerador.de.treinos.domain.user.User;

import java.util.Optional;

/**
 * Interface que define as operções que vamos fazer para
 * a entidade {@link User}
 * @version 1.0
 */
public interface UserRepository {

    User save(User user);
    Optional<User> findEmail(String email);
}

package aplicativo.treino.Gerador.de.treinos.repository;

import aplicativo.treino.Gerador.de.treinos.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Implementação em memória da interface {@link UserRepository}
 * Utilizaremos para simular um banco de dados
 * @version 1.0
 */
@Repository
public class UserRepositoryImpl implements UserRepository{

    /**
     * Os dois maps abaixo simulam um banco de dados,
     * armazenamentoUsers -> armazena o id do usuário e a entidade user
     * armazenamentoEmails -> salvam os emails dos usuarios, para que não exista repetição
     * de email
     */
    private static final Map<Long, User> armazenamentoUsers = new HashMap<>();
    private static final Map<String, Long> armazenamentoEmails = new HashMap<>();

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
        armazenamentoUsers.put(user.getId(), user);
        armazenamentoEmails.put(user.getEmail(), user.getId());
        return user;
    }

    /**
     * metodo para buscar se existe um email passado pelo usuario
     * @param email
     * @return um optional contendo u usuario, caso o email estiver registrado
     */
    @Override
    public Optional<User> findEmail(String email) {

        if(armazenamentoEmails.containsKey(email)){
            Long userID = armazenamentoEmails.get(email);
            return Optional.ofNullable(armazenamentoUsers.get(userID));
        }

        return Optional.empty();

    }

}

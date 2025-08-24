package aplicativo.treino.Gerador.de.treinos.repository;

import aplicativo.treino.Gerador.de.treinos.domain.user.User;
import aplicativo.treino.Gerador.de.treinos.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

/**
 * Classe de teste para o repositorio
 * @version 1.0
 */
@SpringBootTest
public class UserRepositoryImplTest {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Autowired
    private UserService userService;


    /**
     * acao -> cria um novo usuario
     * verificacao -> verifica se dado email do usuario ele foi criado
     * nessa parte, chamamos o user repo com o metodo find email para vefificar se ele foi salvo
     * e depois chamamos o assertTrue pra verificar se ele deu algo como saida do Optional, no caso, retorna true
     */
    @Test
    public void verificarSeEmailExiste(){

        User user = userService.findOrCreateUser(new User("Karlos", "karlo@email.com"));

        Optional<User> result = userRepository.findEmail(user.getEmail());

        Assertions.assertTrue(result.isPresent());
    }

    /**
     * acao -> nesse caso nao tem porque queremos verificar se um email nao existe
     * verificacao -> passamos um email para verificar se ele existe,
     * como ele nao existe, precisamos verificar se o resultado é vazio
     */
    @Test
    public void verificarSeEmailNaoExiste(){

        Optional<User> result = userRepository.findEmail("gabriel@email.com");

        Assertions.assertTrue(result.isEmpty());
    }
}

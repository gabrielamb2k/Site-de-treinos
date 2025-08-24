package aplicativo.treino.Gerador.de.treinos.service;

import aplicativo.treino.Gerador.de.treinos.domain.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;


    /**
     * Metodo que teste se criou um novo user
     * acao -> cria um novo user
     * verificacao -> verifica se foi criado
     */
    @Test
    public void testCriarUsuario(){

        User newUser = userService.findOrCreateUser(new User("Gabriel", "gabriel@email.com"));

        Optional<String> name= Optional.ofNullable(newUser.getName());
        Optional<String> email = Optional.ofNullable(newUser.getEmail());

        Assertions.assertTrue(name.isPresent());
        Assertions.assertTrue(email.isPresent());
    }



}

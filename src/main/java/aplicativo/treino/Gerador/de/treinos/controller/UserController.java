package aplicativo.treino.Gerador.de.treinos.controller;

import aplicativo.treino.Gerador.de.treinos.domain.User;
import aplicativo.treino.Gerador.de.treinos.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Controller -> camada de iteração com o usuario
 * @version 1.0
 */
@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    /**
     * Exibe a pagina de login
     * @return retorna o nome da view login criada nos templates
     */
    @GetMapping("/login")
    public String paginaLogin(){
        return "login";
    }

    /**
     * Processa os dados do formulariod e login,
     * Encontra ou cria um novo usuario, o armazena na sessao e o redireciona
     * para a pagina principal
     * @param user usuario passado pelo
     * @param httpSession a sessao http armazena o estado do usuario logado
     * @return redireciona para a pagina que vai gerar o treino para ele
     */
    @PostMapping("/login")
    public String login(@ModelAttribute User user, HttpSession httpSession){
        User usuarioLogado =userService.findOrCreateUser(user);
        httpSession.setAttribute("currentUser", usuarioLogado);
        return "redirect:/api/workout";
    }




}

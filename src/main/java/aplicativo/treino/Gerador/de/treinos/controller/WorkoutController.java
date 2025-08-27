package aplicativo.treino.Gerador.de.treinos.controller;

import aplicativo.treino.Gerador.de.treinos.domain.user.User;
import aplicativo.treino.Gerador.de.treinos.domain.workout.Workout;
import aplicativo.treino.Gerador.de.treinos.dto.WorkoutDto;
import aplicativo.treino.Gerador.de.treinos.generator.WorkoutGenerator;
import aplicativo.treino.Gerador.de.treinos.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Classe de interaçao com o usuario, apos ele fazer o login,
 * ele vai passar as informacoes dele para pegarmos um treino para ele
 * @version 1.1
 */
@Controller
@RequestMapping("/workout")
public class WorkoutController {

    private WorkoutGenerator workoutGenerator;
    private UserService userService;

    public WorkoutController(WorkoutGenerator workoutGenerator, UserService userService) {
        this.workoutGenerator = workoutGenerator;
        this.userService=userService;
    }

    @GetMapping("/generator")
    public String showGeneratorPage(HttpSession session, Model model) {
        return "pagina";
    }


    /**
     * Metodo que vai pegar as informacoes do usuario para gerar um treino
     * conforme as necessidades dele
     * postMapping -> serve para enviarmos informacoes
     * @param informacoes
     * @param model
     * @param session vai pegar o usuario atual da session
     * @return pagina do treino gerado
     */
    @PostMapping("/generator")
    public String userInformations(@ModelAttribute WorkoutDto informacoes, Model model, HttpSession session){
        User currentUser = (User) session.getAttribute("currentUser");

        if(currentUser == null){
            return "redirect:/";
        }

        List<Workout> generatedPlan= workoutGenerator.generate(informacoes, currentUser);

        model.addAttribute("workoutPlan", generatedPlan);

        return "treino-gerado";
    }

    /**
     * New feature, adicionado para o usuario poder visualizar o historico
     * de treinos gerados por ele, para caso ele saia da aplicacao e volte,
     * ele tenha salvo o treino gerado anterior
     * getMapping -> porque queremos apenas pegar algo e nao enviar informacoes
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/historico")
    public String userHistorico(HttpSession session, Model model){

        User currentUser = (User) session.getAttribute("currentUser");

        if(currentUser == null){
            return "redirect:/";
        }

        List<Workout> historicoCompleto = userService.workoutList(currentUser);
        Map<String, List<Workout>> treinosAgrupados = historicoCompleto.stream()
                .collect(Collectors.groupingBy(Workout::getDiv));
        model.addAttribute("historicoAgrupado", treinosAgrupados);

        return "historico";
    }


}

package aplicativo.treino.Gerador.de.treinos.controller;

import aplicativo.treino.Gerador.de.treinos.domain.workout.Workout;
import aplicativo.treino.Gerador.de.treinos.dto.WorkoutDto;
import aplicativo.treino.Gerador.de.treinos.generator.WorkoutGenerator;
import aplicativo.treino.Gerador.de.treinos.service.GymWorkoutService;
import aplicativo.treino.Gerador.de.treinos.service.HybridWorkoutService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * Classe de interaçao com o usuario, apos ele fazer o login,
 * ele vai passar as informacoes dele para pegarmos um treino para ele
 * @version 1.0
 */
@Controller
@RequestMapping("/workout")
public class WorkoutController {

    private WorkoutGenerator workoutGenerator;

    public WorkoutController(WorkoutGenerator workoutGenerator) {
        this.workoutGenerator = workoutGenerator;
    }

    @GetMapping("/generator")
    public String showGeneratorPage(HttpSession session, Model model) {
        return "pagina";
    }


    /**
     *  Metodo princinpal do nosso controller de workout, nele vamos
     *  buscar um treino especifico dado as informacoes dele e retornar
     *  uma nova pagina com o treino exibido
     * @param informacoes , as informacoes do treino que ele deseja
     * @param model
     * @return a pagina do treino gerado a partir das infos do user
     */
    @PostMapping("/generator")
    public String userInformations(@ModelAttribute WorkoutDto informacoes, Model model){
        List<Workout> generatedPlan= workoutGenerator.generate(informacoes);

        model.addAttribute("workoutPlan", generatedPlan);

        return "treino-gerado";
    }


}

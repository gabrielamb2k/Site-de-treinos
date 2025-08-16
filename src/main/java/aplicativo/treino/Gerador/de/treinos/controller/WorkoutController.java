package aplicativo.treino.Gerador.de.treinos.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/workout")
public class WorkoutController {


    @GetMapping("/generator")
    public String showGeneratorPage(HttpSession session, Model model) {
        return "pagina";
    }


}

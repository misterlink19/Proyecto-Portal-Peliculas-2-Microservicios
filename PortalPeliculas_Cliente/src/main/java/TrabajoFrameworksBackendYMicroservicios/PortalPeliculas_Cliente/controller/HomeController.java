package TrabajoFrameworksBackendYMicroservicios.PortalPeliculas_Cliente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home", ""})
    public String home(Model model) {
        model.addAttribute("titulo", "Bienvenido al Portal de Películas");
        return "home";
    }
}

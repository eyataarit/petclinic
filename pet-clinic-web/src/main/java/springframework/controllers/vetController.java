package springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.services.VetService;

@Controller
public class vetController {
    private final VetService vetService;

    public vetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets"})
    public String listVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}

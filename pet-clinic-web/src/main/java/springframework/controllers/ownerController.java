package springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class ownerController {

    private final OwnerService ownerService;
    // declare it final so that object can never be changed
    // spring will inject it through the constructor
    // so when this controller gets instantiated
    public ownerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    // best practice : constructor injection is the preferred way to work with injection properties


    //  either that way or just write in here : @RequestMapping("/owners")
    @RequestMapping("")
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());
        //System.out.println(model.getAttribute("owners").getClass().getName());
        return "owners/index";
    }
}

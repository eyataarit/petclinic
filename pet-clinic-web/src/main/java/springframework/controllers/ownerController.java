package springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class ownerController {
  //  @RequestMapping("/owners")
    @RequestMapping("")
    public String listOwners(){
        return "owners/index";
    }
}

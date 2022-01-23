package webproject.blagodem.contollers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import webproject.blagodem.entities.Application;
import webproject.blagodem.entities.Disabled;
import webproject.blagodem.entities.User;
import webproject.blagodem.entities.Volunteer;
import webproject.blagodem.repo.*;

import java.security.Principal;

@Controller
@RequestMapping("/blagodem/main")
public class MainController {

    @Autowired
    private DisabledRepo disabledRepo;

    @Autowired
    private VolunteerRepo volunteerRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ApplicationRepo applicationRepo;

    @Autowired
    private RequestRepo requestRepo;

    @GetMapping
    public String showMainPage(Model model, Principal principal){
        String email = principal.getName();
        Disabled disabled = disabledRepo.findByEmail(email);
        Volunteer volunteer = volunteerRepo.findByEmail(email);
        User user = userRepo.findByEmail(email);
//        if(disabled != null) {
//            model.addAttribute("user", disabled);
//        }
//        if(volunteer != null) {
//            model.addAttribute("user", volunteer);
//        }
        if (user != null) {
            model.addAttribute("user", user);
        }
        return "main";
    }
}

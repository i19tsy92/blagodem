package webproject.blagodem.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import webproject.blagodem.entities.User;
import webproject.blagodem.repo.UserRepo;

import java.util.Map;

@Controller
@RequestMapping("/blagodem/login")
public class LoginController {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public String showLogin(){
        return "login";
    }
}


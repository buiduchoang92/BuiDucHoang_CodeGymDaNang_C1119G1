package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailControlles {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public EmailControlles(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping("/check")
    String getindex(){
        return "index";
    }
    @PostMapping("/validate")
    String checkvalidete(@RequestParam(name = "email")String email, Model model){
        boolean validete = this.validate(email);
        if (!validete){
            model.addAttribute("message","dia chi email khong hop le");
            return "index";
        }
            model.addAttribute("email",email);
        return "success";
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

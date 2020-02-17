package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichControllers {
    @GetMapping("/greeting")
    public String homePage() {
        return "index";
    }

    @PostMapping("/choose")
    public ModelAndView checkChouse(@RequestParam(required = false, name = "list") String[] list) {
        StringBuilder message = new StringBuilder();
        ModelAndView modelAndView = new ModelAndView("index", "l", list);
        if (list != null) {
            message = new StringBuilder("Checked spices: ");
            for (String spice : list) {
                if (spice != null) {
                    message.append(spice).append(", ");
                }
            }
//            message.replace(message.length() - 2, message.length(), "");
        } else {
            message.append("Non-exist");
        }
        modelAndView.addObject("massage", message);
        return modelAndView;
    }
}


package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class Exchange {
    @GetMapping("/greeting")
    public String greeting() {
        return "index";
    }
    @RequestMapping(value = "/exchange", method = RequestMethod.POST)
    public ModelAndView Tinhtoan(HttpServletRequest request) {
    float rates = Float.parseFloat(request.getParameter("rates"));
    float usd = Float.parseFloat(request.getParameter("usd"));
    float vnd = rates*usd;
    ModelAndView modelAndView = new ModelAndView("index","vnd",vnd);
    return modelAndView;
    }
}
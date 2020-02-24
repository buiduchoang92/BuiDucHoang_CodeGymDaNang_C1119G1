package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class dictionaryGreeting {
    @GetMapping(value = "/greeting")
    public String homePage(){
        return "index";
    }
    @RequestMapping(value = "/1",method = RequestMethod.POST)
    public ModelAndView translate(@RequestParam("englisk")String englisk){
        Map<String ,String> book = new HashMap<>();
        book.put("hello","xin chao");
        book.put("goodbye","tam biet");
        book.put("dog","cho");
        if (englisk==null){
         String temp = ("do not enter");
            return new ModelAndView("index","masage1",temp);
        }else {
          String ketqua =  book.get(englisk);
          return new ModelAndView("index","masage",ketqua);
        }
    }
}

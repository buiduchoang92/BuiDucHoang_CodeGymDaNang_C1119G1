package controllers;

import model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("operator", "+");
        return "calculatorForm";
    }

    @RequestMapping ("/")
    public String index(
            @RequestParam ("number1")String leftOperand,
            @RequestParam ("operator")String operator,
            @RequestParam ("number2")String rightOperand,
            Model model
    ) {
        
        double leftNumber;
        double rightNumber;

        try {
            leftNumber = Double.parseDouble(leftOperand);
        } catch (NumberFormatException ex) {
            leftNumber = 0;
        }

        try {
            rightNumber = Double.parseDouble(rightOperand);
        } catch (NumberFormatException ex) {
            rightNumber = 0;
        }
        Calculator calculator = new Calculator(
                leftNumber,
                rightNumber,
                operator
        );

        double result = calculator.calculateResult();

        model.addAttribute("leftOperand", leftNumber);
        model.addAttribute("operator", operator);
        model.addAttribute("rightOperand", rightNumber);
        model.addAttribute("result", result);
        //sao không đổ dữ liệu qua views được vậy anh? e dipub ra được giá trị rồi.
        return "calculatorForm";
    }
}


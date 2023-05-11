package com.example.springcalc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculateController {

    @GetMapping ("/calc")
    public String calculateForm(Model model){
        model.addAttribute("calculate", new Calculate());
        return "calculate";
    }

    @PostMapping("/calculate")
    public String calculateSubmit(@ModelAttribute Calculate calculate, Model model) {
        switch (calculate.getOperation()) {
            case "+":
                calculate.setResult(calculate.getA() + calculate.getB());
                break;
            case "-":
                calculate.setResult(calculate.getA() - calculate.getB());
                break;
            case "*":
                calculate.setResult(calculate.getA() * calculate.getB());
                break;
            case "/":
                calculate.setResult((int) calculate.getA() / calculate.getB());
                break;
            default:
                calculate.setResult(0);
        }
        model.addAttribute("calculate", calculate);
        return "calc_result";
    }
}

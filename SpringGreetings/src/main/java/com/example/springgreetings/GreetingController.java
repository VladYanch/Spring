package com.example.springgreetings;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }

    @GetMapping("first/goodbye")
    public String goodByePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              Model model) {
        model.addAttribute("message", "Goodbye, " + name + " " + surname);
        return "first/goodbye";
    }

    @GetMapping("first/goodbye.html")
    public String goodByePageHTML(@RequestParam(value = "name", required = false) String name,
                              Model model) {
        model.addAttribute("message", "Goodbye, " + name + "!");
        return "first/goodbye";
    }

    @GetMapping("first/hello")
    public String helloPage(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        model.addAttribute("message", "Hello, " + name + "!");
        return "first/hello";
    }
}
package spring.controllers.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
//@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
//        System.out.println("Hello, "+name+" "+surname);
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Hello</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "Hello!\n" +
                "<a href=\"/first/goodbye\">Say GoodBye!</a>\n" +
                "</body>\n" +
                "</html>";
    }

    @GetMapping("/goodbye")
    public String goodByePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              Model model) {
        model.addAttribute("message","Goodbye, "+ name+" " +surname);
//        System.out.println("Goodbye, "+ name+" " +surname);
//        return new ModelAndView("goodbye");
//        return "first/goodbye";
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Goodbye</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "Goodbye!\n" +
                "<a href=\"/first/hello\">Say Hello!</a>\n" +
//                "<p th:text="${message}"/>\n" +
                "</body>\n" +
                        "</html>";
    }
}

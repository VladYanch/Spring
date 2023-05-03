package first.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.SpringApplication;
@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }

    public static void main(String[] args) {
//        SpringApplication.run(HelloController.class, args);
    }
}

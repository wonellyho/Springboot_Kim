package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // hello 라는 url에 매칭
    public String hello(Model model){  // spring이 model에다 addAtrriubute로 더해준다.
        // data: hello!!
        model.addAttribute("data","spring!!");
        return "hello"; // resources의 templates의 hello.html을 실행해라

    }
}

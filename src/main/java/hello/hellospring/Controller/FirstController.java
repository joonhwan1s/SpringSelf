package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

public class FirstController {

    @Controller
    public String hello(Model model){
        model.addAttribute("data","hello");
        return "hello";1
    }

}

package guru.springframework.didemo;

import org.springframework.stereotype.Controller;
import guru.springframework.didemo.services.GreetIngService;

@Controller
public class MyController {

    private GreetIngService greetingService;

    public MyController(GreetIngService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello(){
        System.out.println("MyController says"+greetingService.sayHello());
    }
}

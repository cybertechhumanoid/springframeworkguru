package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en","default"})
public class EnglishGreetIngServiceImpl implements GreetIngService {

    @Override
    public String sayHello(){
        return "Hello in English";
    }
}

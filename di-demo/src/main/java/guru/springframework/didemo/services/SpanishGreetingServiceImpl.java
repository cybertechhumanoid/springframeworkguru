package guru.springframework.didemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Profile("es")
public class SpanishGreetingServiceImpl implements GreetIngService {
    @Override
    public String sayHello() {
       return "Ola from Spanish";
    }
}

package guru.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		System.out.println("#############################################");
		MyController myController = (MyController)ctx.getBean("myController");
		myController.sayHello();
		System.out.println("#############################################");


	}
}

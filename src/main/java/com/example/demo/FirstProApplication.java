package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProApplication.class, args);
	   // in above code .... a container is initialized which creates all the objects. to selectively get particular objects we use @COMPONENT
		// spring framework is injection object into our application. // DEPENDENCY INJECTION (also refer alien.java component part)
	    alien a = context.getBean(alien.class);
		// beans are objects in container.
		a.show();
	}

}
// alien-->laptop (dependent)
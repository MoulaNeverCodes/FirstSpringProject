package com.example.FirstSpringBootProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringBootProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringBootProjApplication.class, args);

		System.out.println("Starting Boot...");
		Alien obj = context.getBean(Alien.class);
		obj.show();
		laptop obj2 = context.getBean(laptop.class);
		obj2.Compiling();


	}

}

package com.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootActuatorApplication.class, args);
		System.out.println("Hellow World!!!");
	}

}

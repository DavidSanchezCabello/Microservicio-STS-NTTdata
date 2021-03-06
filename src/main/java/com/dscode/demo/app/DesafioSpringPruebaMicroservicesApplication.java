package com.dscode.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DesafioSpringPruebaMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringPruebaMicroservicesApplication.class, args);
	}

}
